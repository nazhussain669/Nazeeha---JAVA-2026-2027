package TutorialsPack;

public class NumericCalc {

	public static void main(String[] args) {
		// Example 1: Widening cast (int → double)
		int wholeNumber = 25;
		double decimalNumber = wholeNumber; //automatic (no data loss)
		System.out.println("Int to double: " + decimalNumber);
		
		// Example 2: Narrowing cast (double → int)
		double pi = 3.14159;
		int approxPi = (int) pi;  //manual cast (data loss occcurs)
		System.out.println("Double to int: " + approxPi);
		
		// Example 3: Division with and without casting
		int a = 7;
		int b = 2;
		
		int intDivision = a /b; //integer division
		double realDivision = (double) a /b; // cast to double for precise result
		
		System.out.println("Integer division 7/2 = " + intDivision);
		System.out.println("Real division 7/2 = " + realDivision);
		
		// Example 4: Casting large numbers
		long bigValue = 123456789L;
		int smallValue = (int) bigValue; // narrowing may lose data
		System.out.println("Long to int: " + smallValue);
	}
	
	
}