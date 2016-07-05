package processor.instructions;

public class SRA extends RType{

	
	public SRA(int rs, int rt, int rd, int offset){
		super(rs, rt, rd, offset, SRA_FUNCT);
	}
}
