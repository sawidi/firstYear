
/**
 * @author (Mohamed Alsawidi)
 * @module (Programming 1)
 */
public class Friend
{
    // instance variables - replace the example below with your own
    private String name;
    private double money;

    /**
     * Constructor for objects of class Friend
     */
    public Friend(String yourName, double amount)
    {
        name = yourName;
        money = amount;
    }

    /**
     * accessor for name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * accessor for money
     */
    public double getMoney()
    {
        return money;
    }
    
    /**
     * mutator for name
     */
    public void setName(String yourName)
    {
        name = yourName;
    }
    
    /**
     * mutator for name
     */
    public void setMoney(double amount)
    {
        money = amount;
    }
    
    /**
     * return friend's details
     */
    public String toString()
    { 
        return "name : "+ name + "\nmoney : "+ money;
    }
}
