package processor.instructions;

public class LW extends IType{
	
	
	public LW(int rs, int rt, int immediate){
		super(LW, rs, rt, immediate);
	}
}
