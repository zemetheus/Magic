import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddCardWindow extends JFrame
{
	String[] cardTypes = {"Instant", "Sorcery", "Enchantment", "Artifact", "Creature", "Land"};
	JComboBox cardTypeBox = new JComboBox(cardTypes);
	
		
	public AddCardWindow()
	{
		super("Add a Card");
		
		setSize(220, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pane = new JPanel();
		JLabel cardTypeLabel = new JLabel("Select a card type: ");
		pane.add(cardTypeLabel);
		pane.add(cardTypeBox);
		add(pane);
		setVisible(true);
		
		
		
	}
	
	
}
