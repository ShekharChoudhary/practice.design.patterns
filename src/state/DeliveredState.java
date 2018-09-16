package state;

public class DeliveredState implements PackageState{

	@Override
	public void next(Packages pkg) {
		System.out.println("The package has already been delivered.");
	}

	@Override
	public void previous(Packages pkg) {
		pkg.setState(new ReceivedState());
	}

	@Override
	public void printStatus() {
		System.out.println("The package has been delivered.");
		
	}

}
