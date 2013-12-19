import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainWindow extends JFrame
{
	private static final int WINDOW_WIDTH = 750,
							 WINDOW_HEIGHT = 700;
	
	JButton jbtAddCard = new JButton("Add Card");
    //add listener for jbutton
	
	public MainWindow()
	{
		super("Magic: The Gathering");
		
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		center(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setFocusable(true);
		
		add(jbtAddCard);
		
		jbtAddCard.addActionListener(new ActionListener(){
	      public void actionPerformed(ActionEvent e)
	      {
	       AddCardWindow addCardWindow = new AddCardWindow();
	      }
	     });
	}
	
	/**
     * Helper routine to center a frame on the screen (causes problems if
     * frame is bigger than the screen)
     */
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
