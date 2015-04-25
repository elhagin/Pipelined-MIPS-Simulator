package mainUnits;

public class Reader {
	private static String [] split;
	private static String s ;
	private static String [] split2 ;
	private static String outputBinary = "";
	private static String FunctionCode = "";
	private static String ShiftAmount = "";
	private static boolean readingData = false;

	public Reader(){
		
	}
	
	public String encodeCode(String h)
	{
		outputBinary = "";
		FunctionCode = "";
		ShiftAmount = "";
		
		if (!readingData)
		{
			split= h.split("\\s+",2);
			if (split.length > 1)
			{
				s = split[1].replaceAll("\\s+", "");
				split2 = s.split(",");
			}
			switch(split[0])
			{
				case ".data":readingData = true; return "nodata"; 
				case "add":checkAdd();break;
				case "sub":checkSub();break;
				case "and":checkAnd();break;
				case "sll":checkSll();break;
				case "srl":checkSrl();break;
				case "nor":checkNor();break;
				case "jr":checkJr();break;
				case "slt":checkSlt();break;
				case "sltu":checkSltu();break;
				case "addi":checkAddi();break;
				case "lb":checkLb();break;
				case "lw":checkLw();break;
				case "lbu":checkLbu();break;
				case "sw":checkSw();break; 
				case "sb":checkSb();break;
				case "lui":checkLui();break;
				case "j":checkJ();break;
				case "beq":checkBeq();break;
				case "bne":checkBne();break;
				case "jal":checkJal();break;
			}
			return outputBinary;
		}
		else
		{
			split = h.split(":", 2);
			if (split.length == 1 && split[0].equals(".text"))
			{
				readingData = false;
				return "nodata";
			}
			s = split[1].replaceAll("^\\s+", "");
			String[] directive = s.split("\\s+", 2);
			switch(directive[0])
			{
			case ".word":
				String[] words = directive[1].replaceAll("\\s+", "").split(",");
				int number = Integer.parseInt(words[0]);
				String numberInBinary = Integer.toBinaryString(number);
				char signBit;
				if (number < 0)
					signBit = numberInBinary.charAt(0);
				else
					signBit = '0';
				while (numberInBinary.length() < 32)
					numberInBinary = signBit + numberInBinary;
				String directiveLabel = split[0];
				Simulator.getDataMemory()[Simulator.getMemoryPointer()] = numberInBinary;
				Simulator.getDeclarations().put(directiveLabel, Simulator.getMemoryPointer());
				Simulator.setMemoryPointer(Simulator.getMemoryPointer() + 1);
				for (int i = 1; i < words.length; i++)
				{
					number = Integer.parseInt(words[i]);
					numberInBinary = Integer.toBinaryString(number);
					if (number < 0)
						signBit = numberInBinary.charAt(0);
					else
						signBit = '0';
					while (numberInBinary.length() < 32)
						numberInBinary = signBit + numberInBinary;
					Simulator.getDataMemory()[Simulator.getMemoryPointer()] = numberInBinary;
					Simulator.setMemoryPointer(Simulator.getMemoryPointer() + 1);
				}
				break;
			case ".space":
				double space = (double) Integer.parseInt(directive[1].replaceAll("\\s+",  ""));
				for (double numberOfWords = Math.ceil(space/32); numberOfWords > 0; numberOfWords--)
				{
					Simulator.getDataMemory()[Simulator.getMemoryPointer()] = "00000000000000000000000000000000";
					Simulator.setMemoryPointer(Simulator.getMemoryPointer() + 1);
				}
				break;
			}
			return "nodata";
		}
	}
	
