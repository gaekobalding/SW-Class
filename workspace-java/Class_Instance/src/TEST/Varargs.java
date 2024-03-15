package TEST;

public class Varargs {

	public static int calculateSum(int...values) {
		int calculateSum = 0;
		
	//	for (int i=0; i<values.length; i++) {
	//		calculateSum += values[i];
	//	}  => 이것도 아래와 같은 것이다.
		
		for (int value: values) {
			calculateSum += value;
		}
		return calculateSum;
	}
	
	public static void main(String[] args) {

	int sum1 = calculateSum(1, 2, 3, 4, 5);
	int sum2 = calculateSum(10, 20, 30);
	int sum3 = calculateSum(8, 2, 5, 7);
	
	System.out.println("A1 : " + sum1);
	System.out.println("A2 : " + sum2);
	System.out.println("A3 : " + sum3);
	}

}
