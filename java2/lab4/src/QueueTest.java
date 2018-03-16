import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class QueueTest {

    @Test
    // test queue empty on string and int
    public void testIsEmpty(){
        Queue<Integer> queInt = new LinkedQue<Integer>();
        
        assertEquals(true, queInt.isEmpty());
        assertEquals(0, queInt.size());

        Queue<String> queStr = new LinkedQue<String>();
        
        assertEquals(true,queStr.isEmpty());
        assertEquals(0,queStr.size());

    }
    
    @Test (expected = NullPointerException.class)
    public void forceExceptionFirstInt(){
    	Queue<Integer> queInt = new LinkedQue<Integer>();
    	
    	int foo = queInt.first();
    }
    
    @Test (expected = NullPointerException.class)
    public void forceExceptionLastInt(){
    	Queue<Integer> queInt = new LinkedQue<Integer>();
    	
    	int foo = queInt.last();
    }
    
    @Test (expected = NullPointerException.class)
    public void forceExceptionFirstStr(){
    	Queue<String> queStr = new LinkedQue<String>();
    	String foo = queStr.first();
    }
    
    @Test (expected = NullPointerException.class)
    public void forceExceptionLastStr(){
    	Queue<String> queStr = new LinkedQue<String>();
    	String foo = queStr.last();
    }
    
    @Test (expected = NullPointerException.class)
    public void forceExceptionDequeueInt(){
    	Queue<Integer> queInt = new LinkedQue<Integer>();
    	
    	int foo = queInt.dequeue();
    }
    
    @Test (expected = NullPointerException.class)
    public void forceExceptionDequeueStr(){
    	Queue<String> queStr = new LinkedQue<String>();
    	
    	String foo = queStr.dequeue();
    }
    @Test
    public void testOneInput(){
    	
    	// test Int
    	Queue<Integer> queInt = new LinkedQue<Integer>();
    	
    	queInt.enqueue(123);
    	
    	// testing size and isEmpty for one input.
    	assertEquals(false, queInt.isEmpty());
    	assertEquals(1, queInt.size());
    	
    	// testing the first and last.
    	assertEquals((Integer)123, queInt.first());
    	assertEquals((Integer)123, queInt.last());
    	
    	// testing the iterator
    	Iterator it = queInt.iterator();
    	while(it.hasNext()){
    		System.out.println(it.next());
    	}
    	
    	// test dequeue
    	assertEquals((Integer)123, queInt.dequeue());
    	
    	// test size and isEmpty
    	assertEquals(0,queInt.size());
    	assertEquals(true, queInt.isEmpty());
    	
    	
    	Queue<String> queStr = new LinkedQue<String>();
    	
    	queStr.enqueue("123");
    	
    	// testing size and isEmpty for one input.
    	assertEquals(false, queStr.isEmpty());
    	assertEquals(1, queStr.size());
    	
    	// testing the first and last.
    	assertEquals("123", queStr.first());
    	assertEquals("123", queStr.last());
    	
    	// testing the iterator
    	Iterator ite = queStr.iterator();
    	while(ite.hasNext()){
    		System.out.println(ite.next());
    	}
    	
    	
    	
    }
    
    @Test
    public void testMoreElements(){
    	//making test arrays
	    String[] testInputAndOutputStr = {"great","barrier","reef"};
	    int[] testInputAndOutputInt = {123,456,789};
	    
	    //testing String 
		Queue<String> queStr = new LinkedQue<String>();
		for(int i = 0; i < testInputAndOutputStr.length;i++){
			queStr.enqueue(testInputAndOutputStr[i]);
		}
		
		// test isEmpty and size
		assertEquals(3,queStr.size());
		assertEquals(false,queStr.isEmpty());
		
		// test last and first
		assertEquals("great",queStr.first());
		assertEquals("reef",queStr.last());
		
		// test iterator
		Iterator itStr = queStr.iterator();
		int j = 0; 
		while(itStr.hasNext()){
			assertEquals(testInputAndOutputStr[j],itStr.next());
			j++;
		}
		
		// test dequeue
		for(int i = 0; i < testInputAndOutputStr.length;i++){
			assertEquals(testInputAndOutputStr[i],queStr.dequeue() );
		}
		
		// test isEmpty and size
		assertEquals(0,queStr.size());
		assertEquals(true,queStr.isEmpty());
		
		//testing int 
		Queue<Integer> queInt = new LinkedQue<Integer>();
		for(int i = 0; i < testInputAndOutputInt.length;i++){
			queInt.enqueue(testInputAndOutputInt[i]);
		}
		
		// test isEmpty and size
		assertEquals(3,queInt.size());
		assertEquals(false,queInt.isEmpty());
		
		// test last and first
		assertEquals((Integer)123,queInt.first());
		assertEquals((Integer)789,queInt.last());
		
		// test iterator
		Iterator itInt = queInt.iterator();
		j = 0; 
		while(itInt.hasNext()){
			assertEquals(testInputAndOutputInt[j],itInt.next());
			j++;
		}
		
		// test dequeue
		for(int i = 0; i < testInputAndOutputInt.length;i++){
			assertEquals((Integer)testInputAndOutputInt[i],queInt.dequeue() );
		}
		
		// test isEmpty and size
		assertEquals(0,queInt.size());
		assertEquals(true,queInt.isEmpty());
		
		
	}
}
