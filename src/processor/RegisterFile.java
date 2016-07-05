package processor;

public class RegisterFile {
	private int registers [];
	private boolean writeDisable;
	
	public void disableWrite(){
		this.writeDisable = true;
	}
	public void enableWrite(){
		this.writeDisable = false;
	}
}
