package decorator;

public class Blue extends Colour{

	public Blue(Shape innerShape) {
		super(innerShape);
	}

	public void draw() {
		super.draw();
		setColour();
	}
	@Override
	public void setColour() {
		if(! (shape instanceof Colour)) {
		System.out.println("The colour of the "+shape.getClass().getSimpleName()+" is Blue.");
		}else {
			System.out.println("It is also colours as Blue ");
		}
	}

}
