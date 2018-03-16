package ferrySimulator;

import java.util.Iterator;

public class VehicleIterator implements Iterator<Vehicle>{
	
	private int nextElement = 0;
	private final Vehicle[] elements;
	private final int max;            
	
	public VehicleIterator(Vehicle[] values, int maxIndex) {
		elements = values;
		max = maxIndex;
	}
 
	public boolean hasNext() {
		return nextElement < max;
	}

	public Vehicle next() {
		return elements[nextElement++];
	}		

}
