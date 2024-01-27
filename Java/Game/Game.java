
/**
 * homework Game.java.
 *
 * made by Mohamed Alsawidi
 */
public class Game
{
    /**
     * Field of class Game
     * declaration of title
     */
    private String title;
    /**
     * declaration of objective
     */
    private String objective;
    /**
     * declaration of cost of the game in pence
     */
    private int costInPence;
    /**
     * declaration of number of downloads of the game
     */
    private int numberOfDownloads;
    /**
     * declaration of name of the best scorer
     */
    private String bestScoreName;
    /**
     * declaration of the best score
     */
    private int bestScore;
    /**
     * declaration of the game manager
     */
    private Manager gameManager; 
    
    /**
     * Constructor for objects of class Game
     */
    //public Game(String newTitle, String newObjective, int newCostInPence)
    public Game(String newTitle, String newObjective, int newCostInPence, Manager newGameManager)
    {
        title = newTitle;
        objective = newObjective;
        costInPence = newCostInPence;
    }

    /**
     * Second, default, constructor for testing
     */
    public Game()
    {
        title = "Minecraft";
        objective = "Survive";
        costInPence = 500;
        bestScoreName = "Soueidi";
        bestScore = 100;
        gameManager = new Manager("Soueidi","009913");
    }
    
    /**
     * accessor for the title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * accessor for the objective
     */
    public String getObjective()
    {
        return objective;
    }
    
    /**
     * accessor for the cost
     */
    public int getCostInPence()
    {
        return costInPence;
    }
    
    /**
     * mutator for the title
     */
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }
    
    /**
     * mutator for the objective
     */
    public void setObjective(String newObjective)
    {
        objective = newObjective;
    }
    
    /**
     * mutator for the cost
     */
    public void setCostInPence(int newCostInPence)
    {
        costInPence = newCostInPence;
    }
    
    /**
     * congratulates the user for downloading and reminds said user of the cost in pence
     */
    public void download()
    {
        System.out.println("Congratulations on your download! Please pay "+ costInPence +" pence. Thank you");
        numberOfDownloads++;
        // the number of downloads increase each time this method gets called
    }
    
    /**
     * gets new score and name of scorer and updates previous score if its value is higher
     */
    public void checkScore(int newBestScore, String newBestScoreName)
    {
        if (newBestScore > bestScore)
        {
            // if the new score is better the existing one, it gets replaced
            bestScore = newBestScore;
            bestScoreName = newBestScoreName;
        }
    }
    
    /**
     * print details of the game
     */
    public void printReport()
    {
        System.out.println("Title: "+ title);
        System.out.println("Objective: "+ objective);
        System.out.println("Download cost: "+ costInPence);
        System.out.println("Number of downloads to date: "+ numberOfDownloads);
        System.out.println("Best score to date: "+ bestScore);
        System.out.println("Player with best score: "+ bestScoreName);
        System.out.println("Total earnings to date: "+ calculateEarnings());
        System.out.println("Game manager: "+ gameManager.getSurname());
    }
    
    /**
     * calculate total earnings
     */
    public int calculateEarnings()
    {
        //multiply the number of downloads to the cost given at the start
        return numberOfDownloads * costInPence;
    }
}
