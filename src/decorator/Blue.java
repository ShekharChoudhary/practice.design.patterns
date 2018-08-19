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
		System.out.print(" with Blue colour drawn");
	}

}
