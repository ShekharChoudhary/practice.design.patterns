package cdkGlobal.design.question;

public class PremiumCustomer implements BillStrategy{

	@Override
	public double calculateBill(double amount) {
		double discount =0;
		if(amount<4000) {
			discount = amount *(10d/100d);
		}else if(amount>=4000 && amount <8000) {
			discount = amount *(15d/100d);
		}else if(amount>=8000 && amount <12000) {
			discount = amount *(20d/100d);
		}else {
			discount = amount *(30d/100d); 
		}
		return amount - discount;
	}


}
