/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author delorian1986
 */
public class DataHandler {
    
    DataHandler(){
        
    }
    // hämtar data från fil
    private String fileReader(String url) throws FileNotFoundException{
        
        String text = "";
        File file = new File(url);
        Scanner fileScan = new Scanner(file);
        
        while(fileScan.hasNextLine()){
            
            String test =fileScan.nextLine();
            
            if(isNum(test)){
                text = text + test + "\n";
            }
        }
        return text;
    }
    // kollar att det inlästa talet faktiskt är ett tal
    private boolean isNum(String text){
        boolean test = true;
        try{
            double numbers = (double)Double.parseDouble(text);
            return true; 
        }
        catch(Exception e){
            return false;
        }
    }
    // gör om en nummer string till array
    private double[] stringToDataArray(String text){
        
        String[] temp = text.split("\n");
        double[] numberArray = new double[temp.length];
        for(int i = 0; i < temp.length;i++){
            
            numberArray[i] = (double)Double.parseDouble(temp[i]);  
                    
        }
        
        return numberArray; 
    
    }
    
    // behandlar all data
    private int[] dataCounter(double[] inputData ){
        int[] data = new int[11];
        for(int i = 0; i < data.length; i++){
            data[i] = 0;
        }
        
        for(int i = 0; i < inputData.length;i++){
            
            if(inputData[i] <= 10 && inputData[i] >= 1 ){
                data[0]++;
            }
            else if(inputData[i] <= 20 && inputData[i] >= 11 ){
                data[1]++;
            }
            else if(inputData[i] <= 30 && inputData[i] >= 21 ){
                data[2]++;
            }
            else if(inputData[i] <= 40 && inputData[i] >= 31 ){
                data[3]++;
            }
            else if(inputData[i] <= 50 && inputData[i] >= 41 ){
                data[4]++;
            }
            else if(inputData[i] <= 60 && inputData[i] >= 51 ){
                data[5]++;
            }
            else if(inputData[i] <= 70 && inputData[i] >= 61 ){
                data[6]++;
            }
            else if(inputData[i] <= 80 && inputData[i] >= 71 ){
                data[7]++;
            }
            else if(inputData[i] <= 90 && inputData[i] >= 81 ){
                data[8]++;
            }
            else if(inputData[i] <= 100 && inputData[i] >= 91 ){
                data[9]++;
            }
            else if(inputData[i] >= 101 ){
                data[10]++;
            }
        }
        return data;
    } 
    // en samlingns funktion för allt
    public int[] dataFuntion(String url)throws FileNotFoundException {
        String stuff = fileReader(url);
        double[] data = stringToDataArray(stuff);
        int[] sortedData = dataCounter(data);
        
        return sortedData;
    }
}
