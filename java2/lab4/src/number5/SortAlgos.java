/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number5;

/**
 *
 * @author delorian1986
 */
public class SortAlgos implements SortingAlgorithms{

    @Override
    public int[] insertionSort(int[] in) {
        boolean sorted = false;
        int temp;
        if(in.length == 0){
            System.out.println("there is nothing to sort! ");
            return in;
        }
        else if(in.length < 2){
            System.out.println("there is not enough argumenst to sort");
            return in;
        }
        else{
            while(sorted != true){
                sorted = true;
                for(int i = 0; i < in.length-1; i++ ){    
                    if(in[i] > in[i+1]){
                        sorted = false;
                        temp = in[i];
                        in[i] = in[i +1];
                        in[i +1] = temp;
                    }
                }
            }
        }
        return in;
    }

    @Override
    public int[] mergeSort(int[] in) {
        if(in.length <= 1){
            return in;
        }
        int[] halfOne = new int[in.length / 2];
        int[] halfTwo = new int[in.length - halfOne.length];
        for(int i = 0; i < halfOne.length; i++ ){
            halfOne[i] = in[i];
        }
        for(int i = 0; i < halfTwo.length; i++){
            halfTwo[i] = in[halfOne.length+i];
        }
        halfOne = mergeSort(halfOne);
        halfTwo = mergeSort(halfTwo);
        int[] whole = merge(halfOne,halfTwo);
        return whole;
    }
    
    private int[] merge(int[] halfOne, int[] halfTwo){
       
        int nrHalfOne = 0;
        int nrHalfTwo = 0;
        int plats = 0;
        int[] whole = new int[halfOne.length +halfTwo.length];
        while(nrHalfOne < halfOne.length && nrHalfTwo < halfTwo.length){
            if(halfOne[nrHalfOne] < halfTwo[nrHalfTwo]){
                whole[plats] = halfOne[nrHalfOne];
                nrHalfOne++;
            }
            else{
                whole[plats] = halfTwo[nrHalfTwo];
                nrHalfTwo++;
            }
            plats++;
        }
        while(nrHalfOne < halfOne.length){
            whole[plats++] = halfOne[nrHalfOne++];
        }
        while(nrHalfTwo < halfTwo.length){
            whole[plats++] = halfTwo[nrHalfTwo++];
        }
        return whole;
    }

    @Override
    public String[] insertionSort(String[] in) {
        
        boolean sorted = false;
        String temp;
        String wordOne;
        
        if(in.length == 0){
            System.out.println("there is nothing to sort! ");
            return in;
        }
        else if(in.length < 2){
            System.out.println("there is not enough argumenst to sort");
            return in;
        }
        else{
            while(sorted != true){
                sorted = true;
                for(int i = 0; i < in.length-1; i++ ){
                    wordOne = in[i];
                    if(wordOne.compareTo(in[i+1]) > 0){
                        sorted = false;
                        temp = in[i];
                        in[i] = in[i +1];
                        in[i +1] = temp;
                    }
                }
            }
        }
        return in;
    }

    @Override
    public String[] mergeSort(String[] in) {
        if(in.length <= 1){
            return in;
        }
        String[] halfOne = new String[in.length / 2];
        String[] halfTwo = new String[in.length - halfOne.length];
        for(int i = 0; i < halfOne.length; i++ ){
            halfOne[i] = in[i];
        }
        for(int i = 0; i < halfTwo.length; i++){
            halfTwo[i] = in[halfOne.length+i];
        }
        halfOne = mergeSort(halfOne);
        halfTwo = mergeSort(halfTwo);
        String[] whole = merge(halfOne,halfTwo);
        return whole;
    }
    
    private String[] merge(String[] halfOne, String[] halfTwo){

        int nrHalfOne = 0;
        int nrHalfTwo = 0;
        int plats = 0;
        String thing;
        String[] whole = new String[halfOne.length +halfTwo.length];
        while(nrHalfOne < halfOne.length && nrHalfTwo < halfTwo.length){
            
            if(halfOne[nrHalfOne].compareTo(halfTwo[nrHalfTwo]) < 0) {
                whole[plats] = halfOne[nrHalfOne];
                nrHalfOne++;
            }
            else{
                whole[plats] = halfTwo[nrHalfTwo];
                nrHalfTwo++;
            }
            plats++;
        }
        while(nrHalfOne < halfOne.length){
            whole[plats++] = halfOne[nrHalfOne++];
        }
        while(nrHalfTwo < halfTwo.length){
            whole[plats++] = halfTwo[nrHalfTwo++];
        }
        return whole;
    }
    
    
}
