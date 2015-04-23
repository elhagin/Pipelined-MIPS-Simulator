package memory;

import mainUnits.Simulator;

public class InstructionFetch {
	public InstructionFetch()
	{}
	
	public String action()
	{
		if (Simulator.getInstructionMemory().size() - 1 < Simulator.getPC())
		{
			return "program_done";
		}
		Simulator.setPC(Simulator.getPC()+1);
		return Simulator.getInstructionMemory().get(Simulator.getPC()-1);
	}
}
 	 	