package stages;

import mainUnits.RegisterFile;
import mainUnits.Simulator;
import pipelineRegisters.MemWBReg;

public class WriteBack implements Runnable
{
	public void run()
	{
		if (Simulator.getI() == 1 && Simulator.getClock() > 5)
			return;
		int aluResult;
		String destinationReg;
		String memoryData;
		int memToReg;
		int regWrite;
		int data;
		synchronized(MemWBReg.class)
		{
			aluResult = MemWBReg.getAluResult();
			destinationReg = MemWBReg.getDestinationReg();
			memoryData = MemWBReg.getMemoryData();
			memToReg = MemWBReg.getMemToReg();
			regWrite = MemWBReg.getRegWrite();
			Simulator.getLatch4().countDown();
		}

		if (memToReg == 0)
		{
			if (memoryData != null)
				data = Integer.parseInt(memoryData, 2);
			else
				data = 0;
		}
		else
			data = aluResult;

		if (regWrite == 1)
		{
			RegisterFile.write(destinationReg, data);
		}
	}
}