	public static void checkAdd(){
		if(split[0].equals("add")){
			outputBinary = outputBinary + "000000";
			ShiftAmount = ShiftAmount + "00000";
			switch(split2[1]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[2]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[0]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			outputBinary = outputBinary + ShiftAmount;
			FunctionCode = FunctionCode+"100000";
			outputBinary = outputBinary + FunctionCode;
		}
	}
	
	public static void checkSub(){
		if(split[0].equals("sub")){
			outputBinary = outputBinary + "000000";
			ShiftAmount = ShiftAmount + "00000";
			switch(split2[1]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[2]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[0]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			outputBinary = outputBinary + ShiftAmount;
			FunctionCode = FunctionCode+"100010";
			outputBinary = outputBinary + FunctionCode;
		}
	}
	
	public static void checkAnd(){
		if(split[0].equals("and")){
			outputBinary = outputBinary + "000000";
			ShiftAmount = ShiftAmount + "00000";
			switch(split2[1]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[2]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[0]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			outputBinary = outputBinary + ShiftAmount;
			FunctionCode = FunctionCode+"100100";
			outputBinary = outputBinary + FunctionCode;
		}
	}
	
	public static void checkSll(){
		if(split[0].equals("sll")){
				outputBinary = outputBinary + "00000000000";
			switch(split2[1]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[0]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			int number = Integer.parseInt(split2[2]);
			String shamt = Integer.toBinaryString(number);
			while (shamt.length() < 5)
				shamt = "0" + shamt;
			outputBinary += shamt;
			FunctionCode = FunctionCode+"000000";
			outputBinary = outputBinary + FunctionCode;
		}
	}
	
	public static void checkSrl(){
		if(split[0].equals("srl")){
			outputBinary = outputBinary + "00000000000";
			ShiftAmount = ShiftAmount + "00000";
				switch(split2[1]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[0]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			int number = Integer.parseInt(split2[2]);
			String shamt = Integer.toBinaryString(number);
			while (shamt.length() < 5)
				shamt = "0" + shamt;
			outputBinary += shamt;
			FunctionCode = FunctionCode+"000010";
			outputBinary = outputBinary + FunctionCode;
		}
	}
	
	public static void checkNor(){
		if(split[0].equals("nor")){
			outputBinary = outputBinary + "000000";
			ShiftAmount = ShiftAmount + "00000";
			switch(split2[1]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[2]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[0]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			outputBinary = outputBinary + ShiftAmount;
			FunctionCode = FunctionCode+"100111";
			outputBinary = outputBinary + FunctionCode;
		}
	}
	
	public static void checkSlt(){
		if(split[0].equals("slt")){
			outputBinary = outputBinary + "000000";
			ShiftAmount = ShiftAmount + "00000";
			switch(split2[1]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[2]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[0]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			outputBinary = outputBinary + ShiftAmount;
			FunctionCode = FunctionCode+"101010";
			outputBinary = outputBinary + FunctionCode;
		}
	}
	
	
	public static void checkSltu(){
		if(split[0].equals("sltu")){
			outputBinary = outputBinary + "000000";
			ShiftAmount = ShiftAmount + "00000";
			switch(split2[1]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[2]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[0]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			outputBinary = outputBinary + ShiftAmount;
			FunctionCode = FunctionCode + "101001";
			outputBinary = outputBinary + FunctionCode;
		}
	}
	
	public static void checkAddi(){
		if(split[0].equals("addi")){
			outputBinary = outputBinary + "001000";
			switch(split2[1]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[0]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			int number = Integer.parseInt(split2[2]);
			String constant = Integer.toBinaryString(number);
			if (number >= 0)
			{
				while (constant.length() < 16)
					constant = "0" + constant;
			}
			else
				constant = constant.substring(16);
			outputBinary = outputBinary + constant;
		}
	}
	
	public static void checkLb(){
		if(split[0].equals("lb")){
			outputBinary = outputBinary + "100000";
			String memData[] = split2[1].split("(");
			int offset = Integer.parseInt(memData[0]);
			String offsetInBinary = Integer.toBinaryString(offset);
			memData[1] = memData[1].replace(")", "");
			switch(memData[1])
			{
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[0]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			if (offset >= 0)
			{
				while (offsetInBinary.length() < 16)
					offsetInBinary = "0" + offsetInBinary;
			}
			else
				offsetInBinary = offsetInBinary.substring(16);
			outputBinary += offsetInBinary;
		}
	}
	
	public static void checkLw(){
		if(split[0].equals("lw")){
			outputBinary = outputBinary + "100011";
			String memData[] = split2[1].split("(");
			int offset = Integer.parseInt(memData[0]);
			String offsetInBinary = Integer.toBinaryString(offset);
			memData[1] = memData[1].replace(")", "");
			switch(memData[1])
			{
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[0]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			if (offset >= 0)
			{
				while (offsetInBinary.length() < 16)
					offsetInBinary = "0" + offsetInBinary;
			}
			else
				offsetInBinary = offsetInBinary.substring(16);
			outputBinary += offsetInBinary;
		}
	}
	
	public static void checkLbu(){
		if(split[0].equals("lbu")){
			outputBinary = outputBinary + "100100";
			String memData[] = split2[1].split("(");
			int offset = Integer.parseInt(memData[0]);
			String offsetInBinary = Integer.toBinaryString(offset);
			memData[1] = memData[1].replace(")", "");
			switch(memData[1])
			{
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[0]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			while (offsetInBinary.length() < 16)
				offsetInBinary = "0" + offsetInBinary;
			outputBinary += offsetInBinary;
		}
	}
	
	public static void checkSw(){
		if(split[0].equals("sw")){
			outputBinary = outputBinary + "101011";
			String memData[] = split2[1].split("(");
			int offset = Integer.parseInt(memData[0]);
			String offsetInBinary = Integer.toBinaryString(offset);
			memData[1] = memData[1].replace(")", "");
			switch(memData[1])
			{
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[0]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			if (offset >= 0)
			{
				while (offsetInBinary.length() < 16)
					offsetInBinary = "0" + offsetInBinary;
			}
			else
				offsetInBinary = offsetInBinary.substring(16);
			outputBinary += offsetInBinary;
		}
	}
	
	
	public static void checkSb(){
		if(split[0].equals("sb")){
			outputBinary = outputBinary + "101000";
			String memData[] = split2[1].split("(");
			int offset = Integer.parseInt(memData[0]);
			String offsetInBinary = Integer.toBinaryString(offset);
			memData[1] = memData[1].replace(")", "");
			switch(memData[1])
			{
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[0]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			if (offset >= 0)
			{
				while (offsetInBinary.length() < 16)
					offsetInBinary = "0" + offsetInBinary;
			}
			else
				offsetInBinary = offsetInBinary.substring(16);
			outputBinary += offsetInBinary;
		}
	}
	
	public static void checkLui(){
		if(split[0].equals("lui")){
			outputBinary = outputBinary + "00111100000";
			switch(split2[0]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			int number = Integer.parseInt(split2[1]);
			String constant = Integer.toBinaryString(number);
			if (number >= 0)
			{
				while (constant.length() < 16)
					constant = "0" + constant;
			}
			else
				constant = constant.substring(16);
			outputBinary = outputBinary + constant;
		}
	}
	
	public static void checkBeq(){
		if(split[0].equals("beq")){
			outputBinary = outputBinary + "000100";
			switch(split2[0]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[1]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			int address = Simulator.getLabels().get(split2[2]);
			int thisInstruction = Simulator.getI();
			int offset = (address - thisInstruction) - 1;
			String offsetInBinary = Integer.toBinaryString(offset);
			if (offset >= 0)
			{
				while (offsetInBinary.length() < 16)
					offsetInBinary = "0" + offsetInBinary;
			}
			else
				offsetInBinary = offsetInBinary.substring(16);
			outputBinary += offsetInBinary;
		}
	}
	
	public static void checkBne(){
		if(split[0].equals("bne")){
			outputBinary = outputBinary + "000101";
			switch(split2[0]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			switch(split2[1]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			int address = Simulator.getLabels().get(split2[2]);
			int thisInstruction = Simulator.getI();
			int offset = (address - thisInstruction) - 1;
			String offsetInBinary = Integer.toBinaryString(offset);
			if (offset >= 0)
			{
				while (offsetInBinary.length() < 16)
					offsetInBinary = "0" + offsetInBinary;
			}
			else
				offsetInBinary = offsetInBinary.substring(16);
			outputBinary += offsetInBinary;
		}
	}
	
	public static void checkJ(){
		if(split[0].equals("j")){
			outputBinary = outputBinary + "000010";
			int memAddress = Simulator.getLabels().get(split2[0]);
			memAddress /= 4;
			String PC = Integer.toBinaryString(Simulator.getPC());
			while (PC.length() < 32)
				PC = "0" + PC;
			String pseudoAddress = Integer.toBinaryString(memAddress);
			while (pseudoAddress.length() < 22)
				pseudoAddress = "0" + pseudoAddress;
			outputBinary += PC.substring(0, 4);
			outputBinary += pseudoAddress;
		}
	}
	
	public static void checkJr(){
		if(split[0].equals("jr")){
			outputBinary = outputBinary + "000000";
			switch(split2[0]){
				case "$t0":outputBinary = outputBinary + "01000";break;
				case "$t1":outputBinary = outputBinary + "01001";break;
				case "$t2":outputBinary = outputBinary + "01010";break;
				case "$t3":outputBinary = outputBinary + "01011";break;
				case "$t4":outputBinary = outputBinary + "01100";break;
				case "$t5":outputBinary = outputBinary + "01101";break;
				case "$t6":outputBinary = outputBinary + "01110";break;
				case "$t7":outputBinary = outputBinary + "01111";break;
				case "$at":outputBinary = outputBinary + "00001";break;
				case "$a0":outputBinary = outputBinary + "00100";break;
				case "$a1":outputBinary = outputBinary + "00101";break;
				case "$a2":outputBinary = outputBinary + "00110";break;
				case "$a3":outputBinary = outputBinary + "00111";break;
				case "$v0":outputBinary = outputBinary + "00010";break;
				case "$v1":outputBinary = outputBinary + "00011";break;
				case "$t8":outputBinary = outputBinary + "11000";break;
				case "$t9":outputBinary = outputBinary + "11001";break;
				case "$s0":outputBinary = outputBinary + "10000";break;
				case "$s1":outputBinary = outputBinary + "10001";break;
				case "$s2":outputBinary = outputBinary + "10010";break;
				case "$s3":outputBinary = outputBinary + "10011";break;
				case "$s4":outputBinary = outputBinary + "10100";break;
				case "$s5":outputBinary = outputBinary + "10101";break;
				case "$s6":outputBinary = outputBinary + "10110";break;
				case "$s7":outputBinary = outputBinary + "10111";break;
				case "$k0":outputBinary = outputBinary + "11010";break;
				case "$k1":outputBinary = outputBinary + "11011";break;
			}
			outputBinary = outputBinary + "000000000000000";
			FunctionCode = FunctionCode+"001000";
			outputBinary = outputBinary + FunctionCode;
		}
	}
	
	public static void checkJal(){
		if(split[0].equals("jal")){
			outputBinary = outputBinary + "000011";
			int memAddress = Simulator.getLabels().get(split2[0]);
			memAddress /= 4;
			String PC = Integer.toBinaryString(Simulator.getPC());
			while (PC.length() < 32)
				PC = "0" + PC;
			String pseudoAddress = Integer.toBinaryString(memAddress);
			while (pseudoAddress.length() < 22)
				pseudoAddress = "0" + pseudoAddress;
			outputBinary += PC.substring(0, 4);
			outputBinary += pseudoAddress;
		}
	}
}

