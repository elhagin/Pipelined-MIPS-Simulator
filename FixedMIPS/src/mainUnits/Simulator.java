package mainUnits;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import pipelineRegisters.EXMemReg;
import pipelineRegisters.IDEXReg;
import pipelineRegisters.IFIDReg;
import pipelineRegisters.MemWBReg;
import stages.InstructionDecode;
import stages.InstructionFetch;

public class Simulator {
	private static int PC;
	private static InstructionFetch fetchUnit ;
	private static InstructionDecode decodeUnit ;
	private static ArrayList <String> dataMemory;
	private static ArrayList<String> instructionMemory;
	private static CU controlUnit;
	private static Reader r;
	private static HashMap<String, Integer> labels;
	private static HashMap<String, Integer> declarations;
	private static IDEXReg iDEX;
	private static IFIDReg iFID;
	private static EXMemReg eXMem;
	private static MemWBReg memWB;
	
	public static int getPC() {
		return PC;
	}

	public static void setPC(int pC) {
		Simulator.PC = pC;
	}

	public static Reader getR() {
		return r;
	}

	public static void setR(Reader r) {
		Simulator.r = r;
	}

	public Simulator(){
		PC = 0;
		fetchUnit = new InstructionFetch();
		decodeUnit = new InstructionDecode();
		dataMemory = new ArrayList <String>();
		instructionMemory = new ArrayList <String>();
		labels = new HashMap<String, Integer>();
		declarations = new HashMap<String, Integer>();
		controlUnit = new CU();
		r = new Reader();
	}
	
	public static void main(String[]args) throws IOException{
		System.out.println(Integer.parseInt(Integer.toBinaryString(-1).substring(1), 2));
		System.out.println(Integer.parseUnsignedInt(Integer.toBinaryString(-1), 2));
	}
	
	public static void addInstructionsCodeToMemory() throws IOException{
		FileReader fileReader = new FileReader("program.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		while ((line = bufferedReader.readLine()) != null)
		{
			String encoding = r.encodeCode(line);
			if (!encoding.equals("nodata"))
			{
				instructionMemory.add(encoding);
			}
		}
		bufferedReader.close();		
	}

	public static InstructionFetch getFetchUnit() {
		return fetchUnit;
	}

	public static void setFetchUnit(InstructionFetch fetchUnit) {
		Simulator.fetchUnit = fetchUnit;
	}

	public static InstructionDecode getDecodeUnit() {
		return decodeUnit;
	}

	public static void setDecodeUnit(InstructionDecode decodeUnit) {
		Simulator.decodeUnit = decodeUnit;
	}

	public static ArrayList<String> getDataMemory() {
		return dataMemory;
	}

	public static void setDataMemory(ArrayList<String> dataMemory) {
		Simulator.dataMemory = dataMemory;
	}

	public static ArrayList<String> getInstructionMemory() {
		return instructionMemory;
	}

	public static void setInstructionMemory(ArrayList<String> instructionMemory) {
		Simulator.instructionMemory = instructionMemory;
	}

	public static CU getControlUnit() {
		return controlUnit;
	}

	public static void setControlUnit(CU controlUnit) {
		Simulator.controlUnit = controlUnit;
	}

	public static HashMap<String, Integer> getLabels() {
		return labels;
	}

	public static void setLabels(HashMap<String, Integer> labels) {
		Simulator.labels = labels;
	}

	public static HashMap<String, Integer> getDeclarations() {
		return declarations;
	}

	public static void setDeclarations(HashMap<String, Integer> declarations) {
		Simulator.declarations = declarations;
	}

	public static IDEXReg getiDEX() {
		return iDEX;
	}

	public static void setiDEX(IDEXReg iDEX) {
		Simulator.iDEX = iDEX;
	}

	public static IFIDReg getiFID() {
		return iFID;
	}

	public static void setiFID(IFIDReg iFID) {
		Simulator.iFID = iFID;
	}

	public static EXMemReg geteXMem() {
		return eXMem;
	}

	public static void seteXMem(EXMemReg eXMem) {
		Simulator.eXMem = eXMem;
	}

	public static MemWBReg getMemWB() {
		return memWB;
	}

	public static void setMemWB(MemWBReg memWB) {
		Simulator.memWB = memWB;
	}
}
