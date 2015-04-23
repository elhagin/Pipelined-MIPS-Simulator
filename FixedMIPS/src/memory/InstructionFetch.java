package memory;

import mainUnits.Simulator;

public class InstructionFetch {
	public InstructionFetch(){
	}
	public String action(){
			Simulator.setPC(Simulator.getPC()+1);
			return Simulator.getInstructionMemory().get(Simulator.getPC()-1);
	}
}
 	 	