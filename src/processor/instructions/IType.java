package processor.instructions;

public class IType extends Instruction{
	private int rs;
	private int rt;
	private int immediate;
	
	public IType(int opcode, int rs, int rt, int immediate){
		super(opcode);
		this.rs = rs;
		this.rt = rt;
		this.immediate = immediate;
	}
	
	public String toString(){
		String str = translateOpCode() + " rs: " + rs + " rt: " + rt
				+ " immediate: " + immediate;
		return str;
	}
}
