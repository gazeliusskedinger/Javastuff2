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
public class Word implements Comparable{
    
    private final String word;
    private final int HASH_MULTIPLIER = 31;
    private String otherWord;
    
    public Word(String str) { 
        word = str;
    }
    
    @Override
    public String toString() { 
        return word;
    }
   
    /* Override Object methods */
    @Override
    public int hashCode() {
        int hash = 0;
        String wordForHash = homoLetterTypeWord();
        for(int i = 0; i < wordForHash.length(); i++ ){
            hash = HASH_MULTIPLIER * hash + wordForHash.charAt(i);
        }
        return hash;
    }
    @Override
    public boolean equals(Object other) {
        if(hashCode() == other.hashCode()){
             return true;
        }
        else{
            return false;
        }
    }
    @Override
    public int compareTo(Object o) {
        if(hashCode() < o.hashCode()){
            return -1;
        }
        else if(o.hashCode() == hashCode()){
            return 0;
        }
        else{
            return 1;
        }
    }
    public String homoLetterTypeWord(){
        return word.toLowerCase();
    }
    

}
