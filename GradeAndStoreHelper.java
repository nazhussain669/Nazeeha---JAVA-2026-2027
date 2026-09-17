package CashierJAVA;

import java.util.Scanner;

public class GradeAndStoreHelper {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Enter item quantity: ");
		int items = input.nextInt();
		
		System.out.print("Enter price per ietm: ");
		int priceper = input.nextInt();
		
		System.out.println("Subtotal: $" + (items * priceper));
	

	}

}
