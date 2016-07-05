package processor.instructions;

public class ANDI extends IType{
	
	public ANDI(int rs, int rt, int immediate){
		super(ANDI, rs, rt, immediate);
	}
}
