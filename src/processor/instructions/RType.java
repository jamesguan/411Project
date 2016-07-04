package processor.instructions;

public class RType extends Instruction{
	public static final int ROPCODE = 0x000;
	private int rs;
	private int rt;
	private int rd;
	private int offset;
	private int funct;
	
	public RType(int rs, int rt, int rd, int offset, int funct){
		super(ROPCODE);
		this.rs = rs;
		this.rt = rt;
		this.rd = rd;
		this.offset = offset;
		this.funct = funct;
	}
}
