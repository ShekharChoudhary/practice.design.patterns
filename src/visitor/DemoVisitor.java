package visitor;

public class DemoVisitor {

	public static void main(String[] args) {

		ItemElements[] items = { new Books(50, 001), new Books(40, 002), new Fruits("Apple", 10, 10),
				new Fruits("Banana", 6, 10) };
		
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int totalCost =0;
		for (ItemElements itemElements : items) {
			totalCost = totalCost + itemElements.accept(visitor);
		}
		
		System.out.println("Total cost is :"+totalCost);
	}
}
