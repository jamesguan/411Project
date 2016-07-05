package processor.instructions;

public class ADD extends RType {
	
	public ADD (int rs, int rt, int rd, int offset){
		super(rs, rt, rd, offset, ADD_FUNCT);
	}
}
