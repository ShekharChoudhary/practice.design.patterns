package structural.flyweight.pattern;

/**
 * Flyweight pattern is one of the structural design patterns as this pattern 
 * provides ways to decrease object count thus improving application required 
 * objects structure. Flyweight pattern is used when we need to create a large number 
 * of similar objects. 
 * 
 * Why do we care for number of objects in our program?
 * 
 * Less number of objects reduces the memory usage, and it manages to keep us away from 
 * errors related to memory like java.lang.OutOfMemoryError.
 * 
 * Although creating an object in Java is really fast, we can still reduce the execution 
 * time of our program by sharing objects.
 * 
 * Note :- The below lines has been taken from the website (Please verify it again if required) :- 
 * https://www.baeldung.com/java-flyweight
 * 
 * It’s very important that the flyweight objects are immutable: any operation on the state must be 
 * performed by the factory.
 * 
 * Implementation:-
 * The main elements of the pattern are:
 * 
 * An interface which defines the operations that the client code can perform on the flyweight object.
 * 
 * One or more concrete implementations of our interface a factory to handle objects instantiation 
 * and caching.
 * 
 * @author choudshe
 *
 */
public class CircleFlyWeightDemo {

	private static final String [] colourSet = {"red","blue","green","orange","yellow"};
	
	public static void main(String[] args) {
		
		for(int i =0;i<10;i++) {
		Circle circle = (Circle) CircleFactory.getCircle(getRandomColour());	
		circle.setX(getRandomX());
		circle.setY(getRandomY());
		circle.setRadius(getRandomRadius());
		circle.draw();
		}
	}

	private static int getRandomRadius() {
		return (int)(Math.random()*100);
	}

	private static int getRandomY() {
		return (int)(Math.random()*100);
	}

	private static int getRandomX() {
		return (int)(Math.random()*100);
	}

	private static String getRandomColour() {
		int randomColour = (int) (Math.random() *colourSet.length);
		return colourSet[randomColour];
	}
}
