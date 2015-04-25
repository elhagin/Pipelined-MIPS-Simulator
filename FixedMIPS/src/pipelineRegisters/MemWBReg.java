package pipelineRegisters;

public class MemWBReg {
	private static int regWrite;
	private static int memToReg;
	private static String destinationReg;
	private static String memoryData;
	private static int aluResult;
	
	public static int getRegWrite() {
		return regWrite;
	}
	public static void setRegWrite(int regWrite) {
		MemWBReg.regWrite = regWrite;
	}
	public static int getMemToReg() {
		return memToReg;
	}
	public static void setMemToReg(int memToReg) {
		MemWBReg.memToReg = memToReg;
	}

	public static int getAluResult() {
		return aluResult;
	}
	public static void setAluResult(int aluResult) {
		MemWBReg.aluResult = aluResult;
	}
	public static String getMemoryData() {
		return memoryData;
	}
	public static void setMemoryData(String memoryData) {
		MemWBReg.memoryData = memoryData;
	}
	public static String getDestinationReg() {
		return destinationReg;
	}
	public static void setDestinationReg(String destinationReg) {
		MemWBReg.destinationReg = destinationReg;
	}
}
