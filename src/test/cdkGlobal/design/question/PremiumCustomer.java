package test.cdkGlobal.design.question;

public class PremiumCustomer implements BillStrategy{

	@Override
	public double calculateBill(double amount) {
		double discount =0;
		if(amount<4000) {
			discount = PercentageCalculator.get10Percent(amount);
		}else if(amount>=4000 && amount <8000) {
			discount = PercentageCalculator.get15Percent(amount);
		}else if(amount>=8000 && amount <12000) {
			discount = PercentageCalculator.get20Percent(amount);
		}else {
			discount = PercentageCalculator.get30Percent(amount);
		}
		return amount - discount;
	}


}
