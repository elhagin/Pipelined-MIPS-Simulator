package stages;

import pipelineRegisters.IFIDReg;
import mainUnits.Simulator;

public class InstructionFetch {	
	
	public static void action()
	{
		if (Simulator.getInstructionMemory().size() - 1 < Simulator.getPC())
		{
			return;
		}
		String currentInstruction = Simulator.getInstructionMemory().get(Simulator.getPC());
		Simulator.setPC(Simulator.getPC()+1);
		IFIDReg.setInstruction(currentInstruction);
		IFIDReg.setPC(Simulator.getPC());
	}
}
 	 	