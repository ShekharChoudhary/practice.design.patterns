package behavioral.observer.pattern;

public class ObserverPatternDemo {

	public static void main(String[] args) {
	Subject subject = new Subject();
	
	new HexadecimalObserver(subject);
	new OctalObserver(subject);
	new BinaryObserver(subject);
	
	System.out.println("First state change is 15 ");
	subject.setState(15);
	System.out.println("Second state change is 10");
	subject.setState(10);
	}
}
