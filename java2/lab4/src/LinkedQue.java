/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author delorian1986
 */
public class LinkedQue<T> implements Queue<T>{
    
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
    
    public void enqueue(T element) {
        // om första är null sätt både första och sista till samma då det kommer enbart finnas ett element i queue'n
        if(first == null){
            first = new Node(element);
            last = first;
        }
        // annars sätt sista elementet till sist plats
        else{
            last.Next = new Node(element);
            last = last.Next;
        }
        size++;   
            
    }

    @Override
    
    public T dequeue() {
        if(first == null){
            throw new NullPointerException();
        }
        // ta bort första och sätt efter till ny först
        Node ret = first;
        first = ret.Next;
        size--;
        return ret.data;
        
    }
    
    @Override
    public T first() {
        if(first == null){
            throw new NullPointerException();
        }
        return first.data;
    }
    
    @Override
    public T last() {
        if(first == null){
            throw new NullPointerException();
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

        public T next() {
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
        public T data;
        public Node Next;
        Node( T element){
            data = element;
        }
    }
}
