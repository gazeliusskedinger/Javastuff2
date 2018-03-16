package ferrySimulator;

public class Passenger {
	
	static int UNIQUE_ID= 0;
	private final int pid = ++UNIQUE_ID;
	private final int passSpace = 1;
	
	public int getPid(){
		return pid;
	}
	
	public int getPass(){
		return passSpace;
	}

}
