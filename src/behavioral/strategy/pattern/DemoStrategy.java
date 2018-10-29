package behavioral.strategy.pattern;

public class DemoStrategy {

	public static void main(String[] args) {
		Customer firstCustomer = new Customer(new HappyHour());
		firstCustomer.add(100, 2);
		firstCustomer.add(150, 3);
		firstCustomer.setStrategy(new NormalHour());
		firstCustomer.add(200, 4);
		System.out.println(firstCustomer.getBill());
	}
}
