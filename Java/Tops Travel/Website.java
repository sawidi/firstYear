import java.util.ArrayList;

/**
 * Homework 3 made by Mohamed Alsawidi: Website.java
 * Prof: Dr. Newton
 */
public class Website
{
    /**
     * instance variables
     */
    private String websiteName;
    // store website name
    
    private int hits;
    //record number of log ins
    
    private double salesTotal;
    //record the amount of money gained
    
    private ArrayList<Member> loggedInList;

    /**
     * Constructor for objects of class Website
     */
    public Website(String newWebsiteName)
    {
        websiteName = newWebsiteName;
        loggedInList = new ArrayList<>();
    }

    /**
     * accessor for website name
     */
    public String getWebsiteName()
    {
        return websiteName;
    }
    
    /**
     * mutator for website name
     */
    public void setWebsiteName(String newWebsiteName)
    {
        websiteName = newWebsiteName;
    }
    
    /**
     * accessor for hits
     */
    public int getHits()
    {
        return hits;
    }
    
    /**
     * accessor for hits
     */
    public void setHits(int newHits)
    {
        hits = newHits;
    }
    
    /**
     * mutator for sales total number
     */
    public double getSalesTotal()
    {
        return salesTotal;
    }
    
    /**
     * mutator for sales total number
     */
    public void setSalesTotal(double newSalesTotal)
    {
        salesTotal += newSalesTotal;
    }
    
    /**
     * member logs in 
     */
    public void memberLogIn(Member member)
    {
        member.setLoggedInStatus(true);
        System.out.print(websiteName +" welcomes number "+ member.getMembershipNumber() +", you are now logged in");
        hits +=1;
        member.setWebsite(this);
        loggedInList.add(member);
    }
    
    /**
     * member logs out
     */
    public void memberLogout(Member member)
    {
        member.setLoggedInStatus(false);
        System.out.print(websiteName +" welcomes number "+ member.getMembershipNumber() +", you are now logged out");
    }
    
    /**
     * pay and print confirmation
     */
    public void checkout(Member member)
    {
        if (member.getHoliday() != null && member.getLoggedInStatus() == true)
        //if a holiday has been chosen AND the member is logged in
        {
            if (checkHitDiscount() == false)
            //no eligibilty for a discount
            {
                member.payForHoliday(member.getHoliday().getPrice());
                System.out.println("Purchase Successful!");
            }
            else 
            // eligible for 10% discount
            {
                System.out.println("Congratulations! You are eligible for a 10% Discount!");
                double discount = member.getHoliday().getPrice() *0.9d;
                member.payForHoliday(discount);
                System.out.println("Purchase Succesful!");
            }
        }
        else
            System.out.println("error");
    }
    
    /**
     * check if eligible for discount (every 10th log in)
     */
    public boolean checkHitDiscount()
    {
        if (hits == 10)
        {
            return true;
        }
        return false;
    }
    
    /**
     * accessor for loggedInList
     */
    public ArrayList getLoggedInList()
    {
        return loggedInList;
    }
    
    /**
     * accessor for the number of users inside the array
     */
    public int getNumberOfUsers()
    {
        return loggedInList.size();
    }
    
    /**
     * prints out the details of all members logged into the website
     */
    public void listMembersLoggedIn()
    {
        for (Member loggedIn : loggedInList)
        System.out.println(loggedIn.toString());
    }
}
