package processor.instructions;

public class BEQ extends IType{
	
	
	public BEQ(int rs, int rt, int immediate){
		super(BEQ, rs, rt, immediate);
	}
}
