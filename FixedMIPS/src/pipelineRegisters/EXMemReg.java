package pipelineRegisters;

public class EXMemReg {
	private static int memToReg;
	private static int branch;
	private static int regWrite;
	private static int memWrite;
	private static int memRead;
	private static int newPC;
	private static int zeroFlag;
	private static int aluResult;
	private static int regData2;
	private static String destinationReg;
	
	public static int getMemToReg() {
		return memToReg;
	}
	public static void setMemToReg(int memToReg) {
		EXMemReg.memToReg = memToReg;
	}
	public static int getBranch() {
		return branch;
	}
	public static void setBranch(int branch) {
		EXMemReg.branch = branch;
	}
	public static int getRegWrite() {
		return regWrite;
	}
	public static void setRegWrite(int regWrite) {
		EXMemReg.regWrite = regWrite;
	}
	public static int getMemWrite() {
		return memWrite;
	}
	public static void setMemWrite(int memWrite) {
		EXMemReg.memWrite = memWrite;
	}
	public static int getMemRead() {
		return memRead;
	}
	public static void setMemRead(int memRead) {
		EXMemReg.memRead = memRead;
	}
	public static int getNewPC() {
		return newPC;
	}
	public static void setNewPC(int newPC) {
		EXMemReg.newPC = newPC;
	}
	public static int getZeroFlag() {
		return zeroFlag;
	}
	public static void setZeroFlag(int zeroFlag) {
		EXMemReg.zeroFlag = zeroFlag;
	}
	public static int getAluResult() {
		return aluResult;
	}
	public static void setAluResult(int aluResult) {
		EXMemReg.aluResult = aluResult;
	}
	public static int getRegData2() {
		return regData2;
	}
	public static void setRegData2(int regData2) {
		EXMemReg.regData2 = regData2;
	}
	public static String getDestinationReg() {
		return destinationReg;
	}
	public static void setDestinationReg(String destinationReg) {
		EXMemReg.destinationReg = destinationReg;
	}

}
