package number6;

public class HeapMain {

	public static void main(String[] args) {
		int[] ranTestArray = new int[16];
		// TODO Auto-generated method stub
		BinaryIntHeap bh = new BinaryIntHeap();
		
		for(int i = 0; i < ranTestArray.length; i++){
			ranTestArray[i] = randomNum();
			bh.insert(ranTestArray[i]);
		}
		for(int i = 0; i < ranTestArray.length; i++){
			System.out.println(ranTestArray[i]);
		}
		
		System.out.println("Heap output");
		System.out.println("outpull");
		for(int i = 0; i < bh.size(); i++){
			System.out.println("pulled : "+bh.pullHighest());
			System.out.print(bh.toString());
		}
		
	}
	
	private static int randomNum(){
		return (int)(Math.random()*100); 
	}

}
