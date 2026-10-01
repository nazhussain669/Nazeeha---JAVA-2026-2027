package javaPack;

public class DisplayJavaMenu()
{
	String title = "Welcome to Java Cafe \n";
	String line = "--------------------\n\n";
	
	String menu = "Menu:\n";
	menu += "\t1. Espresso\t$2.50\n";
	menu += "\t2. Latte\t\t$3.50\n";
	menu += "\t3. Cappuccino\t$4.00\n\n";
	
	String quote = "\"Drink coffee and code Java!\"\n\n";
	
	String path = "Visit us at: C:\\\\JavaCafe\\\\MainStreet";
	
	String fullMessage = title + line + menu + quote + path;
	
	System.out.println(fullMessage);
	
}
