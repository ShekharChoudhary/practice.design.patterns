package structural.adapter.pattern;

public class ToyBirdAdapter implements ToyBird{

	private Bird bird;
	
	public ToyBirdAdapter(Bird bird) {
		this.bird = bird;
	}
	
	@Override
	public void makeSound() {
		bird.makeSound();
		
	}

}
