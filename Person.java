package javaPack;

public class Person
{
	//the private access modifier restricts
	//direct access to this field from
	//outside the Person class
	private String firstname;
	private String lastname;
	
	public Person(String fname, String lname)
	{
		//firstname and lastname are instance variables 
		//instance variables are fields (variables) declared
		//within a class but outside of any method, constructor, or block
		this.firstname = fname;
		this.lastname = lname;
	}
	
	public String Fullname()
	{
		String completename;
		completename = firstname + " " + lastname;
		return completename;
	}
}
