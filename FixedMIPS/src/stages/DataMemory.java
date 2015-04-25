package stages;

import mainUnits.Simulator;
import pipelineRegisters.EXMemReg;
import pipelineRegisters.MemWBReg;

public class DataMemory {

     public void action()
     {
    	 int regWrite = EXMemReg.getRegWrite();
    	 int zeroFlag = EXMemReg.getZeroFlag();
    	 int branch = EXMemReg.getBranch();
    	 int memWrite = EXMemReg.getMemWrite();
    	 int memRead = EXMemReg.getMemRead();
    	 int aluResult = EXMemReg.getAluResult();
    	 int regData2 = EXMemReg.getRegData2();
    	 int memToReg = EXMemReg.getMemToReg();
    	 String destinationReg = EXMemReg.getDestinationReg();
    	 int newPC = EXMemReg.getNewPC();
    	 
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
    	 
    	 MemWBReg.setAluResult(aluResult);
    	 MemWBReg.setMemoryData(readData);
    	 MemWBReg.setMemToReg(memToReg);
    	 MemWBReg.setDestinationReg(destinationReg);
    	 MemWBReg.setRegWrite(regWrite);
     }     
}
