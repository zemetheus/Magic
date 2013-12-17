import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddCardWindow extends JFrame
{
	JButton addButton, cancelButton;
	
		
	public AddCardWindow()
	{
		super("AddCardWindow");
		
		addButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		
		cancelButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
			}
		});
		
		JMenuItem cardType1 = new JMenuItem("Instant");
		JMenuItem cardType2 = new JMenuItem("Sorcery");
		JMenuItem cardType3 = new JMenuItem("Enchantment");
		JMenuItem cardType4 = new JMenuItem("Artifact");
		JMenuItem cardType5 = new JMenuItem("Creature");
		JMenuItem cardType6 = new JMenuItem("Land");
		
		JMenuBar cardTypeMenuBar = new JMenuBar();
		JMenu cardTypeMenu = new JMenu("Card Type");
		
		cardTypeMenu.add(cardType1);
		cardTypeMenu.add(cardType2);
		cardTypeMenu.add(cardType3);
		cardTypeMenu.add(cardType4);
		cardTypeMenu.add(cardType5);
		cardTypeMenu.add(cardType6);
		
		cardTypeMenuBar.add(cardTypeMenu);
		
		JTextArea edit = new JTextArea(8, 40);
		BorderLayout bord = new BorderLayout();
		setLayout(bord);
		setJMenuBar(cardTypeMenuBar);
		pack();
		setVisible(true);
		
	}
	
	
}
