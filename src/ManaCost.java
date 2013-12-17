import java.util.HashMap;

public class ManaCost
{
    private String[] manaTypes = {"Forest","Mountain","Island","Swamp","Plain","Colorless"};
    private HashMap<String, Integer> manaCosts;
    
    public ManaCost(int[] costs)
    {
        int n = 0;
        for(String s : manaTypes)
        {
            manaCosts.put(s,costs[n]);
            n++;
        }
    }
    
    public void setManaCost(String manaType, int cost)
    {
    	manaCosts.put(manaType, cost);
    }
    
    public HashMap<String,Integer> getManaCosts()
    {
        return manaCosts;
    }
}