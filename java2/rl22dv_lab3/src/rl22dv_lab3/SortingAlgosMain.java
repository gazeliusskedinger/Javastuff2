/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rl22dv_lab3;

/**
 *
 * @author delorian1986
 */

public class SortingAlgosMain {
    public static void main(String[] args){
        SortingAlgorithms sa = new SortAlgos();
        int[] tal = {6,3,8,2,9,0,34,-4,6};
        int[] test = sa.insertionSort(tal);
        toString(test); 
        String[] text = {"ost", "fisk", "kastrull", "apa", "gröt", "fläsk", "fläst"};
        String[] test2 = sa.insertionSort(text);
        toStringString(test2);
        test = sa.mergeSort(tal);
        toString(test);
        test2 = sa.mergeSort(test2);
        toStringString(test2);
    }
    private static void toString(int[] list){
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i]+", ");
            
        }
        System.out.println();
    }
    private static void toStringString(String[] list){
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i]+", ");
            
        }
        System.out.println();
    }
}


