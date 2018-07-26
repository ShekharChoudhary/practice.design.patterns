package chain.of.responsibility;

public interface DispenseCash {

	public void setNextChain(DispenseCash dispenseCash);
	
	public void dispense(Currency cur);
}
