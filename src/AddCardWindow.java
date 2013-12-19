import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddCardWindow extends JFrame
{
	private static final int WINDOW_WIDTH = 750,
			 WINDOW_HEIGHT = 700;
	
	
	
	
	String[] cardTypes = {"Instant", "Sorcery", "Enchantment", "Artifact", "Creature", "Land"};
	JComboBox cardTypeBox = new JComboBox(cardTypes);
	
	
	
	
	
	
	public AddCardWindow()
	{
		super("Add a Card");
		
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setVisible(true);
		setFocusable(true);
		
		
		
		
		
		
		
		JPanel pane = new JPanel();
		JLabel cardTypeLabel = new JLabel("Card Types: ");
		pane.add(cardTypeLabel);
		pane.add(cardTypeBox);
		add(pane);
		
	}
	
	
}
