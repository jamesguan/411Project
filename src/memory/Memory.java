package memory;

import processor.*;
import processor.instructions.*;

public class Memory {
	public static int MEMORYSIZE = 0xFF + 0x20;
	private Data buffer[];
	private int freeInstructionIndex;
	
	public Memory(){
		this.freeInstructionIndex = 0;
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
	
	public boolean addInstruction(Data item){
		if (freeInstructionIndex >= 0 && freeInstructionIndex < 256 && buffer[freeInstructionIndex] == null){
			buffer[freeInstructionIndex] = item; 
			freeInstructionIndex++;
			return true;
		}
		return false;
	}
	public boolean storeData(){
		return true;
	}
	
	public String toString(){
		String str = "\n";
		str = str + "Memorysize: " + MEMORYSIZE + "\n";
		for (int i = 0; i < buffer.length; i++){
			if (buffer[i] == null){
				
			}
			else {
				str = str + buffer[i].toString() + "\n";
			}
		}
		return str;
	}
	
}
