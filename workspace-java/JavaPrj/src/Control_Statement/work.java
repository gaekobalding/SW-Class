package Control_Statement;
import java.util.Scanner;

public class work {

	public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < test; i++) {
            int count = sc.nextInt();
            int sum = 0;
            for (int i1 = 0; i1 < count; i1++) {
                sum += sc.nextInt();
            }
            sc.nextLine();
            System.out.printf("#%d %d\n", i+1, sum);
        }
	}

}
