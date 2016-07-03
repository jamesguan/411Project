package proj;

import processor.*;
import processor.cache.*;
import processor.instructions.*;
import java.util.Scanner;
import java.util.regex.*;
import java.io.*;



public class simulator {
	public static String INSTFILE = "inst.txt";
	public static String DATAFILE = "data.txt";
	public static byte REGISTERS = 32;
	public static Register [] registers = new Register[REGISTERS];
	public static Cache iCache = new Cache(20, 2, 8);
	public static Cache dCache = new Cache(20, 4, 4);
	
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

		}
		catch (FileNotFoundException ex){
			 System.out.println(
		                "Unable to open file '" + 
		                fileName + "'");
			 System.exit(1);
		}
		
	}
	
	public static void parseInstFile(Scanner fileReader){
		while(fileReader.hasNextLine())
		{
			String str = fileReader.nextLine().trim().toUpperCase();
			//\\s+|\\t+ Matches multiple spaces or tabs'
			
		    String [] temp = str.split("[\\x00-\\x20]+|[\\x7F-\\xFF]+");
		    for (int i = 0; i < temp.length; i++){
		    	temp[i] = temp[i].replace(",", "");
		    	System.out.println(temp[i]);
		    	if (temp[i].contains(":")){
		    		System.out.println("This is going to be a label");
		    	}
		    }
		    System.out.println("___________________");
		}
	}
	
	
	public static void parseDataFile(Scanner fileReader){
		while(fileReader.hasNextLine())
		{
			String str = fileReader.nextLine().trim().toUpperCase();
			//\\s+|\\t+ Matches multiple spaces or tabs'
			
		    String [] temp = str.split("[\\x00-\\x20]+|[\\x7F-\\xFF]+");
		    for (int i = 0; i < temp.length; i++){
		    	temp[i] = temp[i].replace(",", "");
		    	System.out.println(temp[i]);
		    	if (temp[i].contains(":")){
		    		System.out.println("This is going to be a label");
		    	}
		    }
		    System.out.println("___________________");
		}
	}
	//public static void 
}
