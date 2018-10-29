package behavioral.strategy.pattern;

public class NormalHour implements BillStrategy{

	@Override
	public double calculateBill(double price, double quantity) {
		
		return price * quantity;
	}

}
