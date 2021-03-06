package mainUnits;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import memory.CU;
import memory.InstructionDecode;
import memory.InstructionFetch;

public class Simulator {
	private static int PC;
	private static InstructionFetch If ;
	private static InstructionDecode ID ;
	private static ArrayList <String> Memory;
	private CU controlUnit;
	private static Reader r;
	
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
		If = new InstructionFetch();
		ID = new InstructionDecode();
		Memory = new ArrayList <String>();
		controlUnit = new CU();
		r = new Reader();
	}
	
	public static void main(String[]args) throws IOException{
		Simulator x = new Simulator();
		x.addInstructionsCodeToMemory();
		//System.out.println(x.getMemory());
		String memoryInUse = x.If.action();
		x.ID.action();
		System.out.println(x.ID.getInstructionCU());
	}
	
	public static void addInstructionsCodeToMemory() throws IOException{
		Simulator s = new Simulator();
		FileReader fileReader = new FileReader("File.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			Memory.add(r.encodeCode(line));
		}
		bufferedReader.close();
		
	}
	
	
	
	
	
	public static InstructionFetch getIf() {
		return If;
	}
	
	public void setIf(InstructionFetch if1) {
		If = if1;
	}
	
	public InstructionDecode getID() {
		return ID;
	}
	
	public void setID(InstructionDecode iD) {
		ID = iD;
	}
	
	public static ArrayList<String> getMemory() {
		return Memory;
	}
	
	public void setMemory(ArrayList<String> memory) {
		Memory = memory;
	}
	
	public CU getControlUnit() {
		return controlUnit;
	}
	
	public void setControlUnit(CU controlUnit) {
		controlUnit = controlUnit;
	}
}
