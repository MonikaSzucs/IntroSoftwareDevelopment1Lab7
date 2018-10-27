
/**
 * Write a description of class Person here.
 *
 * @author Monika Szucs
 * @version Oct 26, 2018
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private int birthYear;
    private String sex;
    private double weightPounds;
    private String highestEducationLevel;

    /**
     * Constructor for objects of class Person
     */
    public Person(String firstName, String lastName, int birthYear, String sex, double weightPounds, String highestEducationLevel)
    {
        // initialise instance variables
        setFirstName(firstName);
        setLastName(lastName);
        System.out.println("Hello " + firstName + " " + lastName);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     */
    public void setFirstName(String firstName)
    {
        // put your code here
        if(firstName.equalsIgnoreCase("Mike")){
            this.firstName = null;
        } 
        else{
            this.firstName = firstName;
        }
    }
    
    public void setLastName(String lastName)
    {
        // put your code here
        if(lastName.equalsIgnoreCase("Mulder")){
            this.lastName = null;
        }else{
            this.lastName = lastName;
        }
    }
}
