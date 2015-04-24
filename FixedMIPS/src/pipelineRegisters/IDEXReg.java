package pipelineRegisters;


public class IDEXReg
{
	private static int memToReg;
	private static int branch;
	private static int aluOp1;
	private static int aluOp0;
	private static int aluSrc;
	private static int regDst;
	private static int regWrite;
	private static int memWrite;
	private static int memRead;
	private static int PC;
	private static int regData1;
	private static int regData2;
	private static String last16bits;
	private static String rt;
	private static String rd;
	
	public IDEXReg()
	{
		
	}

	public static int getMemToReg() {
		return memToReg;
	}

	public static void setMemToReg(int memToReg) {
		IDEXReg.memToReg = memToReg;
	}

	public static int getBranch() {
		return branch;
	}

	public static void setBranch(int branch) {
		IDEXReg.branch = branch;
	}

	public static int getAluSrc() {
		return aluSrc;
	}

	public static void setAluSrc(int aluSrc) {
		IDEXReg.aluSrc = aluSrc;
	}

	public static int getPC() {
		return PC;
	}

	public static void setPC(int pC) {
		PC = pC;
	}

	public static int getRegData1() {
		return regData1;
	}

	public static void setRegData1(int regData1) {
		IDEXReg.regData1 = regData1;
	}

	public static int getRegData2() {
		return regData2;
	}

	public static void setRegData2(int regData2) {
		IDEXReg.regData2 = regData2;
	}
	
	public static String getRt() {
		return rt;
	}

	public static void setRt(String rt) {
		IDEXReg.rt = rt;
	}

	public static String getRd() {
		return rd;
	}

	public static void setRd(String rd) {
		IDEXReg.rd = rd;
	}

	public static int getRegDst() {
		return regDst;
	}

	public static void setRegDst(int regDst) {
		IDEXReg.regDst = regDst;
	}

	public static int getRegWrite() {
		return regWrite;
	}

	public static void setRegWrite(int regWrite) {
		IDEXReg.regWrite = regWrite;
	}

	public static int getMemWrite() {
		return memWrite;
	}

	public static void setMemWrite(int memWrite) {
		IDEXReg.memWrite = memWrite;
	}

	public static int getMemRead() {
		return memRead;
	}

	public static void setMemRead(int memRead) {
		IDEXReg.memRead = memRead;
	}

	public static int getAluOp1() {
		return aluOp1;
	}

	public static void setAluOp1(int aluOp1) {
		IDEXReg.aluOp1 = aluOp1;
	}

	public static int getAluOp0() {
		return aluOp0;
	}

	public static void setAluOp0(int aluOp0) {
		IDEXReg.aluOp0 = aluOp0;
	}

	public static String getLast16Bits() {
		return last16bits;
	}

	public static void setLast16Bits(String last16bits) {
		IDEXReg.last16bits = last16bits;
	}
}
