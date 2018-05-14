package chain.of.responsibility;

public interface ATMVendingMachine {

	public void getNextCurrency();
	public void withDrawAmount(Amount amount);
}
