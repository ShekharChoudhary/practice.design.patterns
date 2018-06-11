package chain.of.responsibility;

public class Rupees50Dispenser implements DispenseChain{
	
	private DispenseChain chain;
	
	public Rupees50Dispenser(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void setNextChain(DispenseChain nextChain) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispense(Currency cur) {
		// TODO Auto-generated method stub
		
	}

}
