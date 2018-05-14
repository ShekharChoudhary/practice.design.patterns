package prototype;

import java.util.HashMap;

public class ShapeCache {

	public static HashMap<String, Shape> shapeCache = new HashMap<String,Shape>();
	
	public static Shape getShape(String shapeId){
		Shape shapeCached = shapeCache.get(shapeId);
		return (Shape) shapeCached.clone();
	}
	
	public static void loadShape(){
	Shape circleShape = new Circle();
	circleShape.setId("1");
	shapeCache.put(circleShape.getId(), circleShape);
	
	Shape squareShape = new Square();
	squareShape.setId("2");
	shapeCache.put(squareShape.getId(), squareShape);
	
	Shape rectangleShape = new Rectangle();
	rectangleShape.setId("3");
	shapeCache.put(rectangleShape.getId(), rectangleShape);
		
	}
}
