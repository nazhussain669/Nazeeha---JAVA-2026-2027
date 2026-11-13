package javaPack;

public class ActivityReturn {

	public static void main(String[] args) {
		int total = addNumbers(15, 25);
		System.out.println("The sum is: " + total);
		
		double area = calculateCircleArea(5.0);
		System.out.println("The area is: " + area);
	}
	
	public static int addNumbers(int a, int b) {
		return a + b;
	}
	
	public static double calculateCircleArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}

}
