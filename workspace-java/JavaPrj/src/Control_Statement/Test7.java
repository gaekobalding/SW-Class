package Control_Statement;

public class Test7 {

	public static void main(String[] args) {

		int i = 2;
		int sum = 0;
		int a = 1000;
		
		while(sum < a) {
			sum += i;
			i += 2;
		}
		System.out.println(i);
	}

}
