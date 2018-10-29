package behavioral.command.pattern;

public class CommandDemo {

	public static void main(String[] args) {

		Stock abcStock = new Stock();
		
		Broker broker = new Broker();
		
		broker.takeOrder(new BuyStock(abcStock));
		broker.takeOrder(new SellStock(abcStock));
		
		broker.placeOrder();
	}
}
