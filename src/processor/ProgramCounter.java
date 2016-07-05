package processor;

public class ProgramCounter extends Register {
	private static final int FIRST_INSTRUCTION = 0x00;
	
	public ProgramCounter(int value){
		super(FIRST_INSTRUCTION);
	}
	
	public void increment(){
		//this.address+= 1;
	}
}
