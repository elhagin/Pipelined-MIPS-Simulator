package mainUnits;


import java.util.Scanner;



public class Reader {
	static String x;
	static String [] split;
	static String s ;
	static String [] split2 ;
	static String [] split3 ;
	static int t;
	static String v;
	static String sheikh;
	static String outputBinary = "";
	static String FunctionCode = "";
	static String ShiftAmount = "";
	
	public static void checkAdd(){
		if(split[0].equals("add")){
			outputBinary = outputBinary + "000000";
			ShiftAmount = ShiftAmount + "00000";
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
			}
			outputBinary = outputBinary + ShiftAmount;
			FunctionCode = FunctionCode+"100100";
			outputBinary = outputBinary + FunctionCode;
		}
	}
	
	public static void checkSll(){
		if(split[0].equals("sll")){
			outputBinary = outputBinary + "000000";
			ShiftAmount = ShiftAmount + "00000";
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
			int m = Integer.parseInt(split2[2]);ShiftAmount = Integer.toBinaryString(0x10000 | m).substring(1);outputBinary = outputBinary + ShiftAmount;
			FunctionCode = FunctionCode+"000000";
			outputBinary = outputBinary + FunctionCode;
		}
	}
	
	public static void checkSrl(){
		if(split[0].equals("srl")){
			outputBinary = outputBinary + "000000";
			ShiftAmount = ShiftAmount + "00000";
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
			int n = Integer.parseInt(split2[2]);ShiftAmount = Integer.toBinaryString(0x10 | n).substring(1);outputBinary = outputBinary + ShiftAmount;
			FunctionCode = FunctionCode+"000010";
			outputBinary = outputBinary + FunctionCode;
		}
	}
	
	public static void checkNor(){
		if(split[0].equals("nor")){
			outputBinary = outputBinary + "000000";
			ShiftAmount = ShiftAmount + "00000";
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
			}
			outputBinary = outputBinary + ShiftAmount;
			FunctionCode = FunctionCode+"100111";
			outputBinary = outputBinary + FunctionCode;
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
	
	public static void checkSlt(){
		if(split[0].equals("slt")){
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
			outputBinary = outputBinary + "000000";
			FunctionCode = FunctionCode+"101010";
			outputBinary = outputBinary + FunctionCode;
		}
	}
	
	
	public static void checkSltu(){
		if(split[0].equals("sltu")){
			outputBinary = outputBinary + "000000";
			ShiftAmount = ShiftAmount + "00000";
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
			}
			outputBinary = outputBinary + "000000";
		}
	}
	
	public static void checkAddi(){
		if(split[0].equals("addi")){
			outputBinary = outputBinary + "001000";
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
			int y = Integer.parseInt(split2[2]);String convert = Integer.toBinaryString(0x10000 | y).substring(1);outputBinary = outputBinary + convert;
		}
	}
	
	public static void checkLb(){
		if(split[0].equals("lb")){
			outputBinary = outputBinary + "100000";
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
			v = split2[1].toString().replaceAll("(", " ");
			v = v.replaceAll(")", "");
			split3 = v.split("\\s");
			switch(split3[1]){
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
			t = Integer.parseInt(split3[0]);sheikh = Integer.toBinaryString(0x10000 | t).substring(1);outputBinary = outputBinary + sheikh;
		}
	}
	
	public static void checkLw(){
		if(split[0].equals("lw")){
			outputBinary = outputBinary + "100000";
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
			v = split2[1].toString().replaceAll("(", " ");
			v = v.replaceAll(")", "");
			split3 = v.split("\\s");
			switch(split3[1]){
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
			t = Integer.parseInt(split3[0]);sheikh = Integer.toBinaryString(0x10000 | t).substring(1);outputBinary = outputBinary + sheikh;
		}
	}
	
	public static void checkLbu(){
		if(split[0].equals("lbu")){
			outputBinary = outputBinary + "100100";
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
			v = split2[1].toString().replaceAll("(", " ");
			v = v.replaceAll(")", "");
			split3 = v.split("\\s");
			switch(split3[1]){
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
			t = Integer.parseInt(split3[0]);sheikh = Integer.toBinaryString(0x10000 | t).substring(1);outputBinary = outputBinary + sheikh;
		}
	}
	
	public static void checkSw(){
		if(split[0].equals("sw")){
			outputBinary = outputBinary + "101011";
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
			v = split2[1].toString().replaceAll("(", " ");
			v = v.replaceAll(")", "");
			split3 = v.split("\\s");
			switch(split3[1]){
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
			t = Integer.parseInt(split3[0]);sheikh = Integer.toBinaryString(0x10000 | t).substring(1);outputBinary = outputBinary + sheikh;
		}
	}
	
	
	public static void checkSb(){
		if(split[0].equals("sb")){
			outputBinary = outputBinary + "101000";
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
			v = split2[1].toString().replaceAll("(", " ");
			v = v.replaceAll(")", "");
			split3 = v.split("\\s");
			switch(split3[1]){
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
			t = Integer.parseInt(split3[0]);sheikh = Integer.toBinaryString(0x10000 | t).substring(1);outputBinary = outputBinary + sheikh;
		}
	}
	
	public static void checkLui(){
		if(split[0].equals("lui")){
			outputBinary = outputBinary + "001111-----";
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
			t = Integer.parseInt(split2[1]);sheikh = Integer.toBinaryString(0x10000 | t).substring(1);outputBinary = outputBinary + sheikh;
		}
	}
	
	public static void checkJ(){
		if(split[0].equals("j")){
			outputBinary = outputBinary + "000010";
			t = Integer.parseInt(split2[0]);sheikh = Integer.toBinaryString(0x1000000 | t).substring(1);outputBinary = outputBinary + sheikh;
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
			t = Integer.parseInt(split2[2]);sheikh = Integer.toBinaryString(0x10000 | t).substring(1);outputBinary = outputBinary + sheikh;
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
			t = Integer.parseInt(split2[2]);sheikh = Integer.toBinaryString(0x10000 | t).substring(1);outputBinary = outputBinary + sheikh;
		}
	}
	
	public static void checkJal(){
		if(split[0].equals("jal")){
			outputBinary = outputBinary + "000011";
			t = Integer.parseInt(split2[0]);sheikh = Integer.toBinaryString(0x1000000 | t).substring(1);outputBinary = outputBinary + sheikh;
		}
	}
	
	
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextLine();
		split= x.split("\\s+",2);
		s = split[1].toString().replaceAll("\\s+", "");
		split2 = s.split(",");
		
		switch(split[0]){
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
		System.out.println(outputBinary);
		
		
	}
	
	public Reader(){
		
	}
	
	public String encodeCode(String h){
		outputBinary = "";
		FunctionCode = "";
		ShiftAmount = "";
		x = h;
		split= x.split("\\s+",2);
		s = split[1].toString().replaceAll("\\s+", "");
		split2 = s.split(",");
		switch(split[0]){
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
	

}

