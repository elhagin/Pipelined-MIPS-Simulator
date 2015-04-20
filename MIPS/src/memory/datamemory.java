package memory;

import java.util.ArrayList;

public class datamemory {
	private CU cu = new CU();
	private String OutputReadData;
	ArrayList x = new ArrayList (); 
     public datamemory(){
    	 OutputReadData = "";
     }
     public String ReadDataFromMemory(int x){
    	 return Simulator.getMemory().get(x);
     }
     public void action(int InputAddress,  String InputWriteData){
    	 if(cu.getMemWrite() == 1)
    	    Simulator.getMemory().set(InputAddress,InputWriteData);
    	 else{
    		 if(cu.getMemRead() == 1)
    		    this.OutputReadData = ReadDataFromMemory(InputAddress);
    	 }
     }
     
}
