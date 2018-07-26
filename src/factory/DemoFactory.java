package factory;

public class DemoFactory {

	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		
		Shape circle = factory.getShape("circle");
		circle.draw();
		
		Shape square = factory.getShape("square");
		square.draw();
		
		Shape rectangle = factory.getShape("rectangle");
		rectangle.draw();
	}
}
