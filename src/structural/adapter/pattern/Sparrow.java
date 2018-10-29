package structural.adapter.pattern;

public class Sparrow implements Bird{

	@Override
	public void fly() {

		System.out.println("Flying Sparrow");
	}

	@Override
	public void makeSound() {
		System.out.println("Sound of Sparrow");
	}

}
