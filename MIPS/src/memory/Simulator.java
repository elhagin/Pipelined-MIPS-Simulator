package memory;

public class Simulator {
private static InstructionFetch If ;

public static InstructionFetch getIf() {
	return If;
}

public void setIf(InstructionFetch if1) {
	If = if1;
}
}
