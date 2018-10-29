package creational.abstractFactory.pattern;

public class FactoryProducer {

	public static AbstractFactory getFactoryType(String factoryType) {
		
		if(factoryType.equalsIgnoreCase("color")) {
			return new AColorFactory();
		}else if(factoryType.equalsIgnoreCase("shape")) {
			return new AShapeFactory();
		}else {
			return null;
		}
	}
}
