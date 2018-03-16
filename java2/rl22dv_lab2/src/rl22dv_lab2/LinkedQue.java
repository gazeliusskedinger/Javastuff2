/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rl22dv_lab2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author delorian1986
 */
public class LinkedQue implements Queue{
    
    private Node first = null;
    private Node last = null;
    private int size = 0;
    
    @Override
    public int size() {
        return size;
    }

    
    @Override
    public boolean isEmpty() {
       if(first == null){
           return true;
       }
       else{
           return false;
       }
    }

   
    @Override
    
    public void enqueue(Object element) {
        // om första är noll sätt både första och sista til samma
        if(first == null){
            first = new Node(element);
            last = first;
        }
        // annars sätt till sist 
        else{
            last.Next = new Node(element);
            last = last.Next;
        }
        size++;   
            
    }

    @Override
    
    public Object dequeue() {
        if(first == null){
            throw new NoSuchElementException();
        }
        // ta bort första och sätt efter till ny först
        Node ret = first;
        first = ret.Next;
        size--;
        return ret.data;
        
    }
    
    @Override
    public Object first() {
        if(first == null){
            throw new NoSuchElementException();
        }
        return first.data;
    }
    
    @Override
    public Object last() {
        if(first == null){
            throw new NoSuchElementException();
        }
        return last.data;
    }
    // skapar sträng meh listans innehåll
    public String toString(){
        String text = "";
        int place = 0;
        Iterator list = iterator();
        while(list.hasNext()){
            text+="plats : "+place+" = "+list.next()+"\n";  
            place++;
        }
        return text;
    }
    
    @Override
    public Iterator iterator() {
        return new LinkedQueIterator();
    }
    // iteratorn
    public class LinkedQueIterator implements Iterator{
        
        private Node position;
        private Node previous;
        private boolean isAfterNext;
        
        public LinkedQueIterator(){
            position = null;
            previous = null;
            isAfterNext = false;
        }
        // kollar om första är null eller om nästa är null
        @Override
        public boolean hasNext() {
            if(position == null){
                return first != null;
            }
            else{
                return position.Next != null;
            }
        }
// kollar om den gått igenom första, stegar framåt och sedan returnerar datan. 
        @Override
        public Object next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            previous = position;
            isAfterNext = true;
            if(position == null){
                position = first;
            }
            else{
                position = position.Next;
            }
            return position.data;
        } 
    }
    
    public class Node{
        public Object data;
        public Node Next;
        Node(Object element){
            data = element;
        }
    }
}
