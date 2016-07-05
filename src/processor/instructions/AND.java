package processor.instructions;

public class AND extends RType{
	
	
	public AND (int rs, int rt, int rd, int offset){
		super(rs, rt, rd, offset, AND_FUNCT);
	}
}
