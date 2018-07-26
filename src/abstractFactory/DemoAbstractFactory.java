package abstractFactory;

public class DemoAbstractFactory {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactoryType("shape");
		
		System.out.println("*****shape drawing************");
		System.out.println();
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		
		Shape rectangle = shapeFactory.getShape("rectangle");
		rectangle.draw();
		
		Shape square = shapeFactory.getShape("square");
		square.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactoryType("color");
		System.out.println();
		System.out.println("*****filling color************");
		System.out.println();		
		Color red = colorFactory.getColor("red");
		red.fill();
		
		Color blue = colorFactory.getColor("blue");
		blue.fill();
		
		Color green = colorFactory.getColor("green");
		green.fill();
	}
}
