package number6;

public interface IBinaryHeap {
	
	public void insert(int n); // Add n to heap
	public int pullHighest();    // Return and remove element with highest priority
	public int size();         // Current heap size
	public boolean isEmpty(); // True if heap is empty
	public String toString(); // skapade en egen toString method för junit test;

}
