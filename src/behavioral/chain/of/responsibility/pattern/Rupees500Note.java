package behavioral.chain.of.responsibility.pattern;

public class Rupees500Note implements DispenseCash{
	
	private DispenseCash dispenseCash;

	@Override
	public void setNextChain(DispenseCash dispenseCash) {

		this.dispenseCash = dispenseCash;
	}

	@Override
	public void dispense(Currency cur) {

		if(cur.getAmount()>=500) {
			int num = cur.getAmount()/500;
			int remainder = cur.getAmount()%500;
			System.out.println("Number of 500 notes :"+num);
			if(remainder !=0) {
				this.dispenseCash.dispense(new Currency(remainder));
			}
		}else {
			this.dispenseCash.dispense(cur);
		}
		
	}

}
