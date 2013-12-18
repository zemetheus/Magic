import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddCardWindow extends JPanel
{
	String[] cardTypes = {"Instant", "Sorcery", "Enchantment", "Artifact", "Creature", "Land"};
	JComboBox cardTypeBox = new JComboBox(cardTypes);
	
	JMenuItem cardType1 = new JMenuItem("Instant");
	JMenuItem cardType2 = new JMenuItem("Sorcery");
	JMenuItem cardType3 = new JMenuItem("Enchantment");
	JMenuItem cardType4 = new JMenuItem("Artifact");
	JMenuItem cardType5 = new JMenuItem("Creature");
	JMenuItem cardType6 = new JMenuItem("Land");
	
	JMenuBar cardTypeMenuBar = new JMenuBar();
	JMenu cardTypeMenu = new JMenu("Card Type");
	
	JTextArea edit = new JTextArea(8, 40);
	BorderLayout bord = new BorderLayout();
	
	public AddCardWindow()
	{
		/*addButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});*/
		
		/*cancelButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
			}
		});*/
		
		
		cardTypeMenu.add(cardType1);
		cardTypeMenu.add(cardType2);
		cardTypeMenu.add(cardType3);
		cardTypeMenu.add(cardType4);
		cardTypeMenu.add(cardType5);
		cardTypeMenu.add(cardType6);
		super("Add a Card");
		
		setSize(220, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pane = new JPanel();
		JLabel cardTypeLabel = new JLabel("Select a card type: ");
		pane.add(cardTypeLabel);
		pane.add(cardTypeBox);
		add(pane);
		setVisible(true);
		
		
		setLayout(bord);
		//setJMenuBar(cardTypeMenuBar);
		setVisible(true);
	}
	
	
}
