package adapter;
/**
 * Also check RunnableAdapter in Executors class in java.
 * @author choudshe
 *
 */
public class ImplementToyAdapter {

	public static void main(String[] args) {
		Bird parrot = new Parrot();
		Bird sparrow = new Sparrow();
		
		ToyBird toyOwl = new ToyOwl();
		
		System.out.println("Parrot Features :- ");
		System.out.println("************************");
		parrot.fly();
		parrot.makeSound();
		System.out.println("**********************");
		System.out.println("Sparrow Features :- ");
		System.out.println("************************");
		sparrow.fly();
		sparrow.makeSound();
		System.out.println("********************");
		System.out.println("Toy Owl Features :- ");
		System.out.println("************************");
		toyOwl.makeSound();
		System.out.println("*********************");
		System.out.println("Features of toy parrot made using adapter :- ");
		System.out.println("************************");
		ToyBirdAdapter toyParrot = new ToyBirdAdapter(parrot);
		toyParrot.makeSound();
		System.out.println("**********************");
		System.out.println("Features of toy sparrow made using adapter :- ");
		System.out.println("************************");
		ToyBirdAdapter toySparrow = new ToyBirdAdapter(sparrow);
		toySparrow.makeSound();
	}
}
