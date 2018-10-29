package creational.abstractFactory.pattern;

public class AShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {

		if(shape.equalsIgnoreCase("square")) {
			return new ShapeSquare();
		}else if (shape.equalsIgnoreCase("circle")) {
			return new ShapeCircle();
		}else if (shape.contentEquals("rectangle")) {
			return new ShapeRectangle();
		}else {
		return null;
		}
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
