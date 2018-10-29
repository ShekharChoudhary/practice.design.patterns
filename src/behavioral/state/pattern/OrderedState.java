package behavioral.state.pattern;

public class OrderedState implements PackageState{

	@Override
	public void next(Packages pkg) {
		pkg.setState(new ReceivedState());
		
	}

	@Override
	public void previous(Packages pkg) {
     System.out.println("This package is in the ordered state.");
	}

	@Override
	public void printStatus() {
		System.out.println("The package has been ordered.");
		
	}

}
