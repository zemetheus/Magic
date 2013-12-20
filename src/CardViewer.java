import java.awt.*;

import javax.swing.*;

public class CardViewer extends JFrame
{
	CardImagePanel cardImagePanel;
	CardStatsPanel cardStatsPanel;
	
	final static int WINDOW_WIDTH = 600;
	final static int WINDOW_HEIGHT = 400;
	
	public CardViewer(String imageName_Ext, String imageName)
	{
		super(imageName);
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        
        setLayout(new BorderLayout());
        
        cardImagePanel = new CardImagePanel(imageName_Ext);
        cardStatsPanel = new CardStatsPanel(imageName);
        
	    add(cardImagePanel,BorderLayout.WEST);
	    add(cardStatsPanel,BorderLayout.CENTER);
	    
	    center(this);
	    
	    setVisible(true);
	}
	
	public static void center(JFrame frame)
    {
    	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    	Point center = ge.getCenterPoint();

    	int w = frame.getWidth();
    	int h = frame.getHeight();

    	int x = center.x - w / 2, y = center.y - h / 2;
    	frame.setBounds(x, y, w, h);
    	frame.validate();
    }
}
