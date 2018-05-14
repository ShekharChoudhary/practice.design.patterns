package template;

public class Cricket extends Game{

	@Override
	public void end() {
		System.out.println("Cricket game ended.");
		
	}
	
	@Override
	public void initialize() {
		System.out.println("Cricket game initialized.");
	}

	@Override
	public void start() {
		System.out.println("Cricket game started.");
	}

	

}
