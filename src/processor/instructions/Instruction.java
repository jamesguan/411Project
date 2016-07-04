package processor.instructions;
import memory.*;

public class Instruction extends Data{
	
	
	private String label;
	private int opcode;
	//private int cycles;
	
	//public abstract void execute();
	public Instruction(int opcode){
		this.opcode = opcode;
	}
}