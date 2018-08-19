package decorator;

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
	}
}
