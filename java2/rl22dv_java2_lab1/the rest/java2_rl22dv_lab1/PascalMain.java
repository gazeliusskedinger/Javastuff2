package java2_rl22dv_lab1;

public class PascalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] row = Pascal(30);
		
		for(int i = 0; i< row.length;i++){// skriver ut triangeln s alla 
			System.out.print(row[i] + " ");	
		}
		
		System.out.println();

	}
	
	private static int[] Pascal(int row){
		int line[] = new int[row+1];
		if(row == 0){ // om raden är lika med 0 så skall bara 1 skrivas ut
			line[0] = 1; 
			return line;
		}
		else{
			// om saker skall skrivas ut mer än rad ett så blir saker lite mer kompliserat
			int[] rowen = Pascal(row-1); // skapar raden inna den sökta raden hela vägen upp i triangeln
			
			line[0] = 1; //sätter ändpunkterna till ett i arrayen.
			line[row] = 1;
			
			for(int i = 1; i < rowen.length;i++){ // skapar mitttalen genom att addera alla de två talen i mitten av triangeln
				line[i] = rowen[i-1]+rowen[i];
			}
			return line; 
		}
		
	}

}
