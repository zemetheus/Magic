import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddCardWindow extends JFrame
{
	private static final int WINDOW_WIDTH = 750,
			 			 	 WINDOW_HEIGHT = 700;
	
	private CardTypes cardTypeSelection = null;
	
	private GridLayout gl = new GridLayout(3,1);
	
	private ActionListener cBoxActionListener = new ActionListener()
	{
        @Override
        public void actionPerformed(ActionEvent e)
        {
        	cardTypeSelection = CardTypes.values()[cardTypeBox.getSelectedIndex()];
        	choice.setText(cardTypeSelection.toString());
        	
        	
        	/*
        	 * A case system upon card type selection to determine other pertinent information.
        	 * ----Each selection throws a text area which seeks additional information from the user
        	 * -------Instant: Card Name, Mana Cost
        	 * -------Sorcery: Card Name, Mana Cost
        	 * -------Enchantment: Card Name, Mana Cost
        	 * -------Artifact: Card Name, Mana Cost
        	 * -------Creature: Card Name, Mana Cost, Creature Type, Power, Toughness
        	 * -------Land: Card Name
        	 */
        	
        	switch(cardTypeSelection)
        	{
        		case Instant:
        		{
        			break;
        		}
        		case Sorcery:
        		{
        			break;
        		}
        		case Enchantment:
        		{
        			break;
        		}
        		case Artifact:
        		{
        			break;
        		}
        		case Creature:
        		{
        			break;
        		}
        		case Land:
        		{
        			break;
        		}
        		default:
        		{
        			System.exit(1);
        		}
        	}
        
        }
    };
	
    String[] cardTypes = {"Instant", "Sorcery", "Enchantment", "Artifact", "Creature", "Land"};
	JComboBox<CardTypes> cardTypeBox = new JComboBox<>(CardTypes.values());
	
	JTextArea choice = new JTextArea();

	public AddCardWindow()
	{
		super("Add a Card");
		
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setVisible(true);
		setFocusable(true);
		
		setLayout(gl);
		
		cardTypeBox.addActionListener(cBoxActionListener);
		
		JPanel cardTypeCBox = new JPanel();
		JLabel cardTypeLabel = new JLabel("Card Types: ");
		cardTypeCBox.add(cardTypeLabel);
		cardTypeCBox.add(cardTypeBox);
		add(cardTypeCBox);
		
		JPanel userInput = new JPanel();
		userInput.setLayout(new GridLayout(9,1));
		JLabel jlTemp;
		
		for(CardStats cs : CardStats.values())
		{
			jlTemp = new JLabel(cs.getLabel());
			userInput.add(jlTemp);
			userInput.add(new JTextField());
		}
		
		add(userInput);
	}
	
	
}
