package stages;

import mainUnits.RegisterFile;
import pipelineRegisters.MemWBReg;

public class WriteBack
{
	public void action()
	{
		int aluResult = MemWBReg.getAluResult();
		String destinationReg = MemWBReg.getDestinationReg();
		String memoryData = MemWBReg.getMemoryData();
		int memToReg = MemWBReg.getMemToReg();
		int regWrite = MemWBReg.getRegWrite();
		int data;
		
		if (memToReg == 0)
			data = Integer.parseInt(memoryData, 2);
		else
			data = aluResult;
		
		if (regWrite == 1)
		{
			RegisterFile.write(destinationReg, data);
		}
	}
}
