package mainUnits;

public class ALU
{
	private int input1;
	private int input2;
	public ALU(Register previousReg, Register nextReg)
	{
		input1 = previousReg.getData1(); //to be adjusted after registers are implemented
		input2 = previousReg.getData2();
	}
	public int generateControl(int aluOpControlSignal, int funct)
	{
		int aluControl = 8;
		
		switch (aluOpControlSignal)
		{
			case 0:	aluControl = 2;
					break;
			case 1:	aluControl = 6;
					break;
			case 2: switch (funct)
					{
						case 32: aluControl = 2;
								 break;
						case 34: aluControl = 6;
								 break;
						case 36: aluControl = 0;
								 break;
						case 37: aluControl = 1;
								 break;
						case 42: aluControl = 7;
								 break;
					}
					break;			
		}
		
		return aluControl;
	}
	public int getInput1() {
		return input1;
	}
	public void setInput1(int input1) {
		this.input1 = input1;
	}
	public int getInput2() {
		return input2;
	}
	public void setInput2(int input2) {
		this.input2 = input2;
	}
}
