import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddCardWindow extends JFrame
{
	private static final int WINDOW_WIDTH = 750,
			 WINDOW_HEIGHT = 700;
	
	String cardTypeSelection = null;
	
	ActionListener cBoxActionListener = new ActionListener()
	{
        @Override
        public void actionPerformed(ActionEvent e)
        {
        	cardTypeSelection = cardTypes[cardTypeBox.getSelectedIndex()];
        	choice.setText(cardTypeSelection);
        	
        	
        	/*A case system upon card type selection to determine other pertinent information.
        	 * ----Each selection throws a text area which seeks additional information from the user
        	 * -------Instant: Card Name, Mana Cost
        	 * -------Sorcery: Card Name, Mana Cost
        	 * -------Enchantment: Card Name, Mana Cost
        	 * -------Artifact: Card Name, Mana Cost
        	 * -------Creature: Card Name, Mana Cost, Creature Type, Power, Toughness
        	 * -------Land: Card Name
        	 */
        	
        	switch(choice)
        	{
        		case 0:
        			
        
        }
    };
	
        
	
	String[] cardTypes = {"Instant", "Sorcery", "Enchantment", "Artifact", "Creature", "Land"};
	JComboBox<String> cardTypeBox = new JComboBox<>(cardTypes);
	
	JTextArea choice = new JTextArea();
	
	
	
        
	
	
	public AddCardWindow()
	{
		super("Add a Card");
		
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setVisible(true);
		setFocusable(true);
		
		cardTypeBox.addActionListener(cBoxActionListener);
		
		
		
		
		
		JPanel cardTypeCBox = new JPanel();
		JLabel cardTypeLabel = new JLabel("Card Types: ");
		cardTypeCBox.add(cardTypeLabel);
		cardTypeCBox.add(cardTypeBox);
		add(cardTypeCBox);
		
		JPanel userInput = new JPanel();
		JLabel cardName = new JLabel("Card Name: ");
		JLabel manaCost = new JLabel("Mana Cost: ");
		JLabel creatureType = new JLabel("Creature Type: ");
		JLabel 
		
		
	}
	
	
}
