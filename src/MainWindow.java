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
		
		jbtAddCard.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
			{
			   	AddCardWindow addCardWindow = new AddCardWindow();
			}
	    });
		
		jbtViewCard.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String imageName_EXT = JOptionPane.showInputDialog("Which card would you like to view? Include File Extension."),
					   imageName = imageName_EXT.substring(0,imageName_EXT.length()-4);
				
				CardViewer cardViewer = new CardViewer(imageName_EXT,imageName);
			}
		});
		
		
		//create menus
		JMenu fileMenu = new JMenu("File");
		JMenu buildMenu = new JMenu("Build");
		JMenu viewMenu = new JMenu("View");
		JMenu editMenu = new JMenu("Edit");
		JMenu connectMenu = new JMenu("Connect");
		JMenu helpMenu = new JMenu("Help");
		
		//create menu bar
		JMenuBar mainMenuBar = new JMenuBar();
		
		//create fileMenu items
		JMenuItem fm1 = new JMenuItem("Exit");
		
		//create buildMenu items
		JMenuItem bm1 = new JMenuItem("Build Deck");
		JMenuItem bm2 = new JMenuItem("Add Card");
		
		//create viewMenu items
		JMenuItem vm1 = new JMenuItem("View Collection");
		JMenuItem vm2 = new JMenuItem("View Deck");
		JMenuItem vm3 = new JMenuItem("View Card");
		
		//create editMenu items
		JMenuItem em1 = new JMenuItem("Edit Profile");
		JMenuItem em2 = new JMenuItem("Edit Deck");
		JMenuItem em3 = new JMenuItem("Edit Card");
		
		//create connectMenu items
		JMenuItem cm1 = new JMenuItem("Host Game");
		JMenuItem cm2 = new JMenuItem("Connect to Game");
		
		//create helpMenu items
		JMenuItem hm1 = new JMenuItem("FAQ");
		JMenuItem hm2 = new JMenuItem("Help");
		
		fileMenu.add(fm1);
		
		buildMenu.add(bm1);
		buildMenu.add(bm2);
		
		viewMenu.add(vm1);
		viewMenu.add(vm2);
		viewMenu.add(vm3);
		
		editMenu.add(em1);
		editMenu.add(em2);
		editMenu.add(em3);
		
		connectMenu.add(cm1);
		connectMenu.add(cm2);
		
		helpMenu.add(hm1);
		helpMenu.add(hm2);
		
		mainMenuBar.add(fileMenu);
		mainMenuBar.add(buildMenu);
		mainMenuBar.add(viewMenu);
		mainMenuBar.add(editMenu);
		mainMenuBar.add(connectMenu);
		mainMenuBar.add(helpMenu);
		
		setJMenuBar(mainMenuBar);
		setVisible(true);
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
