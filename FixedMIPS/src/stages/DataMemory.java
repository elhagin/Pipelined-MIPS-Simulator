package stages;

import mainUnits.Simulator;
import pipelineRegisters.EXMemReg;
import pipelineRegisters.MemWBReg;

public class DataMemory implements Runnable
{
	public void run()
	{
		if (Simulator.getI() == 1 && Simulator.getClock() > 4)
			return;
		int regWrite;
		int zeroFlag;
		int branch;
		int memWrite;
		int memRead;
		int aluResult;
		int regData2;
		int memToReg;
		String destinationReg;
		int newPC;
		synchronized(EXMemReg.class)
		{
			regWrite = EXMemReg.getRegWrite();
			zeroFlag = EXMemReg.getZeroFlag();
			branch = EXMemReg.getBranch();
			memWrite = EXMemReg.getMemWrite();
			memRead = EXMemReg.getMemRead();
			aluResult = EXMemReg.getAluResult();
			regData2 = EXMemReg.getRegData2();
			memToReg = EXMemReg.getMemToReg();
			destinationReg = EXMemReg.getDestinationReg();
			newPC = EXMemReg.getNewPC();
			Simulator.getLatch3().countDown();
		}

		if ((branch & zeroFlag) == 1)
			Simulator.setPC(newPC);
		String readData = "";
		if (memWrite == 1)
		{
			String data = Integer.toBinaryString(regData2);
			while (data.length() < 32)
				data = "0" + data;
			Simulator.getDataMemory()[aluResult] = data;
		}
		if (memRead == 1)
		{
			readData = Simulator.getDataMemory()[aluResult];
		}

		synchronized(Simulator.getMemWB())
		{
			try {
				Simulator.getLatch4().await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			MemWBReg.setAluResult(aluResult);
			MemWBReg.setMemoryData(readData);
			MemWBReg.setMemToReg(memToReg);
			MemWBReg.setDestinationReg(destinationReg);
			MemWBReg.setRegWrite(regWrite);
			Simulator.getLatch4().reset();
		}
	}     
}
