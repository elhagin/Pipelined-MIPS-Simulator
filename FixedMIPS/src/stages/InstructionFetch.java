package stages;

import pipelineRegisters.IFIDReg;
import mainUnits.Simulator;

public class InstructionFetch implements Runnable
{	

	public void run()
	{
		if (Simulator.getI() == 1 && Simulator.getClock() > 1)
			return;
		String currentInstruction = Simulator.getInstructionMemory()[Simulator.getPC()];
		if (currentInstruction.equals("DONE"))
			return;
		Simulator.setPC(Simulator.getPC()+1);
		synchronized(IFIDReg.class)
		{
			try {
				Simulator.getLatch1().await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			IFIDReg.setInstruction(currentInstruction);
			IFIDReg.setPC(Simulator.getPC());
			Simulator.getLatch1().reset();
		}
	}
}
