package processor.instructions;

public class SUB extends RType{

	
	public SUB (int rs, int rt, int rd, int offset){
		super(rs, rt, rd, offset, SUB_FUNCT);
	}
}
