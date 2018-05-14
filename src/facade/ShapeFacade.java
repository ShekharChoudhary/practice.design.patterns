package facade;

public class ShapeFacade {

	private Shape rectangle ;
	private Shape square ;
	private Shape circle ;
	
	public ShapeFacade (){
		 rectangle = new Rectangle();
		 square = new Square();
		 circle = new Circle();
	}
	
	public void drawRectangle(){
		rectangle.draw();
	}
	
	public void drawCircle(){
		circle.draw();
	}
	
	public void drawSquare(){
		square.draw();
	}
}
