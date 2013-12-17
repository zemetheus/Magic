import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddCardWindow extends JPanel
{
	JButton addButton, cancelButton;
	
	
	
	public AddCardWindow()
	{
		super();
		
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
	}
}
