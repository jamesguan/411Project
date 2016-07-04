package processor.instructions;

public class ANDI extends IType{
	private static final int ANDI = 0xC;
	public ANDI(int rs, int rt, int immediate){
		super(ANDI, rs, rt, immediate);
	}
}
