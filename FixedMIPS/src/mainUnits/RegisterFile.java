package mainUnits;

public class RegisterFile {
	private static int t0;
	private static int t1;
	private static int t2;
	private static int t3;
	private static int t4;
	private static int t5;
	private static int t6;
	private static int t7;
	private static int at;
	private static int a0;
	private static int a1;
	private static int a2;
	private static int a3;
	private static int v0;
	private static int v1;
	private static int t8;
	private static int t9;
	private static int s0;
	private static int s1;
	private static int s2;
	private static int s3;
	private static int s4;
	private static int s5;
	private static int s6;
	private static int s7;
	private static int k0;
	private static int k1;
	private static final int zero = 0;
	
	public RegisterFile(){
		t0 = 0;
		t1 = 0;
		t2 = 0;
		t3 = 0;
		t4 = 0;
		t5 = 0;
		t6 = 0;
		t7 = 0;
		at = 0;
		a0 = 0;
		a1 = 0;
		a2 = 0;
		a3 = 0;
		v0 = 0;
		v1 = 0;
		t8 = 0;
		t9 = 0;
		s0 = 0;
		s1 = 0;
		s2 = 0;
		s3 = 0;
		s4 = 0;
		s5 = 0;
		s6 = 0;
		s7 = 0;
		k0 = 0;
		k1 = 0;
	}
	
	public static int read(String register)
	{
		switch(register)
		{
			case "01000": return t0;
			case "01001": return t1;
			case "01010": return t2;
			case "01011": return t3;
			case "01100": return t4;
			case "01101": return t5;
			case "01110": return t6;
			case "01111": return t7;
			case "00001": return at;
			case "00100": return a0;
			case "00101": return a1;
			case "00110": return a2;
			case "00111": return a3;
			case "00010": return v0;
			case "00011": return v1;
			case "11000": return t8;
			case "11001": return t9;
			case "10000": return s0;
			case "10001": return s1;
			case "10010": return s2;
			case "10011": return s3;
			case "10100": return s4;
			case "10101": return s5;
			case "10110": return s6;
			case "10111": return s7;
			case "11010": return k0;
			case "11011": return k1;
			default: return 0;
		}
	}
	
	public static void write(String register, int data)
	{
		switch(register)
		{
			case "01000": t0 = data; break;
			case "01001": t1 = data; break;
			case "01010": t2 = data; break;
			case "01011": t3 = data; break;
			case "01100": t4 = data; break;
			case "01101": t5 = data; break;
			case "01110": t6 = data; break;
			case "01111": t7 = data; break;
			case "00001": at = data; break;
			case "00100": a0 = data; break;
			case "00101": a1 = data; break;
			case "00110": a2 = data; break;
			case "00111": a3 = data; break;
			case "00010": v0 = data; break;
			case "00011": v1 = data; break;
			case "11000": t8 = data; break;
			case "11001": t9 = data; break;
			case "10000": s0 = data; break;
			case "10001": s1 = data; break;
			case "10010": s2 = data; break;
			case "10011": s3 = data; break;
			case "10100": s4 = data; break;
			case "10101": s5 = data; break;
			case "10110": s6 = data; break;
			case "10111": s7 = data; break;
			case "11010": k0 = data; break;
			case "11011": k1 = data; break;
		}
	}

	public static int getT0() {
		return t0;
	}

	public static void setT0(int t0) {
		RegisterFile.t0 = t0;
	}

	public static int getT1() {
		return t1;
	}

	public static void setT1(int t1) {
		RegisterFile.t1 = t1;
	}

	public static int getT2() {
		return t2;
	}

	public static void setT2(int t2) {
		RegisterFile.t2 = t2;
	}

	public static int getT3() {
		return t3;
	}

	public static void setT3(int t3) {
		RegisterFile.t3 = t3;
	}

	public static int getT4() {
		return t4;
	}

	public static void setT4(int t4) {
		RegisterFile.t4 = t4;
	}

	public static int getT5() {
		return t5;
	}

	public static void setT5(int t5) {
		RegisterFile.t5 = t5;
	}

	public static int getT6() {
		return t6;
	}

	public static void setT6(int t6) {
		RegisterFile.t6 = t6;
	}

	public static int getT7() {
		return t7;
	}

	public static void setT7(int t7) {
		RegisterFile.t7 = t7;
	}

	public static int getAt() {
		return at;
	}

	public static void setAt(int at) {
		RegisterFile.at = at;
	}

	public static int getA0() {
		return a0;
	}

	public static void setA0(int a0) {
		RegisterFile.a0 = a0;
	}

	public static int getA1() {
		return a1;
	}

	public static void setA1(int a1) {
		RegisterFile.a1 = a1;
	}

	public static int getA2() {
		return a2;
	}

	public static void setA2(int a2) {
		RegisterFile.a2 = a2;
	}

	public static int getA3() {
		return a3;
	}

	public static void setA3(int a3) {
		RegisterFile.a3 = a3;
	}

	public static int getV0() {
		return v0;
	}

	public static void setV0(int v0) {
		RegisterFile.v0 = v0;
	}

	public static int getV1() {
		return v1;
	}

	public static void setV1(int v1) {
		RegisterFile.v1 = v1;
	}

	public static int getT8() {
		return t8;
	}

	public static void setT8(int t8) {
		RegisterFile.t8 = t8;
	}

	public static int getT9() {
		return t9;
	}

	public static void setT9(int t9) {
		RegisterFile.t9 = t9;
	}

	public static int getS0() {
		return s0;
	}

	public static void setS0(int s0) {
		RegisterFile.s0 = s0;
	}

	public static int getS1() {
		return s1;
	}

	public static void setS1(int s1) {
		RegisterFile.s1 = s1;
	}

	public static int getS2() {
		return s2;
	}

	public static void setS2(int s2) {
		RegisterFile.s2 = s2;
	}

	public static int getS3() {
		return s3;
	}

	public static void setS3(int s3) {
		RegisterFile.s3 = s3;
	}

	public static int getS4() {
		return s4;
	}

	public static void setS4(int s4) {
		RegisterFile.s4 = s4;
	}

	public static int getS5() {
		return s5;
	}

	public static void setS5(int s5) {
		RegisterFile.s5 = s5;
	}

	public static int getS6() {
		return s6;
	}

	public static void setS6(int s6) {
		RegisterFile.s6 = s6;
	}

	public static int getS7() {
		return s7;
	}

	public static void setS7(int s7) {
		RegisterFile.s7 = s7;
	}

	public static int getK0() {
		return k0;
	}

	public static void setK0(int k0) {
		RegisterFile.k0 = k0;
	}

	public static int getK1() {
		return k1;
	}

	public static void setK1(int k1) {
		RegisterFile.k1 = k1;
	}

	public static int getZero() {
		return zero;
	}
}
