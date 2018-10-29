package behavioral.observer.pattern;

public class OctalObserver extends Observer{
	
	public OctalObserver(Subject sub) {
		this.subject = sub;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Octal value is : "+Integer.toOctalString(this.subject.getState()));
	}

}
