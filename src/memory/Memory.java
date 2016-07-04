package memory;

import processor.*;
import processor.instructions.*;

public class Memory {
	public static int MEMORYSIZE = 0xFF + 0x20;
	private Data buffer[];
	
	public Memory(){
		buffer = new Data[MEMORYSIZE];
	}
	
	public Data accessInstruction(int index){
		if (index >= 0 && index < 256){
			return buffer[index];
		}
		return null;
	}
	
	public Data accessData(int index){
		if (index >= 0xFF && index < 0xFF + 0x20){
			return buffer[index];
		}
		return null;
	}
	
	public boolean storeInstruction(int index, Data item){
		if (index >= 0 && index < 256){
			buffer[index] = item; 
			return true;
		}
		return false;
	}
	public boolean storeData(){
		return true;
	}
	
}
