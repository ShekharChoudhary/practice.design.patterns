package a.practice;

public class DemoPattern {

	public static void main(String[] args) {
		TestSingleton s = TestSingleton.getInstance();
		s.printValue();
		
	}
}

class TestSingleton {

	private static TestSingleton singleton;

	private TestSingleton() {
	}

	public static TestSingleton getInstance() {

		if (singleton == null) {

			synchronized (TestSingleton.class) {
				if (singleton == null) {
					singleton = new TestSingleton();
				}
			}
		}
		return singleton;
	}
	
	public void printValue() {
		System.out.println("This is double check singleton");
	}
}
