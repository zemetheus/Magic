import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

import java.io.*;
import java.io.File.*;

import javax.imageio.ImageIO;
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
