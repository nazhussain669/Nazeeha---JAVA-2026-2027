package javaPack;

public class MainBank {

	public static void main(String[] args) 
	{
		DisplayMain();
	}
	
	static void DisplayMain()
	{
		BankAccount myAccount = new BankAccount();
		myAccount.setAccountHolder("Mr. Pigis");
		myAccount.setBalance(1000000);
		
		System.out.println("User: " + myAccount.getAccountHolder());
		System.out.println("Balance: $" + myAccount.getBalance());
	}

}
