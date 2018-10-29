package structural.decorator.pattern;

public abstract class Colour implements Shape{

		Shape shape ;
		
		public Colour(Shape innerShape) {
			this.shape = innerShape;
		}
		
		public void draw() {
			shape.draw();
		}
		
		public abstract void setColour();
}
