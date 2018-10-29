package structural.facade.pattern;

public class FacadeDemo {

	public static void main(String[] args) {
		ShapeFacade shape = new  ShapeFacade();
		shape.drawCircle();
		shape.drawRectangle();
		shape.drawSquare();
	}
}
