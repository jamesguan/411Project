package processor.instructions;

public class ADD extends RType {
	private static final int ADD_FUNCT = 0x20;
	
	public ADD (int rs, int rt, int rd, int offset){
		super(rs, rt, rd, offset, ADD_FUNCT);
	}
}
