package abstractFactory;

public class AColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String color) {
		if(color.equalsIgnoreCase("red")) {
			return new ColorRed();
		}else if(color.equalsIgnoreCase("blue")) {
			return new ColorBlue();
		}else if (color.equalsIgnoreCase("green")) {
			return new ColorGreen();
		}else {
		return null;
		}
	}

}
