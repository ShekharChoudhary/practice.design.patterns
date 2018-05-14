package template;

public class Football extends Game{

	@Override
	public void end() {
		System.out.println("Football game ended.");
		
	}
	
	@Override
	public void start() {
		System.out.println("Football game started.");
		
	}
	
	@Override
	public void initialize() {
		System.out.println("Football game initialized.");
	}

	

	

}
