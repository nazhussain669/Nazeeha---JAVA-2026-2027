package javaPack;

import java.util.Scanner;

public class CollectInfo
{
    String fname, lname;
    Scanner allinput = new Scanner(System.in);

    public CollectInfo()
    {
        AllInfo();
    }

    public void AllInfo()
    {
        System.out.print("Enter your first name: ");
        fname = allinput.nextLine();

        System.out.print("Enter your last name: ");
        lname = allinput.nextLine();

        NameTag tag = new NameTag(fname, lname);

        System.out.println("Formatted Name: " + tag.getFormattedName());
    }
}