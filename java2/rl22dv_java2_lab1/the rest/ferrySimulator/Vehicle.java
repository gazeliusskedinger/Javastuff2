package ferrySimulator;

public abstract class Vehicle implements VehicleInterface{
	
	private String type ="";
	
	private int space = 0;
	private int passengers = 0;
	private int price = 0;
	private int pricePass = 0;
	private int maxPass = 0;
	
	
	public String getType(){
		return type;
	}
	
	public int getPass(){
		return passengers;
	}
	
	public int getSpace(){
		return space;
	}
	
	public int getPrice(){
		return price;
	}
	
	public int getPassPrice(){
		return pricePass;
	}
	
	public int getMaxPass(){
		return maxPass;
	}
	
	public int getTotPrice(){
		
		int totPrice = price;
		int pass = passengers;
		
		for(int i = 0; i < pass; i++){
			totPrice = totPrice + pricePass;
		}
		
		return totPrice;
		
	} 
	
	public void setType(String vehicleType){
		type = vehicleType;
	}
	
	public void setPass(int pass){
		passengers = pass;
	}
	
	
	public void setSpace(int inSpace){
		space = inSpace;
	}
	
	public void setPrice(int inPrice){
		price = inPrice;
	}
	
	public void setPassPrice(int inPrice){
		pricePass = inPrice;
	}
	
	public void setMaxPass(int max){
		maxPass = max;
	}
	
	
}