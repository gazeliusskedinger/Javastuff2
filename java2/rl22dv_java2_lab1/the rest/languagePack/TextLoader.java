package languagePack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextLoader {
	
	public static String fileReader()throws FileNotFoundException{
		
		System.out.print("Ange filepath: ");
		Scanner input = new Scanner(System.in);
		StringBuilder inputData = new StringBuilder();
		
		String data = "";
		String sokvag = input.nextLine();
		
		File file = new File(sokvag);
		Scanner inFile = new Scanner(file);
		// adderar data radvis till en sträng
		while(inFile.hasNextLine()){
			inputData.append(inFile.nextLine()+"\n");
		}
		
		data = inputData.toString();
		
		inFile.close();
		input.close();
		
		return data;
	}
}
