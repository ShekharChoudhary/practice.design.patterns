package cdkGlobal.design.question;

/**
 * This question can be solved with the Strategy pattern
 * Check the image attached for the question details
 * @author choudshe
 *
 */
public class GenerateBill {

	public static void main(String[] args) {
		Customer firstCustomer = new Customer(new PremiumCustomer());
		firstCustomer.add(1000.50);
		firstCustomer.add(2000.50);
		firstCustomer.add(3000);
		firstCustomer.add(1000);
		System.out.println(firstCustomer.getBill());
	}
	
}
