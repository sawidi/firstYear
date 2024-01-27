import java.util.ArrayList;

/**
 * Homework 3 made by Mohamed Alsawidi: Holiday.java
 * Prof: Dr. Newton
 */
public class Holiday
{
    /**
     * instance variables
     */
    private String refNumber;
    // unique number/letters
    
    private String type;
    // type of holiday
    
    private double price;
    // price of holiday

    /**
     * Constructor for objects of class Holiday
     */
    public Holiday(String newRefNumber, String newType, double newPrice)
    {
        // initialise instance variables
        refNumber = newRefNumber;
        type = newType;
        price = newPrice;
    }

    /**
     * accessor for refnumber
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * mutator for refnumber
     */
    public void setRefNumber(String newRefNumber)
    {
        refNumber = newRefNumber;
    }
    
    /**
     * accessor for type
     */
    public String getType()
    {
        return type;
    }
    
    /**
     * mutator for type
     */
    public void setType(String newType)
    {
        type = newType;
    }
    
    /**
     * accessor for price
     */
    public double getPrice()
    {
        return price;
    }
    
    /**
     * mutator for price
     */
    public void setPrice(double newPrice)
    {
        price = newPrice;
    }
}
