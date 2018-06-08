package cdkGlobal.design.question;

import java.util.ArrayList;

public class Customer {

	private BillStrategy strategy;
	
	private ArrayList<Double> price = new ArrayList<>();
	
	public Customer(BillStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void add(double price) {
		this.price.add(price);
	}
	
	public double getBill() {
		
		double totalPrice = 0;
		for(Double prices : price){
			totalPrice = prices + totalPrice;
		}
		return this.strategy.calculateBill(totalPrice);
		
	}
}
