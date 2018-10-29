package behavioral.chain.of.responsibility.pattern;

public interface DispenseCash {

	public void setNextChain(DispenseCash dispenseCash);
	
	public void dispense(Currency cur);
}
