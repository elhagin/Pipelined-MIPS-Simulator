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
		String currentInstruction = Simulator.getInstructionMemory().get(Simulator.getPC());
		Simulator.setPC(Simulator.getPC()+1);
		Simulator.getiFID().setInstruction(currentInstruction);
		Simulator.getiFID().setPC(Simulator.getPC());
		return currentInstruction;
	}
}
 	 	