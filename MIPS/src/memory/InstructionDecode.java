package memory;

public class InstructionDecode {
	private String InstructionCU;
	private String InstructionReadRegister1;
	private String InstructionReadRegister2;
	private String InstructionWriteRegisterBeforeMux;
	private String InstructionSignExtend;
	public  InstructionDecode(){
	}
	public  void action(){
		String[] Instructions = Simulator.getIf().action().split(""); 
		String Instruction1 = Instructions.toString();
		setInstructionCU(Instruction1.substring(0, 5));
		setInstructionReadRegister1(Instruction1.substring(6, 10));
		setInstructionReadRegister2(Instruction1.substring(11, 15));
		setInstructionWriteRegisterBeforeMux(Instruction1.substring(16, 20));
		setInstructionSignExtend(Instruction1.substring(16, 31));
	}
	public String getInstructionCU() {
		return InstructionCU;
	}
	public void setInstructionCU(String instructionCU) {
		InstructionCU = instructionCU;
	}
	public String getInstructionReadRegister1() {
		return InstructionReadRegister1;
	}
	public void setInstructionReadRegister1(String instructionReadRegister1) {
		InstructionReadRegister1 = instructionReadRegister1;
	}
	public String getInstructionReadRegister2() {
		return InstructionReadRegister2;
	}
	public void setInstructionReadRegister2(String instructionReadRegister2) {
		InstructionReadRegister2 = instructionReadRegister2;
	}
	public String getInstructionWriteRegisterBeforeMux() {
		return InstructionWriteRegisterBeforeMux;
	}
	public void setInstructionWriteRegisterBeforeMux(
			String instructionWriteRegisterBeforeMux) {
		InstructionWriteRegisterBeforeMux = instructionWriteRegisterBeforeMux;
	}
	public String getInstructionSignExtend() {
		return InstructionSignExtend;
	}
	public void setInstructionSignExtend(String instructionSignExtend) {
		InstructionSignExtend = instructionSignExtend;
	}
}
