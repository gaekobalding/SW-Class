package Control_Statement;
import java.util.Scanner;

public class Test4 {
	/*
	 * */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("diceNumber : ");
		int diceNumber =scanner.nextInt();
		
		if(diceNumber%2 == 0) {
		 	System.out.println("짝수");
		}else{
			System.out.println("홀수");
		}
		scanner.close();
	}

		
}

