package collection;

public class ArrayIntStack extends AbstractIntCollection implements IntStack{

	public void push(int n) {
		// TODO Auto-generated method stub
		values[size]=n;
		size++;
	}

	public int pop() throws IndexOutOfBoundsException {
		
		if(isEmpty()){
			
			throw new IndexOutOfBoundsException();
			
		}
		else{
			
			return values[--size];
			
		}
		// TODO Auto-generated method stub
		
	}

	public int peek() throws IndexOutOfBoundsException {
		
		if(isEmpty()){
			
			throw new IndexOutOfBoundsException();
			
		}
		else{
			
			return values[size-1];
			
		}
		
	}

}
