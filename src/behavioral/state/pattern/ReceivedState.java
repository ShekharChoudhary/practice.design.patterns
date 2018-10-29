package behavioral.state.pattern;

public class ReceivedState implements PackageState{

	@Override
	public void next(Packages pkg) {
		pkg.setState(new DeliveredState());
		
	}

	@Override
	public void previous(Packages pkg) {
		pkg.setState(new OrderedState());
	}

	@Override
	public void printStatus() {
		System.out.println("The order has been received and will be delivered in sometime.");
		
	}

}
