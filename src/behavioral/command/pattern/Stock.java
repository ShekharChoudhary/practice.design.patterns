package behavioral.command.pattern;

public class Stock {

	private String name = "abc";
	private int quantity = 10;
	
	public void buy(){
		System.out.println("Stock "+name+" bought. Quantity is "+quantity+" .");
	}
	
	public void sold(){
		System.out.println("Stock "+name+" sold. Quantity is "+quantity+" .");
	}
}
