
/**
 * Manager.java
 * made by Mohamed Alsawidi
 */
public class Manager
{
    /**
     * fields of the class Manager
     */
    private String surname;
    /**
     * declaration of the manager id
     */
    private String managerID;

    /**
     * constructor for objects of class Manager
     */
    public Manager(String newSurname, String newManagerID)
    {
        surname = newSurname;
        managerID = newManagerID;
    }
    
    /**
     * accessor for surname
     */
    public String getSurname()
    {
        return surname;
    }
    
    /**
     * accessor for manager ID
     */
    public String getManagerID()
    {
        return managerID;
    }
}
