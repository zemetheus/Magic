import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainWindow extends JFrame
{
	private static final int WINDOW_WIDTH = 750,
							 WINDOW_HEIGHT = 700;
	
	JButton jbtAddCard = new JButton("Add Card");
    JButton jbtViewCard = new JButton("View Card");
	
    FlowLayout fl = new FlowLayout();
    
	public MainWindow()
	{
		super("Magic: The Gathering");
		
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		center(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(fl);
		
		setVisible(true);
		setFocusable(true);

		add(jbtAddCard);
		add(jbtViewCard);
		
		jbtAddCard.addActionListener(new ActionListener(){
	      public void actionPerformed(ActionEvent e)
	      {
	       AddCardWindow addCardWindow = new AddCardWindow();
	      }
	     });
		
		jbtViewCard.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				CardViewer cardViewer = new CardViewer("arbor_elf.jpg","arbor_elf");
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
