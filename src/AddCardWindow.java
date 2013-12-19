import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddCardWindow extends JFrame
{
	private static final int WINDOW_WIDTH = 750,
			 WINDOW_HEIGHT = 700;
	
	String selection = null;
	
	ActionListener cBoxActionListener = new ActionListener()
	{
        @Override
        public void actionPerformed(ActionEvent e)
        {
        	selection = cardTypes[cardTypeBox.getSelectedIndex()];
        	choice.setText(selection);
        
        }
    };
	
        
	
	String[] cardTypes = {"Instant", "Sorcery", "Enchantment", "Artifact", "Creature", "Land"};
	JComboBox<String> cardTypeBox = new JComboBox<>(cardTypes);
	
	JTextArea choice = new JTextArea(10, 10);
	
	
	
        
	
	
	public AddCardWindow()
	{
		super("Add a Card");
		
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setVisible(true);
		setFocusable(true);
		
		cardTypeBox.addActionListener(cBoxActionListener);
		
		
		
		
		
		JPanel pane = new JPanel();
		JLabel cardTypeLabel = new JLabel("Card Types: ");
		pane.add(cardTypeLabel);
		pane.add(cardTypeBox);
		pane.add(choice);
		add(pane);
		
		
	}
	
	
}
