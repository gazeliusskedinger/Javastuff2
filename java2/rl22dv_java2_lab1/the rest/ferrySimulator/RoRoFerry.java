package ferrySimulator;

import java.util.Iterator;

public class RoRoFerry implements Ferry{
	
	private final int MAXPASS = 200;
	private final int MAXSPACE = 200;
	
	Vehicle[] Line1 = new Vehicle[MAXSPACE/2];
	private int sizeLine1 = 0;
	private int spaceLine1 = 0;
	
	Vehicle[] Line2 = new Vehicle[MAXSPACE/2];
	private int sizeLine2 = 0;
	private int spaceLine2 = 0;
	
	Passenger[] pass = new Passenger[MAXPASS];
	
	private int sizePass = 0;
	
	private int money;
	
	public int getLine1Space(){
		return spaceLine1;
	}
	public int getLine2Space(){
		return spaceLine2;
	}
	
	@Override
	public int countPassengers() {
		return sizePass;
	}

	@Override
	public int countVehicleSpace() {
		int lineSpace = spaceLine1 + spaceLine2;
		return (lineSpace/5);
	}

	@Override
	public int countMoney() {
		
		for(int i = 0; i < sizeLine1; i++){
			money = money + Line1[i].getTotPrice();  
		}
		for(int i = 0; i < sizeLine2; i++){
			money = money + Line2[i].getTotPrice();
		}
		
		// TODO Auto-generated method stub
		return money;
	}

	@Override
	public Iterator<Vehicle> iterator() {
		// TODO Auto-generated method stub
		Vehicle[] iterationsArray = new Vehicle[MAXSPACE];
		int vehicles = 0;
		for(int i = 0; i < sizeLine1;i++){
			iterationsArray[vehicles] = Line1[i];
			vehicles++;
		}
		for(int i = 0; i < sizeLine2;i++){
			iterationsArray[vehicles] = Line2[i];
			vehicles++;
		}
		return new VehicleIterator(iterationsArray, vehicles);
	}

	@Override
	public void embark(Passenger p) {
		// TODO Auto-generated method stub
		if(!hasRoomFor(p)){
			System.out.println("There is no more room for passengers!!!");
		}
		else{
		pass[sizePass] = p;
		sizePass++;
		money = money + 20;
		}
	}

	@Override
	public void disembark() {
		// TODO Auto-generated method stu
		sizeLine1=0;
		spaceLine1=0;
		sizeLine2=0;
		spaceLine2=0;
		sizePass=0;
		
	}

	@Override
	public boolean hasRoomFor(Passenger p) {
		// TODO Auto-generated method stub
		
		if((sizePass + 1)> MAXPASS){
			return false;
		}
		else{
			return true;
		}
		
	}

	@Override
	public boolean hasSpaceFor(Vehicle v, int lineSpaceVariable) {
		// TODO Auto-generated method stub
		if((lineSpaceVariable + v.getSpace()) > MAXSPACE/2){
			return false;
		}
		else{
			return true;
		}
	}

	@Override
	public void embark(Vehicle v) {
		// TODO Auto-generated method stub
		
		
			if((spaceLine1 == 0 && spaceLine2 == 0) || (spaceLine1 < spaceLine2) || (spaceLine1 == spaceLine2)){
				if(!hasSpaceFor(v,spaceLine1)){
					System.out.println("There is no more room for vehicle: "+ v.getType());
				}
				else if((sizePass+v.getPass()) > MAXPASS ){
					System.out.println("There is no room for passengers in vehicle: "+ v.getType());
				}
				else{
					Line1[sizeLine1] = v;
					sizeLine1++;
					spaceLine1 = spaceLine1 + v.getSpace();
				}
			}
			else if(spaceLine1 > spaceLine2){
				if(!hasSpaceFor(v,spaceLine2)){
					System.out.println("There is no more room for vehicle: "+ v.getType());	
				}
				else if((sizePass+v.getPass()) > MAXPASS ){
					System.out.println("There is no room for passengers in vehicle: "+ v.getType());
				}
				else{
					Line2[sizeLine2] = v;
					sizeLine2++;
					spaceLine2 = spaceLine2 + v.getSpace();
				}
			}
			
			for(int i = 0; i < v.getPass(); i++){
				pass[sizePass] = new Passenger();
				sizePass++;
			}
			
		}
	
	public String toString(){
		
		int moneyEarned = countMoney();
		String statusLine1 = "******************************************************************\nFerry Status\n******************************************************************\nLine1\n";
		
		for(int i = 0; i < sizeLine1; i++) {
			statusLine1 = statusLine1 + "Place: "+(i+1)+", Vehicle: "+Line1[i].getType()+", Passengers(Vehicle): "+Line1[i].getPass()+", Money Earned: "+Line1[i].getTotPrice()+"\n";
		}
		
		statusLine1 = statusLine1+"\n";
		String statusLine2 = "Line2\n";
		
		for(int i = 0; i < sizeLine2; i++) {
			statusLine2 = statusLine2+"Place: "+(i+1)+", Vehicle: "+Line2[i].getType()+", Passengers(Vehicle): "+Line2[i].getPass()+", Money Earned: "+Line2[i].getTotPrice()+"\n";
		}
		
		statusLine2 = statusLine2+"\n";
		String statusPass = "Passenger List\n";
		
		for(int i = 0; i < sizePass; i++ ){
			statusPass = statusPass+"Nr: "+(i+1)+" PassId: "+pass[i].getPid()+"\n";
		}
		
		return statusLine1+statusLine2+statusPass+"\nMoney earned so far: "+  moneyEarned+"\n******************************************************************\n";
	}
}
