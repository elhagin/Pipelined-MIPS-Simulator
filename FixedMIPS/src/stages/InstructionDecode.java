package stages;

import mainUnits.CU;
import mainUnits.RegisterFile;
import pipelineRegisters.IDEXReg;
import pipelineRegisters.IFIDReg;

public class InstructionDecode {	
	public void action(){
		IDEXReg.setPC(IFIDReg.getPC());
		String instruction = IFIDReg.getInstruction();
		CU.inputOpCode(instruction.substring(0, 6));
		IDEXReg.setMemToReg(CU.getMemToReg());
		IDEXReg.setBranch(CU.getBranch());
		IDEXReg.setAluOp0(CU.getALUOp0());
		IDEXReg.setAluOp1(CU.getALUOp1());
		IDEXReg.setAluSrc(CU.getALUSrc());
		IDEXReg.setRegDst(CU.getRegDst());
		IDEXReg.setRegWrite(CU.getRegWrite());
		IDEXReg.setMemWrite(CU.getMemWrite());
		IDEXReg.setMemRead(CU.getMemRead());
		int rs = RegisterFile.read(instruction.substring(6, 11));
		int rt = RegisterFile.read(instruction.substring(11, 16));
		IDEXReg.setRegData1(rs);
		IDEXReg.setRegData2(rt);
		IDEXReg.setRd(instruction.substring(16, 21));
		IDEXReg.setRt(instruction.substring(11, 16));
		IDEXReg.setLast16Bits(instruction.substring(16));
	}
}
