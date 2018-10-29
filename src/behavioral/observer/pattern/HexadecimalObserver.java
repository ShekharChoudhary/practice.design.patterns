package behavioral.observer.pattern;

public class HexadecimalObserver extends Observer {

	public HexadecimalObserver(Subject sub) {
		this.subject = sub;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {

		System.out.println("HexaDecimal value is : "+Integer.toHexString(this.subject.getState()) );
	}

}
