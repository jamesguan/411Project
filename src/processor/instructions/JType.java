package processor.instructions;

public class JType extends Instruction {
	private int target;
	
	public JType(int opcode, int target){
		super(opcode);
		this.target = target;
	}
	
	public String toString(){
		String str = " target: " + target;
		return str;
	}
}
