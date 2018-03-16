/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count_words;

/**
 *
 * @author delorian1986
 */
import java.util.Scanner;
public class IdentifyWordsMain {
    public static void main(String[] args){
        
        TextTools tt = new TextTools();
        Scanner in = new Scanner(System.in);
        FileHandler fh = new FileHandler();
        
        System.out.print("Ange url till fil: ");
        String url = in.nextLine();
        System.out.print("Ange url till fil ut: ");
        String urlUt = in.nextLine();
        try{
            String text = fh.fileReader(url);
            String text2 = tt.removeSpecials(text);
            fh.filePrinter(text2, urlUt);
        }
        catch(Exception e){
            System.err.println(e.toString());
        }
        in.close();
        
        
    }
}
