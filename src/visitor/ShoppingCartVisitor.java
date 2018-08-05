package visitor;

public interface ShoppingCartVisitor {

	public int visit(Books book);
	public int visit(Fruits fruits);
}
