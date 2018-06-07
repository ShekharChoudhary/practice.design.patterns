package cdkGlobal.design.question;

public class RegularCustomer implements BillStrategy{

	@Override
	public float calculateBill(float amount) {
		float discount =0;
		if(amount>=5000 && amount <10000) {
			discount = amount *(10/100);
		}else{
			discount = amount *(20/100);
		}
		return amount - discount;
	}

}
