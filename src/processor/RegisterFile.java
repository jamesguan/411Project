package processor;

public class RegisterFile {
	private int registers [];
	private boolean writeDisabled;
	
	public void disableWrite(){
		this.writeDisabled = true;
	}
}
