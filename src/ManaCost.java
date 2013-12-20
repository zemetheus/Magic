import java.util.HashMap;

public class ManaCost
{
    private final String[] manaTypes = {"Forest","Mountain","Island","Swamp","Plain","Colorless"};
    private HashMap<String, Integer> manaCosts = new HashMap<>();
    
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
    
    public String toString()
    {
    	String temp = "";
    	int c = 0;
    	
    	for(int cost : manaCosts.values())
    	{
    		for(int n=0;n<cost;n++)
    		{
    			if(c>4)
    				break;
    			
    			temp += getSymbol(c);
    			c++;
    			
    		}
    		if(c==4)
    			temp = Integer.toString(cost) + temp;
    	}
    	
    	return temp;
    }
    
    public int calculateConvertedManaCost()
    {
    	int convertedManaCost = 0;
    	
    	for(int cost : manaCosts.values())
    	{
    		convertedManaCost += cost;
    	}
    	
    	return convertedManaCost;
    }
    
    private String getSymbol(int c)
    {
    	String symbol = null;
    	
    	switch(c)
    	{
	    	case 0:
	    		symbol = "G";
	    		break;
	    	case 1:
	    		symbol = "R";
	    		break;
	    	case 2:
	    		symbol = "U";
	    		break;
	    	case 3:
	    		symbol = "B";
	    		break;
	    	case 4:
	    		symbol = "W";
	    		break;
	    	default:
	    	{
	    			System.out.println("getSymbolError");
	    			System.exit(1);
	    	}
    	}
    	
    	return symbol;
    }
}