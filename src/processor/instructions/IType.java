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
	
	protected static int grabImmediate(String temp){
		int val = 0;
		//System.out.println("TEMP" + temp);
		if (temp.contains("(")){
			String [] hold = temp.split("\\(");
			for (int i = 0; i < hold.length; i++){
				System.out.print("HOLD: " + hold[i]);
				hold[i] = hold[i].replaceAll("\\(", "");
				hold[i] = hold[i].replaceAll("\\)", "");
				hold[i] = hold[i].replaceAll("R", "");
				System.out.println("");
				
			}
			//System.out.println("HOLD1: " + hold[1]) ;
			
			val = Integer.parseInt(hold[0]) + Integer.parseInt(hold[1]);
			
		}
		return val;
	}
	
	protected static int grabRS(String temp){
		int val = 0;
		//System.out.println("TEMP" + temp);
		if (temp.contains("(")){
			String [] hold = temp.split("\\(");
			for (int i = 0; i < hold.length; i++){
				System.out.print("HOLD: " + hold[i]);
				hold[i] = hold[i].replaceAll("\\(", "");
				hold[i] = hold[i].replaceAll("\\)", "");
				hold[i] = hold[i].replaceAll("R", "");
				System.out.println("");
			}
			//System.out.println("HOLD1: " + hold[1]) ;
			val = Integer.parseInt(hold[1]);
			
		}
		return val;
	}
}
