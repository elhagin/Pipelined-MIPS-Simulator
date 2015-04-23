package pipelineRegisters;

public class MemWBReg {
	private int regWrite;
	private int memToReg;
	private int regDestination;

	public MemWBReg() {
		super();
	}

	public int getRegWrite() {
		return regWrite;
	}

	public void setRegWrite(int regWrite) {
		this.regWrite = regWrite;
	}

	public int getMemToReg() {
		return memToReg;
	}

	public void setMemToReg(int memToReg) {
		this.memToReg = memToReg;
	}

	public int getRegDestination() {
		return regDestination;
	}

	public void setRegDestination(int regDestination) {
		this.regDestination = regDestination;
	}

}
