package decorator;
/**
 * This pattern is used to extend the feature of an existing setup without modifying it. 
 * Here we have Shape classes and then we provided colour to shape without modifying the 
 * actual implementation of shape class (which is Circle in this case)
 * This pattern is widely used in file IO in java
 * please refer this link for more details:-
 * https://stackoverflow.com/questions/6366385/use-cases-and-examples-of-gof-decorator-pattern-for-io
 * @author choudshe
 *
 */
public class DemoDecorator {
	
	public static void main(String[] args) {
		//This will draw a plain circle with no colour
		Shape circle = new Circle();
		circle.draw();
		System.out.println();
		System.out.println("**********************");
		//This will draw a plain circle and colour it with red colour
		Shape redCircle = new Red(new Circle());
		redCircle.draw();
		System.out.println();
		System.out.println("**********************");
		//This will draw a plain circle and colour it with red colour and then with blue colour
		Shape blueRedCircle = new Blue(new Red(new Circle()));
		blueRedCircle.draw();
		System.out.println("***************");
		Shape blueRedBlueCircle = new Blue(new Red(new Blue(new Circle())));
		blueRedBlueCircle.draw();
	}
}
