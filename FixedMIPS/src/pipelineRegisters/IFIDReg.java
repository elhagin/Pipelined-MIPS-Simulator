package pipelineRegisters;

public class IFIDReg {
	private static String instruction;
	private static int PC;
	
	public static String getInstruction() {
		return instruction;
	}
	public static void setInstruction(String instruction) {
		IFIDReg.instruction = instruction;
	}
	public static int getPC() {
		return PC;
	}
	public static void setPC(int pC) {
		PC = pC;
	}
}
