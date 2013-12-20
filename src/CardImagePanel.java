import javax.swing.*;


public class CardImagePanel extends JPanel
{
	ImageIcon cardImage = null;
	
	public CardImagePanel(String imageName)
	{
		super();
		
		String dir = "CardImages/" + imageName;
		
		cardImage = new ImageIcon(dir);
		
		add(new JLabel(cardImage));
	}
}
