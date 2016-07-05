package proj;

import processor.*;
import processor.cache.*;
import processor.instructions.*;
import java.util.Scanner;
import java.util.regex.*;

import memory.*;

import java.io.*;



public class simulator {
	public static String INSTFILE = "inst.txt";
	public static String DATAFILE = "data.txt";
	public static byte REGISTERS = 32;
	public static Register [] registers = new Register[REGISTERS];
	public static Cache iCache = new Cache(20, 2, 8);
	public static Cache dCache = new Cache(20, 4, 4);
	
	public static Memory MEMORY = new Memory();
	
	public static void main(String [] args){
		Scanner reader = new Scanner(System.in);
	
		//System.out.println("Please enter the file name: ");
		String fileName = args[0];
		String dataName = args[1];
		
		try {
			// FileReader reads text files in the default encoding.
			//FileReader fileReader = new FileReader(fileName);
			Scanner fileReader = new Scanner(new File(fileName));
			INSTFILE = fileName;
			parseInstFile(fileReader);
			fileReader.close();
			Scanner dataReader = new Scanner(new File(dataName));
			DATAFILE = dataName;
			parseDataFile(dataReader);
			fileReader.close();
			dataReader.close();
			System.out.println(MEMORY);

		}
		catch (FileNotFoundException ex){
			 System.out.println(
		                "Unable to open file '" + 
		                fileName + "'");
			 System.exit(1);
		}
		
	}
	
	public static void parseInstFile(Scanner fileReader){
		int counter = 0;
		while(fileReader.hasNextLine() && counter <= 255)
		{
			String str = fileReader.nextLine().trim().toUpperCase().replace(",", "");
			//\\s+|\\t+ Matches multiple spaces or tabs'
			
			if (str.equals("")){
				
			}
			else{
				
			    String [] temp = str.split("[\\x00-\\x20]+|[\\x7F-\\xFF]+");
			    for (int i = 0; i < temp.length; i++){
			    	//temp[i] = temp[i].replace(",", "");
			    	
			    	/*System.out.println(temp[i]);
			    	if (temp[i].contains(":")){
			    		System.out.println("This is going to be a label");
			    	}
			    	*/
			    	
			    	
			    }
			    storeInstruction(temp);
			    //System.out.println("Counter: " + counter);
			    counter++;
			    //System.out.println("___________________");
			}
		}
	}
	
	
	public static void parseDataFile(Scanner fileReader){
		while(fileReader.hasNextLine())
		{
			String str = fileReader.nextLine().trim().toUpperCase().replace(",", "");
			//\\s+|\\t+ Matches multiple spaces or tabs'
			
		    String [] temp = str.split("[\\x00-\\x20]+|[\\x7F-\\xFF]+");
		    for (int i = 0; i < temp.length; i++){
		    	//temp[i] = temp[i];
		    	//System.out.println(temp[i]);
		    	/*
		    	if (temp[i].contains(":")){
		    		System.out.println("This is going to be a label");
		    	}
		    	*/
		    	
		    	
		    }
		    //System.out.println("___________________");
		}
	}
	
	public static void storeInstruction(String [] temp){
		
		int position = 0;
		
		String label = "";
		String instruction = "";
		if (temp[position].contains(":")){
			label = temp[position].replace(":", "");
    		System.out.print("Label: " + label + " ");
    		position++;
		}
		
		instruction = temp[position];
		//System.out.println(instruction);
		
		switch(temp[position]){
			case "LW":
				instruction = "LW";
				
				break;
			case "SW":
				instruction = "SW";
				break;
			case "LI":
				MEMORY.addInstruction(new LI(0,grabDigits(temp[position+1]), grabDigits(temp[position+2])));
				break;
			case "ADD":
				MEMORY.addInstruction(new ADD(grabDigits(temp[position+2]), grabDigits(temp[position+3]), grabDigits(temp[position+1]), 0));
				break;
			case "ADDI":
				MEMORY.addInstruction(new ADDI(grabDigits(temp[position+2]),grabDigits(temp[position+1]), grabDigits(temp[position+3])));
				break;
			case "MULT":
				instruction = "MULT";
				break;
			case "MULTI":
				instruction = "MULTI";
				break;
			case "SUB":
				MEMORY.addInstruction(new SUB(grabDigits(temp[position+2]), grabDigits(temp[position+3]), grabDigits(temp[position+1]), 0));
				break;
			case "SUBI":
				instruction = "SUBI";
				break;
			case "AND":
				MEMORY.addInstruction(new AND(grabDigits(temp[position+2]), grabDigits(temp[position+3]), grabDigits(temp[position+1]), 0));
				break;
			case "ANDI":
				instruction = "ANDI";
				break;
			case "OR":
				MEMORY.addInstruction(new OR(grabDigits(temp[position+2]), grabDigits(temp[position+3]), grabDigits(temp[position+1]), 0));
				break;
			case "ORI":
				instruction = "ORI";
				break;
			case "SLL":
				instruction = "SLL";
				break;
			case "SRL":
				instruction = "SRL";
				break;
			case "SRA":
				instruction = "SRA";
				break;
			case "BEQ":
				instruction = "BEQ";
				break;
			case "BNE":
				instruction = "BNE";
				break;
			case "J":
				instruction = "J";
				break;
			case "HLT":
				instruction = "HLT";
				break;
		}
		
		
		
	}
	public static int grabDigits(String temp){
		//int val = Integer.parseInt(temp.replace("[^\\d]", ""));
		//System.out.println(temp.replaceAll("[^0-9]+", ""));
		int val = Integer.parseInt(temp.replaceAll("^\\D", ""));
		//int val = 0;
		//System.out.println("Original: " +  " Val: " + val);
		return val;
	}
}
