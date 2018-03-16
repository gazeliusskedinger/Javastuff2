package number6;

public class BinaryIntHeap implements IBinaryHeap{
	
	private int[] Heap = new int[8];
	private int size;
	
	public BinaryIntHeap() {
		Heap[0] = 0;
		size = 1;
	}

	private int[] reSize(int[] oldHeap){
		int[] newHeap = new int[oldHeap.length*2];
		for(int i = 0; i<oldHeap.length; i++){
			newHeap[i] = oldHeap[i];
		}
		return newHeap;
	}
	//As reference for this function i used Cay Horstmann Big java book. 
	public void insert(int n) {
		if(size == Heap.length){
			Heap = reSize(Heap);
		}
		int place = size;
		while(place > 1 && Heap[place/2] < n){
				setHeapAtPosition(place, Heap[place/2]);
				place = place/2;
		}
		setHeapAtPosition(place, n);
		size++;
	}
	
	private int[] setHeapAtPosition(int i, int element){
		
		// checks if array is full
		if(size+1 == Heap.length){
			Heap = reSize(Heap);
		}
		
		int temp;
		
		//Move everything 1 step forward the place 
		//where it needs to be inserted     
		for(int j = i; j >= Heap.length ; j--){
			temp = Heap[j];
			Heap[j+1] = temp;
		}
		
		// inserts the element
		Heap[i] = element;
		
		return Heap;
	}
	// As reference for this funktion i used the Cay Horstmann Big java book. 
	private void resortHeap(){
		
		int root = Heap[1];
		
		int lastIndex = size - 1;
		
		int i = 1;
		boolean moreToSort = true;
		while(moreToSort){
			int childIndex = i*2;
			if(childIndex <= lastIndex){
				int child = Heap[childIndex];
				if(((i*2+1) <= lastIndex) && (Heap[i*2+1]>child)){
					childIndex = i*2+1;
					child = Heap[2*i+1];
				}
				if(child>root){
					Heap = setHeapAtPosition(i, child);
					i = childIndex;
				}
				else{
					moreToSort = false;
				}
			}
			else{
				moreToSort = false;
			}
		}
		Heap = setHeapAtPosition(i,root);
	} 
	
	public int pullHighest() {
		if(isEmpty()){
			throw new ArrayIndexOutOfBoundsException();
		}
		else{
			int highest = Heap[1];
			
			if(size-1 > 1){
				Heap = setHeapAtPosition(1, Heap[size-1]);
				Heap[size-1] = 0;
				resortHeap();
			}
			
			size--;
			return highest;
		}
	}
	
	public int size() {
		return size - 1;
	}

	public boolean isEmpty() {
		if(size <= 1){
			return true;
		}
		else{
			return false;
		}
	}

	// a simple test print function for debugging
	public String toString(){
		String text= "";
		for(int i = 1; i < size; i++){
			text = text + Heap[i];
			if(i < size-1){
				text= text+",";
			}
			
		}
		return text;
	}
}
