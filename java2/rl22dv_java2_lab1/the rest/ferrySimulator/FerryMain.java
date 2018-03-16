package ferrySimulator;

import java.util.Iterator;
public class FerryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int trip = 0;
		Ferry ferry1 = new RoRoFerry();
		for(int j = 0; j < 10; j++){
			System.out.print("Trip: "+trip+"/n");
		for(int i = 0; i < 20; i++){
			
			ferry1.embark(setVehicle());
			
		}
		for(int i = 0; i < setPassWhitoutVehicle(); i++ ){
			
			ferry1.embark(new Passenger());
			
		}
		
		Vehicle testVehicle = setVehicle();
		System.out.println("hasSpaceFor: "+testVehicle.getType()+" = "+ferry1.hasSpaceFor(testVehicle,45) );
		System.out.println("hasRoomFor: "+ferry1.hasRoomFor(new Passenger()));
		
		System.out.println(ferry1.toString());
	
		Iterator<Vehicle> lista = ferry1.iterator();
		while(lista.hasNext()){
			Vehicle v = lista.next();
			System.out.println(v.getType());
		}
		System.out.println(ferry1.countPassengers());
		System.out.println(ferry1.countVehicleSpace());
		ferry1.disembark();
		System.out.println(ferry1.toString());
		}
		trip++;
	}
	
	private static Vehicle setVehicle(){
		
		int num = randomNum(4);
		Vehicle vehicle = (Vehicle)null;
		if(num == 1){
			
			vehicle = new Bicycle();
			
		}
		
		else if(num == 2){
			
			vehicle = new Car();
			
		}
		
		else if(num == 3){
			
			vehicle = new Bus();
			
		}
		
		else if(num == 4){
			
			vehicle = new Lorry();
			
		}
		
		vehicle.setPass(randomNum(vehicle.getMaxPass()));
		
		return vehicle;
	}
	
	private static int setPassWhitoutVehicle(){
		
		int num = randomNum(200);
		
		return num;
		
	}
	
	private static int randomNum(int max){
		
		return (int)(Math.random()*(max))+1;
		
	}

}
