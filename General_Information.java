package javaPack;

public class General_Information {

	public static void main(String[] args) 
	{
		CollectInfo();
	}
	
	private static void CollectInfo()
	{
		//create a constructor to pass information using an object
		//to the class, Person
		Person personinfo = new Person("Mr.", "Pigis");
		
		System.out.println("Hello " + personinfo.Fullname());
	}

}
