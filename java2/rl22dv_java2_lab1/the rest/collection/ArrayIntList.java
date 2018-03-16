package collection;

public class ArrayIntList extends AbstractIntCollection implements IntList{


	public void add(int n) {
		
		if(size == values.length){
			resize();
		}
		
		values[size] = n;
		size++;
		
		// TODO Auto-generated method stub
		
	}

	public void addAt(int n, int index) throws IndexOutOfBoundsException {
		
		if(index > size - 1){
			
			throw new IndexOutOfBoundsException();
			
		}
		else{
			
			int[] tempArray = new int[size-index];
			int tempArrayPlats = 0;
			
			if(size+1 > values.length){
				resize();
			}
			
			for(int i = index; i < size; i++){
				
				tempArray[tempArrayPlats] = values[i];
				tempArrayPlats++;
				
			}
			
			tempArrayPlats = 0;
			
			for(int i = index+1; i<size+1;i++){
				
				values[i] = tempArray[tempArrayPlats];
				tempArrayPlats++;
				
			}
			
			values[index] = n;
			size++;
				
		}
		
		// TODO Auto-generated method stub
		
	}

	public void remove(int index) throws IndexOutOfBoundsException {
		if(index+1 > size-1){
			throw new IndexOutOfBoundsException();
		}
		else{
			
			int[] tempArray = new int[size-(index+1)];
			int tempArrayPlats = 0;
			
			for(int i = index+1 ; i < size; i++){
				
				tempArray[tempArrayPlats] = values[i];
				tempArrayPlats++;
				
			}
			
			tempArrayPlats = 0;
			
			for(int i = index; i < size-1; i++){
				
				values[i] = tempArray[tempArrayPlats];
				tempArrayPlats++;
				
			}
			
			size--;
			
		}
		// TODO Auto-generated method stub
		
	}

	public int get(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if(index > size-1){
			
			throw new IndexOutOfBoundsException();
			
		}
		else{
			
			return values[index];
			
		}
		
	}

	public int indexOf(int n) {
		int tal  = 0;
		boolean found = false;
		while(n != values[tal] && tal != values.length-1){
			tal++;
			if(n == values[tal]){
				found= true;
			}
		}
		if(found == false){
			return -1;
		}
		else{
			return tal;
		}
	}
}
