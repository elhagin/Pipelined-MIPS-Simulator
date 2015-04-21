package mainUnits;

import java.util.Scanner;
import com.sun.xml.internal.ws.util.StringUtils;


public class Reader {
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String [] split= x.split("\\s+",2);
		String s = split[1].toString().replaceAll("\\s+", "");
		String [] split2 = s.split(",");
		String outputBinary = "";
		String FunctionCode = "";
		String ShiftAmount = "";
		switch (split[0]){
			case "add":outputBinary = outputBinary + "000000";ShiftAmount = ShiftAmount + "00000";break;
			case "sub":outputBinary = outputBinary + "000000";ShiftAmount = ShiftAmount + "00000";break;
			case "and":outputBinary = outputBinary + "000000";ShiftAmount = ShiftAmount + "00000";break;
			case "sll":outputBinary = outputBinary + "000000";ShiftAmount = ShiftAmount + "00000";break;
			case "srl":outputBinary = outputBinary + "000000";ShiftAmount = ShiftAmount + "00000";break;
			case "nor":outputBinary = outputBinary + "000000";ShiftAmount = ShiftAmount + "00000";break;
			case "jr":outputBinary = outputBinary + "000000";ShiftAmount = ShiftAmount + "00000";break;
			case "slt":outputBinary = outputBinary + "000000";ShiftAmount = ShiftAmount + "00000";break;
			case "sltu":outputBinary = outputBinary + "000000";ShiftAmount = ShiftAmount + "00000";break;
			case "addi":outputBinary = outputBinary + "001000";break;
			case "lb":outputBinary = outputBinary + "100000";break;
			case "lw":outputBinary = outputBinary + "100011";break;
			case "lbu":outputBinary = outputBinary + "100100";break;
			case "sw":outputBinary = outputBinary + "101011";break;
			case "sb":outputBinary = outputBinary + "101000";break;
			case "lui":outputBinary = outputBinary + "001111";break;
			case "j":outputBinary = outputBinary + "000010";break;
			case "beq":outputBinary = outputBinary + "000100";break;
			case "bne":outputBinary = outputBinary + "000101";break;
			case "jal":outputBinary = outputBinary + "000011";break;
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
			default:int m = Integer.parseInt(split2[2]);String convert = Integer.toBinaryString(0x10000 | m).substring(1);outputBinary = outputBinary + convert;break;
		}
		switch (split[0]){
			case "add":outputBinary = outputBinary + ShiftAmount;break;
			case "sub":outputBinary = outputBinary + ShiftAmount;break;
			case "and":outputBinary = outputBinary + ShiftAmount;break;
			case "sll":outputBinary = outputBinary + ShiftAmount;break;
			case "srl":outputBinary = outputBinary + ShiftAmount;break;
			case "nor":outputBinary = outputBinary + ShiftAmount;break;
			case "jr":outputBinary = outputBinary + ShiftAmount;break;
			case "slt":outputBinary = outputBinary + ShiftAmount;break;
		}
		
		
		switch (split[0]){
			case "add":FunctionCode = FunctionCode+"100000";outputBinary = outputBinary + FunctionCode;break;
			case "sub":FunctionCode = FunctionCode+"100010";outputBinary = outputBinary + FunctionCode;break;
			case "and":FunctionCode = FunctionCode+"100100";outputBinary = outputBinary + FunctionCode;break;
			case "sll":FunctionCode = FunctionCode+"000000";outputBinary = outputBinary + FunctionCode;break;
			case "srl":FunctionCode = FunctionCode+"000010";outputBinary = outputBinary + FunctionCode;break;
			case "nor":FunctionCode = FunctionCode+"100111";outputBinary = outputBinary + FunctionCode;break;
			case "jr":FunctionCode = FunctionCode+"001000";outputBinary = outputBinary + FunctionCode;break;
			case "slt":FunctionCode = FunctionCode+"101010";outputBinary = outputBinary + FunctionCode;break;
		}
		System.out.println(outputBinary);
		
		
	}
	

}
