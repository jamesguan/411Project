package processor.instructions;

public class RType extends Instruction{
	public static final int ROPCODE = 0x000;
	private int rs;
	private int rt;
	private int rd;
	private int offset;
	private int funct;
	
	public RType(int rs, int rt, int rd, int offset, int funct){
		super(ROPCODE);
		this.rs = rs;
		this.rt = rt;
		this.rd = rd;
		this.offset = offset;
		this.funct = funct;
	}
	
	public String translateFunct(){
		switch(this.funct){
			case  ADD_FUNCT:
				return "ADD";
			case  AND_FUNCT:
				return "AND";
			case  MULT_FUNCT:
				return "MULT";
			case  OR_FUNCT:
				return "OR";
			case  SLL_FUNCT:
				return "SLL";
			case  SRA_FUNCT:
				return "SRA";
			case  SRL_FUNCT:
				return "SRL";
			case  SUB_FUNCT:
				return "SUB";
		}
		return "";
	}
	
	public String toString(){
		String str = translateFunct() + " rs: " + rs + " rt: " + rt + " rd: " + rd
				+ " offset: " + offset + " funct: " + funct;
		return str;
	}
}
