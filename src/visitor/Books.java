package visitor;

public class Books implements ItemElements{

	private int price;
	private int bookId;
	
	public Books(int price, int bookId) {
		this.price = price;
		this.bookId = bookId;
	}
	
	
	public int getPrice() {
		return price;
	}


	public int getBookId() {
		return bookId;
	}


	@Override
	public int accept(ShoppingCartVisitor visitor) {
		
		return visitor.visit(this);
	}

}
