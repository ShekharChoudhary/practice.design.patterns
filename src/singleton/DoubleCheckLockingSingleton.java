package singleton;
/**
 * The double check locking is done in a multithreaded environment.
 * double check is applied because at one point of time if a thread has entered the synchronized block 
 * but yet not initialized the singleton and at the same point if other thread crosses the first check 
 * so in this case if double check was not there then other thread would also have initialized the 
 * singleton instance.
 * @author choudshe
 *
 */
public class DoubleCheckLockingSingleton {

	public static void main(String[] args) {
		SingletonDoubleCheck doubleCheck = SingletonDoubleCheck.getInstance();
		doubleCheck.testMethod();
	}
}

class SingletonDoubleCheck{
	
	private static SingletonDoubleCheck singletonDoubleCheck;
	
	private SingletonDoubleCheck() {}
	
	public static SingletonDoubleCheck getInstance() {
		
		if(singletonDoubleCheck ==null) {
			synchronized (SingletonDoubleCheck.class) {
				if(singletonDoubleCheck == null) {
					singletonDoubleCheck = new SingletonDoubleCheck();
				}
			}
		}
		return singletonDoubleCheck;
	}
	
	public void testMethod() {
		System.out.println("This is double check locking singleton");
	}
	
}
