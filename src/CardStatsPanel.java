import java.awt.*;
import javax.swing.*;
import java.util.*;

public class CardStatsPanel extends JPanel
{	
	Card card;
	
	GridLayout gl = new GridLayout(9,1);
	
	ArrayList<JLabel> labels = new ArrayList<>();
	
	public CardStatsPanel(String imageName)
	{
		super();
		
		setLayout(gl);
		
		JLabel jlTemp;
		
		card = new Card(imageName);
		
		String[] stats = card.toStringArray();
		
		int n = 0;
		for(CardStats cs : CardStats.values())	
		{
			jlTemp = new JLabel(cs.getLabel()+stats[n]);
			labels.add(jlTemp);
			add(jlTemp);
			n++;
		}
		
	}
}
