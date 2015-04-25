package stages;

import mainUnits.ALU;
import mainUnits.Simulator;
import pipelineRegisters.EXMemReg;
import pipelineRegisters.IDEXReg;

public class InstructionExecute implements Runnable
{
	public void run()
	{
		if (Simulator.getI() == 1 && Simulator.getClock() > 3)
			return;
		int input2;
		int regData1;
		int regData2;
		int PC;
		int ALUsrc;
		String aluOp;
		String last16;
		int memToReg;
		int branch;
		int regWrite;
		int memWrite;
		int memRead;
		int regDst;
		String rt;
		String rd;
		synchronized(IDEXReg.class)
		{
			regData1 = IDEXReg.getRegData1();
			regData2 = IDEXReg.getRegData2();
			PC = IDEXReg.getPC();
			ALUsrc = IDEXReg.getAluSrc();
			aluOp = "" + IDEXReg.getAluOp1() + IDEXReg.getAluOp0();
			last16 = IDEXReg.getLast16Bits();
			memToReg = IDEXReg.getMemToReg();
			branch = IDEXReg.getBranch();
			regWrite = IDEXReg.getRegWrite();
			memWrite = IDEXReg.getMemWrite();
			memRead = IDEXReg.getMemRead();
			regDst = IDEXReg.getRegDst();
			rt = IDEXReg.getRt();
			rd = IDEXReg.getRd();
			Simulator.getLatch2().countDown();
		}

		if (ALUsrc == 0)
		{
			if (last16.substring(10).equals("000000"))
				input2 = Integer.parseInt(last16.substring(21, 26), 2);
			else
				input2 = regData2;
		}
		else
			input2 = Integer.parseInt(last16, 2);

		ALU.setInput1(regData1);
		ALU.setInput2(input2);
		String aluControl = ALU.generateControl(last16.substring(10), aluOp);
		ALU.executeOperation(aluControl);

		synchronized(Simulator.geteXMem())
		{
			try {
				Simulator.getLatch3().await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			EXMemReg.setAluResult(ALU.getOutput());
			EXMemReg.setZeroFlag(ALU.getZeroFlag());
			EXMemReg.setMemToReg(memToReg);
			EXMemReg.setBranch(branch);
			EXMemReg.setRegWrite(regWrite);
			EXMemReg.setMemWrite(memWrite);
			EXMemReg.setMemRead(memRead);
			EXMemReg.setRegData2(regData2);
			EXMemReg.setNewPC(PC + Integer.parseInt(last16, 2));
			if (regDst == 0)
				EXMemReg.setDestinationReg(rt);
			else
				EXMemReg.setDestinationReg(rd);
			Simulator.getLatch3().reset();
		}
	}
}
