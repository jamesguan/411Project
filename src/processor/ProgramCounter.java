package processor;

public class ProgramCounter extends Register {
	
	private int address;
	
	public ProgramCounter(){
		this.address = 0;
	}
	
	public void increment(){
		this.address+= 4;
	}
}
