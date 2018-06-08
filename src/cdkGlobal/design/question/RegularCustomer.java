package cdkGlobal.design.question;

public class RegularCustomer implements BillStrategy{

	@Override
	public double calculateBill(double amount) {
		double discount =0;
		if(amount>=5000 && amount <10000) {
			discount = amount *(10d/100d);
		}else{
			discount = amount *(20d/100d);
		}
		return amount - discount;
	}

}
