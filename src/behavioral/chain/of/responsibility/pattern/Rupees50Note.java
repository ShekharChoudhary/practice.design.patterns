package behavioral.chain.of.responsibility.pattern;

public class Rupees50Note implements DispenseCash {

	private DispenseCash dispenseCash;

	@Override
	public void setNextChain(DispenseCash dispenseCash) {
		this.dispenseCash = dispenseCash;
		
	}

	@Override
	public void dispense(Currency cur) {

		if(cur.getAmount()>=50) {
			int num = cur.getAmount()/50;
			int remainder = cur.getAmount()%50;
			System.out.println("Number of 50 notes :"+num);
		}else {
			this.dispenseCash.dispense(cur);
		}
	}
	
	
}
