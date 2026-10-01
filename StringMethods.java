package javaPack;

public class StringMethods()
{
	String message = "The Secret Code is: JavaRocks123!";
	
	System.out.println("Original message: " + message);
	
	System.out.println("Length: " + message.length());
	
	System.out.println("Uppercase: " + message.toUpperCase());
	System.out.println("Lowercase: " + message.toLowerCase());
	
	String code = message.substring(22, 33);
	System.out.println("Extracted code: " + code);
	
	System.out.println("Index of 'Code': " + message.indexOf("Code"));
	
	System.out.println("Character at index 10: " + message.charAt(10));
	
	System.out.println("Contains 'Secret'?: " + message.contains("Secret"));
	
	String maskedMessage = message.replace("JavaRocks123", "*************");
	System.out.println("Masked message: " + maskedMessage);
	
	String comparison = "the secret code is: javarocks123!";
	System.out.println("Equal (ignore case)? " + message.equalsIgnoreCase(comparison));
	
	String messyString = "   Hidden Message   ";
	System.out.println("Trimmed: '" + messyString.trim() +  "'");
}
