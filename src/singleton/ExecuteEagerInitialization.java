package singleton;

public class ExecuteEagerInitialization {

	public static void main(String[] args) {
	EagerInitialization.getInstance().test();	
	}
}

class EagerInitialization {
	
	private static final EagerInitialization instance = new EagerInitialization();
	private EagerInitialization(){}
	
	public static EagerInitialization getInstance(){
		return instance;
	}
	
	public void test(){
		System.out.println("This is Eager Initialization.");
	}
}


