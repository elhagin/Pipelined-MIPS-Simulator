package memory;

public class InstructionFetch {
	public InstructionFetch(){
	}
	public int action(){
			Simulator.setPC(Simulator.getPC()+4);
			return Simulator.getMemory.get(Simulator.getPC()-4);
	}
}
