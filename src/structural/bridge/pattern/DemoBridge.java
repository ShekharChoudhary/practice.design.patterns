package structural.bridge.pattern;
/**
 * Bridge design pattern separates abstraction from implementation.
 * The Bridge pattern is an application of the old advice, “prefer composition over 
 * inheritance”. It becomes handy when you must subclass different times in ways that 
 * are independent with one another.
 * @author choudshe
 *
 */
public class DemoBridge {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Car(new Produce(), new Assemble());
		vehicle1.manufacture();
		System.out.println("**********");
		Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
		vehicle2.manufacture();
	}
}
