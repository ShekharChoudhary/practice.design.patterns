package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CircleFactory {

	private static Map<String,Circle> circleFactory = new HashMap<>();
	
	public static Shape getCircle(String colour) {
		
		Circle circle = (Circle) circleFactory.get(colour);
		
		if(circle == null) {
		circle = new Circle(colour);
		circleFactory.put(colour, circle);
		System.out.println("A new circle with colour :"+colour+" created.");	
		}
		return circle;
	}

}
