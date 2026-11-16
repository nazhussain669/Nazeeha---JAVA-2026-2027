package javaPack;

public class BankAccount {
	
	private String accountHolder;
	private double accountBalance;
	
	public String getAccountHolder()
	{
		return accountHolder;
	}
	
	public double getBalance()
	{
		return accountBalance;
	}
	
	public void setAccountHolder(String name)
	{
		this.accountHolder = "Greetings, " + name + " I am happy to assist you!";
	}
	
	public void setBalance(double money)
	{
		if (money >= 0)
		{
			this.accountBalance = money;
		}
		else
		{
			System.out.println("Error! There is an issue with the transaction!");
		}
	}

}
