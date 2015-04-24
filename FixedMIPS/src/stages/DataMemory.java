package stages;

import mainUnits.CU;
import mainUnits.Simulator;

public class DataMemory {
	private String OutputReadData;
     public DataMemory(){
    	 OutputReadData = "";
     }
     public String ReadDataFromMemory(int x){
    	 return Simulator.getDataMemory().get(x);
     }
     public void action(int InputAddress, String InputWriteData){
    	 if(CU.getMemWrite() == 1)
    	    Simulator.getDataMemory().set(InputAddress,InputWriteData);
    	 else{
    		 if(CU.getMemRead() == 1)
    		    this.OutputReadData = ReadDataFromMemory(InputAddress);
    	 }
     }
	public String getOutputReadData() {
		return OutputReadData;
	}
	public void setOutputReadData(String outputReadData) {
		OutputReadData = outputReadData;
	}
     
}
