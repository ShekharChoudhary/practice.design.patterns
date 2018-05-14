package strategy;

public class HappyHour implements BillStrategy{

	@Override
	public double calculateBill(double price, double quantity) {

		return price *0.5 * quantity;
	}

}
