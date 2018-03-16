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
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Iterator;

public class WordCount1Main {
    
   static HashSet hs = new HashSet();
   static TreeSet ts = new TreeSet();
    public static void main(String[] args){
        FileHandler fh = new FileHandler();
        TextTools tt = new TextTools();
        Scanner in = new Scanner(System.in);
        System.out.print("Ange url till in fil: ");
        String url = in.nextLine();
        in.close();
        try{
            String words = fh.fileReader(url);
            String[] dividedWords = tt.divideToArray(words);
            addArrayToHashSet(dividedWords);
            System.out.println(hs.size());
            addArrayToTreeSet(dividedWords);
            Iterator list = ts.iterator();
            while(list.hasNext()){
                System.out.println(list.next());
            }
        }
        catch(FileNotFoundException e){
            System.err.println(e.toString());
            
        }
        
        
    }
    private static void addArrayToHashSet(String[] text){
        for(int i = 0; i < text.length; i++ ){
            
            hs.add(new Word(text[i]));
        }
    }
    private static void addArrayToTreeSet(String[] text){
        for(int i = 0; i < text.length; i++ ){
            
            ts.add(new Word(text[i]));
        }
    }
}
