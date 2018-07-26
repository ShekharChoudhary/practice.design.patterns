package chain.of.responsibility;

import java.util.Scanner;

public class ATMVendingMachine {

	private DispenseCash c1;
	
	public ATMVendingMachine() {
		c1 = new Rupees500Note();
		DispenseCash c2 = new Rupees100Note();
		DispenseCash c3 = new Rupees50Note();
		
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}
	
	public static void main(String[] args) {
		ATMVendingMachine atm = new ATMVendingMachine();
		boolean flag = true;
		while(flag) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to dispense:");
		int amount = sc.nextInt();
		if(amount%50 != 0) {
			System.out.println("The amount entered by you is not valid.");	
			return;
		}
			atm.c1.dispense(new Currency(amount));
			System.out.println("Do you want to continue (Y/N)");
			if(sc.next().equalsIgnoreCase("y")) {
				flag = true;
			}else {
				flag = false;
			}
		}
	}
}
