package pipelineRegisters;

public class IDEXReg
{
	private int memToReg;
	private int branch;
	private int aluOp;
	private int aluSrc;
	private int PC;
	private int regData1;
	private int regData2;
	private String last16Bits;
	private String 
	
	public int getMemToReg() {
		return memToReg;
	}
	public void setMemToReg(int memToReg) {
		this.memToReg = memToReg;
	}
	public int getBranch() {
		return branch;
	}
	public void setBranch(int branch) {
		this.branch = branch;
	}
	public int getAluOp() {
		return aluOp;
	}
	public void setAluOp(int aluOp) {
		this.aluOp = aluOp;
	}
	public int getAluSrc() {
		return aluSrc;
	}
	public void setAluSrc(int aluSrc) {
		this.aluSrc = aluSrc;
	}
	
}
