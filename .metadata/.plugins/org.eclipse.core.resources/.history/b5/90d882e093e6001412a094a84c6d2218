package mainUnits;

public class ALU
{
	
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
}
