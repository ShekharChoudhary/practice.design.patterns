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
		System.out.print(" with Red colour drawn");
	}

}
