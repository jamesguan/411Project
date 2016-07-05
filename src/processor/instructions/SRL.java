package processor.instructions;

public class SRL extends RType {

	
	public SRL (int rs, int rt, int rd, int offset){
		super(rs, rt, rd, offset, SRL_FUNCT);
	}
}
