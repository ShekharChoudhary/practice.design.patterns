package facade;

public class FacadeDemo {

	public static void main(String[] args) {
		ShapeFacade shape = new  ShapeFacade();
		shape.drawCircle();
		shape.drawRectangle();
		shape.drawSquare();
	}
}
