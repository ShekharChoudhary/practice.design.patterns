package behavioral.command.pattern;

import java.util.*;

public class Broker {

	private List<Order> stockExecution = new ArrayList<>();
	
	public void takeOrder(Order order){
		stockExecution.add(order);
	}
	
	public void placeOrder(){
		for(Order order : stockExecution){
			order.execute();
		}
		stockExecution.clear();
	}
	
	
}
