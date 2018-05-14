package singleton;

public class ExecuteStaticBlockInitialization {

	public static void main(String[] args) {
		StaticBlockInitialization.getInstance().test();
	}
}

class StaticBlockInitialization {
	
	private static StaticBlockInitialization instance;
	
	private StaticBlockInitialization(){}
	
	static {
		try{
		instance = new StaticBlockInitialization();
		}catch(Exception e ){
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	public static StaticBlockInitialization getInstance(){
		return instance;
	}
	
	public void test(){
		System.out.println("This is Static Block Initialization.");
	}
}
