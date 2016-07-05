package processor.instructions;

public class MULT extends RType{
	
	
	public MULT (int rs, int rt, int rd, int offset){
		super(rs, rt, rd, offset, MULT_FUNCT);
	}
}
