package TutorialsPack;

import java.util.Scanner;

public class BasicCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Take two numbers and perform calculations
		System.out.print("Enter first number: ");
		double num1 = input.nextDouble();
		
		System.out.print("Enter second number: ");
		double num2 = input.nextDouble();

		System.out.println("Sum = " + (num1 + num2));
		System.out.println("Difference = " + (num1 - num2));
		System.out.println("Product = " + (num1 * num2));
		System.out.println("Quotient = " + (num1 / num2));
	}

}
