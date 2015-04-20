
public class CU {
	private int Branch;
	private int RegDst;
	private int MemRead;
	private int MemToReg;
	private int ALUOp1;
	private int ALUOp0;
	private int MemWrite;
	private int ALUSrc;
	private int RegWrite;
	
	public CU(){
		this.setALUOp1(0);
		this.setALUSrc(0);
		this.setBranch(0);
		this.setMemRead(0);
		this.setMemToReg(0);
		this.setMemWrite(0);
		this.setRegDst(0);
		this.setRegWrite(0);
	}
	
	public void inputOpCode(int x){
		switch(x){
			case 0x00: this.setRegDst(1);this.setRegWrite(1);this.setALUOp1(1); //R-format
			case 0x20:;//lb 
			case 0x08:;//addi
			case 0x23:;//lw
			case 0x24:;//lbu 
			case 0x2B:;//sw
			case 0x28:;//sb
			case 0x0F:;//lui
			case 0x02:;//j
			case 0x04:;//beq
			case 0x05:;//bne
			case 0x03:;//jal
		}
	}
	public int getBranch() {
		return Branch;
	}
	public void setBranch(int branch) {
		Branch = branch;
	}
	public int getRegDst() {
		return RegDst;
	}
	public void setRegDst(int regDst) {
		RegDst = regDst;
	}
	public int getMemRead() {
		return MemRead;
	}
	public void setMemRead(int memRead) {
		MemRead = memRead;
	}
	public int getMemToReg() {
		return MemToReg;
	}
	public void setMemToReg(int memToReg) {
		MemToReg = memToReg;
	}
	public int getALUOp1() {
		return ALUOp1;
	}
	public void setALUOp1(int aLUOp1) {
		ALUOp1 = aLUOp1;
	}
	public int getMemWrite() {
		return MemWrite;
	}
	public void setMemWrite(int memWrite) {
		MemWrite = memWrite;
	}
	public int getALUSrc() {
		return ALUSrc;
	}
	public void setALUSrc(int aLUSrc) {
		ALUSrc = aLUSrc;
	}
	public int getRegWrite() {
		return RegWrite;
	}
	public void setRegWrite(int regWrite) {
		RegWrite = regWrite;
	}

}
