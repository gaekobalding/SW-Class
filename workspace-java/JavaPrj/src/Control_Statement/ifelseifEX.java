package Control_Statement;
import java.util.Scanner;
public class ifelseifEX {

	public static <scanner> void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수 : "); 
		int score = scanner.nextInt();
		
		if(score >= 90) {
			if (score > 100) {
				System.out.println("다시입력");
			}else {
				System.out.println("A");
			}
		}else if(score >= 80){
			System.out.println("B");
		} else {
			System.out.println("F");
		}
		scanner close;
		
	}

}
