package number6;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryIntHeapTest {

	@Test (expected = ArrayIndexOutOfBoundsException.class )
	//test when heap is empty and force exception on pull
	public void testIsEmpty(){
		
		IBinaryHeap bh = new BinaryIntHeap();
		
		assertEquals(true, bh.isEmpty());
		assertEquals(0, bh.size());
		
		int h = bh.pullHighest();
		
	}
	@Test 
	// one input 
	public void testOneInput(){
		
		IBinaryHeap bh = new BinaryIntHeap();
		
		bh.insert(1);
		assertEquals(false, bh.isEmpty());
		assertEquals(1, bh.size());
		int i = bh.pullHighest();
		assertEquals(true, bh.isEmpty());
		assertEquals(0, bh.size());
		
	}
	@Test ()
	public void testMoreInputs(){
		int[] before = {54,2,37,52,82,63,76,44,70,88,80,14,17,58,20,99};
		int[] after =  {99,88,82,80,76,70,63,58,54,52,44,37,20,17,14,2};
		String inHeap = "99,88,76,82,80,37,63,54,44,52,70,14,17,58,20,2";
		
		IBinaryHeap bh = new BinaryIntHeap();
		for(int i = 0; i < before.length; i++ ){
			bh.insert(before[i]);
		}
		assertEquals(inHeap, bh.toString());
		
		for(int i = 0; i < after.length; i++){
			assertEquals(after[i], bh.pullHighest() );
		}
		
	}
	
	
	
}
