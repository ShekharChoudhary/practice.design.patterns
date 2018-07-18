package singleton;
/**
 * 
 * To implement Singleton pattern, we have different approaches but all of them have following common concepts:-
 *  1. Private constructor to restrict instantiation of the class from other classes.
 *  2. Private static variable of the same class that is the only instance of the class.
 *  3. Public static method that returns the instance of the class, this is the global access 
 *     point for outer world to get the instance of the singleton class.
 * 
 *  The first and the simplest approach is Eager Initialization Singleton.
 *  In eager initialization, the instance of Singleton Class is created at the time of class loading, 
 *  this is the easiest method to create a singleton class but it has a drawback that instance is created even 
 *  though client application might not be using it.
 *  
 *  If our singleton class is not using a lot of resources, this is the approach to use. 
 *  But in most of the scenarios, Singleton classes are created for resources such as File System, Database connections etc 
 *  and we should avoid the instantiation until unless client calls the getInstance method. 
 *  Also this method doesn’t provide any options for exception handling.
 *  
 * @author choudshe
 *
 */
public class EagerInitializationSingleton {

	public static void main(String[] args) {
		EagerSingleton eagerSingleton = EagerSingleton.getInstance();
		eagerSingleton.testMethod();
	}
}

class EagerSingleton{
	
	private static final EagerSingleton singleton = new EagerSingleton();
	
	private EagerSingleton(){}
	
	public static EagerSingleton getInstance() {
		return singleton;
	}
	
	/*
	 * This test method is created so that we can use singleton class above.
	 */
	public void testMethod() {
		System.out.println("This is Eager Singleton");
	}
}
