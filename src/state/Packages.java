package state;

public class Packages {

	private PackageState state = new OrderedState();

	public PackageState getState() {
		return state;
	}

	public void setState(PackageState state) {
		this.state = state;
	}
	
	public void previousState() {
		state.previous(this);
	}
	
	public void nextState() {
		state.next(this);
	}
	
	public void printState() {
		state.printStatus();
	}
	
}
