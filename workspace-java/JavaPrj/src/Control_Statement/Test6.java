package Control_Statement;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수 : "); 
		int score = scanner.nextInt();

		if (score >100) {
			System.out.println("ERR"); 

		}else {
		switch(score/10) {
		
		case 9 :
		System.out.println("A"); 
		System.out.println("합격"); 
		break;

		case 8 :
		System.out.println("B"); 
		System.out.println("합격"); 
		break;
		
		case 7 :
		System.out.println("C"); 
		System.out.println("합격"); 
		break;
		
		case 6 :
		System.out.println("D");
		System.out.println("합격"); 
		break;
		
		default :
			System.out.println("F"); 
			System.out.println("불합"); 

		}
		}
		
	}

}
