package processor.instructions;

public class ADDI extends IType {
	
	
	public ADDI(int rs, int rt, int immediate){
		super(ADDI, rs, rt, immediate);
	}
}
