package visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
	

	@Override
	public int visit(Books book) {
		int cost = 0;
		if(book.getPrice()>50) {
			cost = book.getPrice() -1;
		}else {
			cost = book.getPrice();
		}
		System.out.println("Book id : " +book.getBookId()+" Price is : "+book.getPrice());
		return cost;
	}

	@Override
	public int visit(Fruits fruits) {
		int cost = 0;
		cost = fruits.getPrice() * fruits.getQuantity();
		System.out.println(fruits.getName()+"'s cost is :"+fruits.getPrice()+", quantity is :"+fruits.getQuantity());
		return cost;
	}

}
