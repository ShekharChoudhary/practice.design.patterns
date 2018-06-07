package cdkGlobal.design.question;

public class PremiumCustomer implements BillStrategy{

	@Override
	public float calculateBill(float amount) {
		float discount =0;
		if(amount<4000) {
			discount = amount *(10/100);
		}else if(amount>=4000 && amount <8000) {
			discount = amount *(15/100);
		}else if(amount>=8000 && amount <12000) {
			discount = amount *(20/100);
		}else {
			discount = amount *(30/100); 
		}
		return amount - discount;
	}

}
