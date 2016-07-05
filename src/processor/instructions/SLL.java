package processor.instructions;

public class SLL extends RType{

	
	public SLL (int rs, int rt, int rd, int offset){
		super(rs, rt, rd, offset, SLL_FUNCT);
	}
}
