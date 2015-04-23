package mainUnits;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import memory.CU;
import memory.InstructionDecode;
import memory.InstructionFetch;

public class Simulator {
	private static int PC;
	private static InstructionFetch fetchUnit ;
	private static InstructionDecode decodeUnit ;
	private static ArrayList <String> dataMemory;
	private static ArrayList<String> instructionMemory;
	private CU controlUnit;
	private static Reader r;
	private static HashMap<String, Integer> labels;
	private static HashMap<String, Integer> declarations;
	
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
		new Simulator();
		addInstructionsCodeToMemory();
		if(fetchUnit.action().equals("program_done"))
		{
			return;
		}
		decodeUnit.action();
		System.out.println(decodeUnit.getInstructionCU());
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

	public CU getControlUnit() {
		return controlUnit;
	}

	public void setControlUnit(CU controlUnit) {
		this.controlUnit = controlUnit;
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
}
