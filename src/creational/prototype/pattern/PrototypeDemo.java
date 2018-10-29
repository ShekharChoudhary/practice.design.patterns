package creational.prototype.pattern;
/**
 * The prototype pattern is a creational design pattern. Prototype patterns is required, when object 
 * creation is time consuming, and costly operation, so we create object with existing object itself. 
 * One of the best available way to create object from existing objects are clone() method. 
 * Clone is the simplest approach to implement prototype pattern. 
 * However, it is your call to decide how to copy existing object based on your business model.
 * @author choudshe
 *
 */
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
