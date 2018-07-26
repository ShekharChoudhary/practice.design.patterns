package chain.of.responsibility;

public class Rupees100Note implements DispenseCash{

	private DispenseCash dispenseCash;

	@Override
	public void setNextChain(DispenseCash dispenseCash) {
		
		this.dispenseCash = dispenseCash;
		
	}

	@Override
	public void dispense(Currency cur) {
		if(cur.getAmount()>=100) {
			int num = cur.getAmount()/100;
			int remainder = cur.getAmount()%100;
			System.out.println("Number of 100 notes :"+num);
			if(remainder !=0) {
				this.dispenseCash.dispense(new Currency(remainder));
			}
		}else {
			this.dispenseCash.dispense(cur);
		}
		
	}
}
