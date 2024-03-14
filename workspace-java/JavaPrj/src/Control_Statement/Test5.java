package Control_Statement;

public class Test5 {

	public static void main(String[] args) {
		int featureStatus = 12;
		int funtion3 = (featureStatus >> 2) & 1;
		
		if (funtion3 == 1) {
		 	System.out.println("활성화");
		} else {
		 	System.out.println("비활성화");

		}
	}

}
