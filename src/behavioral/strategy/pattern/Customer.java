package behavioral.strategy.pattern;

import java.util.ArrayList;

public class Customer {

	private BillStrategy strategy;
	
	private ArrayList<Double> price = new ArrayList<>();
	
	public Customer(BillStrategy strategy){
		this.strategy = strategy;
	}
	
	public void add(double price, double quantity){
		this.price.add(strategy.calculateBill(price, quantity));
	}
	
	public double getBill(){
		
		double totalPrice = 0;
		for(Double prices : price){
			totalPrice = prices + totalPrice;
		}
		return totalPrice;
	}
	
	public void setStrategy(BillStrategy strategy){
		this.strategy = strategy;
	}
	
	
}
