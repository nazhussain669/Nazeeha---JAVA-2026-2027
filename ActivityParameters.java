package javaPack;

public class ActivityParameters {

	public static void main(String[] args) {
		greetUser("Alice", 3);
		greetUser("Bob", 1);
	}
	
	public static void greetUser(String name, int alerts) {
		System.out.println("Hello, " + name + "! You have " + alerts);
	}

}
