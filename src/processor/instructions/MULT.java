package processor.instructions;

public class MULT extends RType{
	public static final int MULT_FUNCT = 0x18;
	
	public MULT (int rs, int rt, int rd, int offset){
		super(rs, rt, rd, offset, MULT_FUNCT);
	}
}
