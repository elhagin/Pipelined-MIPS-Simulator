package memory;

public class datamemory {
	private CU cu = new CU();
	private String OutputReadData;
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
	public String getOutputReadData() {
		return OutputReadData;
	}
	public void setOutputReadData(String outputReadData) {
		OutputReadData = outputReadData;
	}
     
}
