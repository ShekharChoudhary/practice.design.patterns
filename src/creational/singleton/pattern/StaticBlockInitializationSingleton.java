package creational.singleton.pattern;

/**
 * Static block initialization implementation is similar to eager initialization, 
 * except that instance of class is created in the static block that provides option for exception handling.
 * However like Eager Initialization, Static block initialization also creates instance even before it is used.
 * 
 * @author choudshe
 *
 */
public class StaticBlockInitializationSingleton {

	public static void main(String[] args) {
		StaticBlockSingleton singleton = StaticBlockSingleton.getInstance();
		singleton.testMethod();
	}
	
	
}

class StaticBlockSingleton {
	
	private static StaticBlockSingleton singleton ;
	
	private StaticBlockSingleton () {}
	
	static {
		try {
			singleton = new StaticBlockSingleton();
		}catch(Exception e){
			throw new RuntimeException("Exception occured in creating singleton instance.");
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return singleton;
	}
	
	public void testMethod() {
		System.out.println("This is static block singleton");
	}
	
}
