package javaPack;

public class NameTag
{
    private String firstname;
    private String lastname;

    public NameTag(String fname, String lname)
    {
        this.firstname = fname;
        this.lastname = lname;
    }

    public String getFirstName()
    {
        return firstname;
    }

    public String getLastName()
    {
        return lastname;
    }

    public String getFormattedName()
    {
        String formattedName = lastname + ", " + firstname;
        return formattedName;
    }
}