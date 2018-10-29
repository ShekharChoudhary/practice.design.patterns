package creational.prototype.pattern;

public class PrototypeDemo {

	public static void main(String[] args) {
		ShapeCache.loadShape();
		
		Shape clonedCircle = ShapeCache.getShape("1");
		System.out.print("Shape : "+clonedCircle.getType()+" : ");
		clonedCircle.draw();
		
		Shape clonedSquare = ShapeCache.getShape("2");
		System.out.print("Shape : "+clonedSquare.getType()+" : ");
		clonedSquare.draw();
		
		Shape clonedRectangle = ShapeCache.getShape("3");
		System.out.print("Shape : "+clonedRectangle.getType()+" : ");
		clonedRectangle.draw();
	}
}
