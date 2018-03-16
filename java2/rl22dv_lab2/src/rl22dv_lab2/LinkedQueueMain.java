/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rl22dv_lab2;

import java.util.Iterator;

/**
 *
 * @author delorian1986
 */
public class LinkedQueueMain{
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue queue = new LinkedQue();
        
        queue.enqueue("fisk"); // 1
        queue.enqueue("lök"); //2
        queue.enqueue("potatis"); //3
        queue.enqueue("majonäs"); //4
        System.out.println("size = "+queue.size()); // 4
        Iterator list = queue.iterator(); //  list the stuff
        while(list.hasNext()){
            System.out.println(list.next()+", ");  
           
        }
        System.out.println("dequeue: "+queue.dequeue()); // dequeue fisk
        System.out.println("first: "+ queue.first()); //  första vardet = lök
        System.out.println("last: "+ queue.last()); //  sista vardet
        System.out.println(queue.toString()); // listar allt innehåll 
    }
    
}
