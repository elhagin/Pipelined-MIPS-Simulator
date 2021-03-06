package stages;

import mainUnits.CU;
import mainUnits.RegisterFile;
import mainUnits.Simulator;
import pipelineRegisters.IDEXReg;
import pipelineRegisters.IFIDReg;

public class InstructionDecode implements Runnable
{	
	public void run()
	{
		if (Simulator.getI() == 1 && Simulator.getClock() > 2)
			return;
		int PC;
		String instruction;
		synchronized(IFIDReg.class)
		{
			PC = IFIDReg.getPC();
			instruction = IFIDReg.getInstruction();
			Simulator.getLatch1().countDown();
		}
		CU.inputOpCode(instruction.substring(0, 6));
		int rs = RegisterFile.read(instruction.substring(6, 11));
		int rt = RegisterFile.read(instruction.substring(11, 16));
		synchronized(Simulator.getiDEX())
		{
			try {
				Simulator.getLatch2().await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			IDEXReg.setPC(PC);
			IDEXReg.setMemToReg(CU.getMemToReg());
			IDEXReg.setBranch(CU.getBranch());
			IDEXReg.setAluOp0(CU.getALUOp0());
			IDEXReg.setAluOp1(CU.getALUOp1());
			IDEXReg.setAluSrc(CU.getALUSrc());
			IDEXReg.setRegDst(CU.getRegDst());
			IDEXReg.setRegWrite(CU.getRegWrite());
			IDEXReg.setMemWrite(CU.getMemWrite());
			IDEXReg.setMemRead(CU.getMemRead());
			IDEXReg.setRegData1(rs);
			IDEXReg.setRegData2(rt);
			IDEXReg.setRd(instruction.substring(16, 21));
			IDEXReg.setRt(instruction.substring(11, 16));
			IDEXReg.setLast16Bits(instruction.substring(16));
			Simulator.getLatch2().reset();
		}
	}
}
