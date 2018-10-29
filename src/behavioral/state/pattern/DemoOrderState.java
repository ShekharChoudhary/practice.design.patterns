package behavioral.state.pattern;

public class DemoOrderState {

	public static void main(String[] args) {
		Packages pack = new Packages();
		pack.printState();
		
		pack.nextState();
		pack.printState();
		
		pack.nextState();
		pack.printState();
	}
}
