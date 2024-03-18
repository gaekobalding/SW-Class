package static_;

public class Singleton {

	private static Singleton instance = new Singleton(); 
		
	
	private Singleton() {
		System.out.println("만듦");
}
	public static Singleton getInstance() {
		return instance;
		
	}
}
