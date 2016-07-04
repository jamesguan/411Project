package processor.instructions;

public class ADDI extends IType {
	private static final int ADDI = 0x8;
	
	public ADDI(int rs, int rt, int immediate){
		super(ADDI, rs, rt, immediate);
	}
}
