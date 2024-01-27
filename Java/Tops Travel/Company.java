import java.util.ArrayList;

/**
 * @author (Mohamed Alsawidi)
 * @module (Programming 1)
 */
public class Company
{
    // instance variables - replace the example below with your own
    private String name;
    private ArrayList<Website> websiteList;
    

    /**
     * Constructor for objects of class Company
     */
    public Company(String newName)
    {
        name = newName;
        websiteList = new ArrayList<>();
    }

    /**
     * accessor for websitelist
     */
    public ArrayList<Website> getWebsiteList()
    {
        // put your code here
        return websiteList;
    }
    
    /**
     * add a website to the arraylist
     */
    public void storeWebsite(Website website)
    {
        websiteList.add(website);
    }
    
    /**
     * remove a website from the arraylist
     */
    public void removeWebsite(int number)
    {
        websiteList.remove(number);
    }
    
    /**
     * returns a new arraylist with sales over a given number
     */
    public ArrayList<Website> findProfitableWebsites(int checkAmount) 
    {
        ArrayList<Website> profitableWebsites = new ArrayList<>();
        
        for (Website website : websiteList)
        {
            if (website.getSalesTotal() >= checkAmount)
                 profitableWebsites.add(website);
        }
        
        return profitableWebsites;
    }
    
    /**
     * returns a new arraylist with members that have a given holiday selected
     */
    public ArrayList<Member> findMembersHoliday(Holiday holiday) 
    {
        ArrayList<Member> loggedInMembers = new ArrayList<>();
        
        for (Website website : websiteList)
        {
            ArrayList<Member> loggedInList = website.getLoggedInList();
            
            for (Member member : loggedInList)
            {
                if (member.getHoliday() == holiday)
                {
                    loggedInMembers.add(member);
                }
            }
        }
        
        return loggedInMembers;
    }
}


