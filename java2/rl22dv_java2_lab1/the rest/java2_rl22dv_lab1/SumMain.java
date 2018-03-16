package java2_rl22dv_lab1;

import java.util.Scanner;

public class SumMain {

	public static void main(String[] args) {
		System.out.print("enter a number: ");
		Scanner in = new Scanner(System.in);
		int input2 = in.nextInt();
		long kul = sum(input2);
		System.out.println(kul);
		in.close();
	}
	
	private static long sum(int first){
		
		if(first >= 0){
			System.out.println(first);
			return  first + sum(--first);
		}
		else{
			return 0;
		}
	}
}
