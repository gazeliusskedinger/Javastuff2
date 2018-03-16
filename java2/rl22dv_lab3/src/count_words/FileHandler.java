/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count_words;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author delorian1986
 */
public class FileHandler {
    
    public FileHandler(){
        
    }
    
    public String fileReader(String urlIn)throws FileNotFoundException{
        
        File inFile = new File(urlIn);
       
            
        Scanner fileInput = new Scanner(inFile);

        String text = "";

        while(fileInput.hasNextLine()){
            //System.out.println(fileInput.nextLine());
            text += fileInput.nextLine();
        }
        return text;
        
        
    }
    
    public void filePrinter(String text, String urlOut)throws IOException {
        
        File outFile = new File(urlOut);
        FileWriter output = new FileWriter(outFile.getAbsoluteFile());
        BufferedWriter out = new BufferedWriter(output);
        
        if(!outFile.exists()){
            outFile.createNewFile();
            out.write(text);
        }
        else{
            System.out.print(text);
        }
        out.close();
    }
    
}
