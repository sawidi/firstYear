import java.util.ArrayList;

/**
 * Homework 3 made by Mohamed Alsawidi: Member.java
 * Prof: Dr. Newton
 */
public class Member
{
    // instance variables
    private String email;
    private int membershipNumber;
    private boolean loggedInStatus;
    private Holiday holiday;
    private Website website;
    private ArrayList<Friend> companions;
    private double money;

    /**
     * Constructor for objects of class Member
     */
    public Member(String newEmail, int newMembershipNumber, double newMoney)
    {
        // initialise instance variables
        email = newEmail;
        membershipNumber = newMembershipNumber;
        companions = new ArrayList<>();
        money = newMoney;
    }

    /**
     * accessor for email
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * mutator for email
     */
    public void setEmail(String newEmail)
    {
        email = newEmail;
    }
    
    /**
     * accessor for membership number
     */
    public int getMembershipNumber()
    {
        return membershipNumber;
    }
    
    /**
     * mutator for membership number
     */
    public void setMembershipNumber(int newMembershipNumber)
    {
        membershipNumber = newMembershipNumber;
    }
    
    /**
     * change log in status
     */
    public void setLoggedInStatus(boolean newBool)
    {
        loggedInStatus = newBool;
    }
    
    /**
     * accessor for logged in status
     */
    public boolean getLoggedInStatus()
    {
        return loggedInStatus;
    }
    
    /**
     * makes sure you sign in and change your holiday
     */
    public void selectHoliday(Holiday holiday) 
    {
        //if signed in
        if (loggedInStatus == true)
        {
            if (checkMoney(holiday) == true)
            {
                //change the existing holiday with a holiday given by the user
                this.holiday = holiday;
                //print holiday details
                System.out.println("member ID: "+ membershipNumber);
                System.out.println("holiday ref number: "+ this.holiday.getRefNumber());
                System.out.println("holiday type: "+ this.holiday.getType());
                System.out.println("holiday price: £"+ this.holiday.getPrice());
            }
            else
                System.out.println("Insufficient Money!");
        }
        else
            //if not signed in
            System.out.println("Log in first");
    }
    
    /**
     * pay for holiday
     */
    public void payForHoliday(double number)
    {
        int friends = companions.size() + 1;
        number *= friends;
        this.website.setSalesTotal(number);
    }
    
    /**
     * accessor for website
     */
    public Website getWebsite()
    {
        return this.website;
    }
    
    /**
     * mutator for website
     */
    public void setWebsite(Website website)
    {
        this.website = website;
    }
    
    /**
     * return chosen holiday
     */
    public Holiday getHoliday()
    {
        return holiday;
    }
    
    /**
     * return member details
     */
    public String toString()
    { 
        return "membership number : "+ membershipNumber + "\nemail : "+ email + "\nlogged in status : " + loggedInStatus;
    }
    
    /**
     * add a friend object to the array list
     */
    public void storeFriends(Friend friend)
    {
        companions.add(friend);
    }
    
    /**
     * lists all friends stored in the list
     */
    public void listFriends() 
    {
        for (Friend friend : companions)
        System.out.println(friend.toString());
    }
    
    /**
     * accessor for money
     */
    public double getMoney()
    {
        return money;
    }
    
    /**
     * mutator for money
     */
    public void setMoney(double newMoney)
    {
        money = newMoney;
    }
    
    /**
     * checks if all friends and member are able to afford the holiday
     */
    public boolean checkMoney(Holiday holiday)
    {
        double price = holiday.getPrice();
        if ((money >= price))
        {
            for (Friend friend : companions)
            {
                if (friend.getMoney() < price)
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    /**
     * lists people who cannot afford the holiday
     */
    public void whoCannotPay(Holiday holiday)
    {
        double price = holiday.getPrice();
        
        if (money > price)
        {
            for (Friend friend : companions)
            {
                if (friend.getMoney() < price)
                {
                    System.out.println(friend.getName()+ " has insufficient money to afford this holiday");
                }
            }
        }
        else 
            System.out.println(membershipNumber + " has insufficient money to afford this holiday");
    }
    
    /**
     * remove a companion
     */
    public void removeCompanion(int number)
    {
        companions.remove(number);
    }
}
