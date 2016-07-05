package processor.instructions;

public class LW extends IType{
	
	
	public LW(int rs, int rt, int immediate){
		super(LW, rs, rt, immediate);
	}
	
	public LW( int rt, String data){
		super(LW, grabRS(data), rt, grabImmediate(data));
	}
	
	
}
