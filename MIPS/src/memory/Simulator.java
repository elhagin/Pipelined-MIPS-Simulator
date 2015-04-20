package memory;

import java.util.ArrayList;

public class Simulator {
private static InstructionFetch If ;
private static InstructionDecode ID ;
private static ArrayList <String> Memory;
public static InstructionFetch getIf() {
	return If;
}

public void setIf(InstructionFetch if1) {
	If = if1;
}

public static InstructionDecode getID() {
	return ID;
}

public static void setID(InstructionDecode iD) {
	ID = iD;
}

public static ArrayList<String> getMemory() {
	return Memory;
}

public void setMemory(ArrayList<String> memory) {
	Memory = memory;
}
}
