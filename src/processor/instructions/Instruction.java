package processor.instructions;
import memory.*;

public class Instruction extends Data{
	
	public static final int ADD_FUNCT = 0x20;
	public static final int AND_FUNCT = 0x24;
	public static final int MULT_FUNCT = 0x18;
	public static final int OR_FUNCT = 0x25;
	public static final int SLL_FUNCT = 0x00;
	public static final int SRA_FUNCT = 0x03;
	public static final int SRL_FUNCT = 0x02;
	public static final int SUB_FUNCT = 0x22;
	
	public static final int ADDI = 0x08;
	public static final int ANDI = 0x0C;
	public static final int BEQ = 0x4;
	public static final int BNE = 0x5;
	public static final int HLT = 0x3F;
	public static final int LI = 0x0F;
	public static final int LW = 0x23;
	public static final int MULTI = 0x0B;
	public static final int ORI = 0x0D;
	public static final int SUBI = 0x0A;
	public static final int SW = 0x2B;
	
	public static final int J = 0x2;
	
	private String label;
	private int opcode;
	//private int cycles;
	
	//public abstract void execute();
	public Instruction(int opcode){
		this.opcode = opcode;
		this.label = "";
	}
	
	public void setLabel(String label){
		this.label = label;
	}
	public String getLabel(){
		return this.label;
	}
	
	public String translateOpCode(){
		switch(this.opcode){
		
		case 0x0:
			return "R-Type";
		
		case  ADDI:
			return "ADDI";
		case  ANDI:
			return "ANDI";
		case  BEQ:
			return "BEQ";
		case  BNE:
			return "BNE";
		case  HLT:
			return "HLT";
		case  LI:
			return "LI";
		case  LW:
			return "LW";
		case  MULTI:
			return "MULTI";
		case  ORI:
			return "ORI";
		case  SUBI:
			return "SUBI";
		case  SW:
			return "SW";
		
		case  J:
			return "J";
		
		}
		return "";
	}
	
}