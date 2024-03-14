package Control_Statement;

public class Test8 {

	public static void main(String[] args) {

		for (int i=2; i<100; i++) {
			int c=0;
			for (int i1=1; i1<=i; i1++) {
				if (i%i1 == 0) 
					c = c+1;
				
					
			}
			if (c == 2)
				System.out.println(i + "\t");
		}
	}

}
