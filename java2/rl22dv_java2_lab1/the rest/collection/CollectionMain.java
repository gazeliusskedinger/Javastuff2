package collection;

public class CollectionMain {
	
	public static void main(String[] args){
		
		// ArrayIntList 
		ArrayIntList list = new ArrayIntList();
		
		list.add(6);
		list.add(6);
		list.add(6);
		list.addAt(7,1);
		list.add(8);
		list.remove(3);
		
		System.out.println(list.indexOf(8));
		System.out.println(list.toString());
		System.out.println(list.get(3));
		
		System.out.println("------------------");
		//ArrayIntStack 
		ArrayIntStack stack = new ArrayIntStack();
		stack.push(6);
		stack.push(7);
		stack.push(8);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.toString());
		
	}

}
