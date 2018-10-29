package creational.singleton.pattern;

/**
 * Only one instance of enum is created. 
 * @author choudshe
 *
 */
public class EnumSingleton {

	public static void main(String[] args) {
		
		Singleton.INSTANCE.testMethod();
		
	}
}


enum Singleton{
	INSTANCE;
	
	public void testMethod() {
		System.out.println("This is enum singleton");
	}
}