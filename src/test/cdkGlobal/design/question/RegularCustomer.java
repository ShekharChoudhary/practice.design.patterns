package test.cdkGlobal.design.question;

public class RegularCustomer implements BillStrategy{

	@Override
	public double calculateBill(double amount) {
		double discount =0;
		if(amount>=5000 && amount <10000) {
			discount = PercentageCalculator.get10Percent(amount);
		}else{
			discount = PercentageCalculator.get20Percent(amount);
		}
		return amount - discount;
	}

}
