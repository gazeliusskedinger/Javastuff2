package java2_rl22dv_lab1;

import java.io.File;
import java.util.Scanner;


public class PrintJavaFiles {
	
	public static void main(String[] args) {
		String path = "";
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("File path: ");
		path = input.nextLine();
		
		File directory = new File(path);
		
		fileCrawler(directory);
		
		input.close();
	}
	
	public static void fileCrawler(File directory){
		
		if(directory.exists()){
			
			System.out.println(directory);
			
			if(directory.isDirectory()){
				System.out.println(directory.toString());
				File[] folders = directory.listFiles();
				for(File files : folders){
					fileCrawler(files);
				}
			}
		}
		else{
			System.err.println("there is no such directory!");
		}
	}
}
