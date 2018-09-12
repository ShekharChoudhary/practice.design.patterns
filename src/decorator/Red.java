package decorator;

public class Red extends Colour{

	public Red(Shape innerShape) {
		super(innerShape);
	}

	public void draw() {
		super.draw();
		setColour();
	}
	@Override
	public void setColour() {
		if(! (shape instanceof Colour)) {
		System.out.println("The colour of the "+shape.getClass().getSimpleName()+" is Red.");
		}else {
			System.out.println("It is also colours as Red ");
		}
	}

}
