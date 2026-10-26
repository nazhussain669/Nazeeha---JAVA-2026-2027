package javaPack;

import java.util.Scanner;

public class CollectInfo 
{
	static Scanner allinfo = new Scanner(System.in);
	
	public CollectInfo()
	{
		AskInfo();
	}
	
	public void AskInfo()
	{
		float totalgrades = 0;
		float finalgrade = 0;
		
		System.out.print("How many grades would you like to average?");
		int numgrades = allinfo.nextInt();
		int gradenum = numgrades;
		
		while(numgrades > 0)
		{
			System.out.print("Enter grade: ");
			float entergrade = allinfo.nextFloat();
			totalgrades = totalgrades + entergrade;
			numgrades = numgrades - 1;
		}
		
		finalgrade = totalgrades / gradenum;
		System.out.print("Average = " + finalgrade);
	}
}
