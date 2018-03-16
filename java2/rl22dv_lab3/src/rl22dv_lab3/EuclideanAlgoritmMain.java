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
import java.util.Scanner;

public class EuclideanAlgoritmMain {
    static private int a;
    static private int b;
    static private int temp;
    static private String text = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       inputStep();
       checkHighest();
       eukAlgo();
    }
    
    static public void checkHighest(){
       if(b > a){
           temp = b;
           b = a;
           a = temp;
       } 
    }
    static public void inputStep(){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter two numbers: ");
       a = input.nextInt();
       b = input.nextInt();
       text = "GCD("+a+", "+b+")";
    }
    static public void eukAlgo(){
        
        while(b != 0){
            temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println(text+" = "+ a);
    }
    
}
