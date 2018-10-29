package creational.prototype.pattern;

public class Rectangle extends Shape{

	public Rectangle(){
		type = "Rectangle";
	}
	
	@Override
	void draw() {
		System.out.println("This is Rectangle");
	}

}
