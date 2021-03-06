package mainUnits;
import Simulator;

public class ALU
{
	private String input1;
	private String input2;
	private String output;
	private int zeroFlag;

	public ALU()
	{
		input1 = Simulator.getIDEXReg().getSrcReg1(); //to be adjusted after registers are implemented
		if (Simulator.getControlUnit().getALUSrc() == 0)
		{
			input2 = Simulator.getIDEXReg().getSrcReg2(); //waiting for implementation of ID/EX register 
		}
		else
		{
			input2 = Integer.parseInt(Simulator.getIDEXReg().getLast16Bits(), 2); //waiting for implementation of ID/EX register 
		}
	}

	public String generateControl()
	{
		String aluControl = "1000";
		String funct = Simulator.getIDEXReg().getFunctionCode(); //waiting for implementation of ID/EX register
		String aluOpControlSignal = "" + Simulator.getControlUnit().getALUOp1() + Simulator.getControlUnit().getALUOp0();
		switch (aluOpControlSignal)
		{
		case "00":	aluControl = "0010";
		break;
		case "01":	aluControl = "branch";
		break;
		case "10": switch (funct)
				   {
					   case "011011": aluControl = "1100";
					   break;
					   case "100000": aluControl = "0010";
					   break;
					   case "100010": aluControl = "0110";
					   break;
					   case "100100": aluControl = "0000";
					   break;
					   case "100101": aluControl = "0001";
					   break;
					   case "101010": aluControl = "0111";
					   break;
				   }
		break;			
		}

		return aluControl;
	}

	public void executeOperation()
	{
		String operation = generateControl();
		switch (operation)
		{
		case "branch": output = Integer.toBinaryString(Integer.parseInt(input1, 2) - Integer.parseInt(input2, 2));
		break;
		case "0000": output = Integer.toBinaryString(Integer.parseInt(input1, 2) & Integer.parseInt(input2, 2));
		break;
		case "0001": output = Integer.toBinaryString(Integer.parseInt(input1, 2) | Integer.parseInt(input2, 2));
		break;
		case "0010": output = Integer.toBinaryString(Integer.parseInt(input1, 2) + Integer.parseInt(input2, 2));
		break;
		case "0110": output = Integer.toBinaryString(Integer.parseInt(input1, 2) - Integer.parseInt(input2, 2));
		break;
		case "0111": if (Integer.parseInt(input1, 2) < Integer.parseInt(input2, 2)) output = Integer.toBinaryString(1); else output = Integer.toBinaryString(0);
		break;
		case "1100": output = Integer.toBinaryString(~(Integer.parseInt(input1, 2) | Integer.parseInt(input2, 2)));
		break;
		}
	}

	public String getInput1() {
		return input1;
	}

	public void setInput1(String input1) {
		this.input1 = input1;
	}

	public String getInput2() {
		return input2;
	}

	public void setInput2(String input2) {
		this.input2 = input2;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public int getZeroFlag() {
		return zeroFlag;
	}

	public void setZeroFlag(int zeroFlag) {
		this.zeroFlag = zeroFlag;
	}
}
