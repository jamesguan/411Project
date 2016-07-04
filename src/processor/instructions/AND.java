package processor.instructions;

public class AND extends RType{
	private static final int AND_FUNCT = 0x24;
	public AND (int rs, int rt, int rd, int offset){
		super(rs, rt, rd, offset, AND_FUNCT);
	}
}
