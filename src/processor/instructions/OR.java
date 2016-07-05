package processor.instructions;

public class OR extends RType{

	public OR (int rs, int rt, int rd, int offset){
		super(rs, rt, rd, offset, OR_FUNCT);
	}
}
