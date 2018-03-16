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
import java.util.HashSet;
import java.util.TreeSet;

public class TextTools {
    
    public String removeSpecials(String text){
        String textOut = "";
        char test;
        int testAscii = 0;
        for(int i = 0; i < text.length(); i++){
            test = text.charAt(i);
            testAscii = (int)test; 
            if(Character.isLetter(test) || testAscii == 9 || testAscii == 13 || testAscii == 10|| testAscii == 32){
                textOut += text.charAt(i);
            } 
        }
        return textOut;
    }
    public static String[] divideToArray(String text){
        return text.split(" ");
    }
    
}
