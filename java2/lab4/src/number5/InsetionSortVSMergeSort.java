package number5;


public class InsetionSortVSMergeSort {
	
	final static int ARR_SIZE = 10000;
	
	public static void main(String[] args){
		
		SortingAlgorithms sa = new SortAlgos();
		int arr[] = new int[ARR_SIZE];
		int arrSorted[] = new int[ARR_SIZE];
		long before;
		long after;
		long totTime = 0;
		arr = ranArrGen();
		
		for(int i = 0; i<10; i++){
			before = System.nanoTime();
			sa.insertionSort(arr); 
			after = System.nanoTime() - before;
			totTime = totTime + after;
		}
		
		System.out.println("Time 10000 intArrInsertionSort : " + totTime/10);
		arr = ranArrGen();
		totTime = 0;
		
		for(int i = 0; i<10; i++){
			before = System.nanoTime();
			sa.mergeSort(arr); 
			after = System.nanoTime() - before;
			totTime = totTime + after;
		}
		
		System.out.println("Time 10000 intArrMergeSort : " + totTime/10);
		arrSorted = arr;
		
		String[] sArr = new String[ARR_SIZE];
		String[] sortedArr = new String[ARR_SIZE];
		sArr = ranArrGenS();
		totTime = 0;
		
		for(int i = 0; i<10; i++){
			before = System.nanoTime();
			sa.insertionSort(sArr); 
			after = System.nanoTime() - before;
			totTime = totTime + after;
		}
		
		System.out.println("Time 10000 StringArrInsertionSort : " + totTime/10);
		totTime = 0;
		
		for(int i = 0; i<10; i++){
			before = System.nanoTime();
			sa.mergeSort(sArr); 
			after = System.nanoTime() - before;
			totTime = totTime + after;
		}
		
		System.out.println("Time 10000 StringArrMergeSort : " + totTime/10);
	}
	
	public static int[] ranArrGen(){
		int[] arr = new int[ARR_SIZE];
		for(int i = 0; i < ARR_SIZE;i++){
			arr[i] = (int)(Math.random()*100000); 
		}
		
		return arr;
		
	} 
	
	public static String[] ranArrGenS(){
		String[] arr = new String[ARR_SIZE];
		char l;
		
		for(int i = 0; i < ARR_SIZE; i++){
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j < 10; j++){
				l = ((char)((int)((Math.random()*26)+65)));
				sb.append(l);
			}
			arr[i]=sb.toString();
		}
		return arr;
	}
	// for testing sorting algorithms
	private static void printArr(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	private static void printArrS(String[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
