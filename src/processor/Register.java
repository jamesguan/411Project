package processor;

public class Register {

	private int value;
	private boolean disableWrite;
	private int incomingValue;
	private boolean newValue;
	public Register(int value){
		this.value = value;
		this.disableWrite = false;
		this.incomingValue = 0;
		this.newValue = false;
	}
	
	public int getValue(){
		return value;
	}
	public void setValue(int value){
		this.incomingValue = value;
		this.newValue = true;
	}
	public void disableWrite(){
		this.disableWrite = true;
	}
	public void enableWrite(){
		this.disableWrite = false;
	}
}
