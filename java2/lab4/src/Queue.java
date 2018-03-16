/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Iterator;

/**
 *
 * @author delorian1986
 */
public interface Queue<T> {
    
   public int size();                     // current queue size 
   public boolean isEmpty();              // true if queue is empty 
   public void enqueue(T element);   // add element at end of queue
   public T dequeue();               // return and remove first element.
   public T first();                 // return (without removing) first element
   public T last();                  // return (without removing) last element
   public String toString();              // return a string representation of the queue content
   public Iterator iterator();            // element iterator
   
}
