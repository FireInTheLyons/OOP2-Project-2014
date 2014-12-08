
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

/**
 * Frame class which handles its own button events
 */
public class MainMenu extends JFrame implements ActionListener {

    JButton startButton, scoreboardButton, quitButton;
    
    JTextField jtf;
    
	JLabel jl;

    public static void main(String args[]) {
        MainMenu win = new MainMenu();
        win.setVisible(true);
    }

    public MainMenu() {

        /*setTitle("Dirty Harry Simulator");
        setSize(300, 200);
        setLocation(250, 200);
        Container cPane = getContentPane();
        cPane.setBackground(Color.red);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cPane.setLayout(new FlowLayout());
        startButton = new JButton("Start");
		scoreboardButton = new JButton("Scoreboard");
        quitButton = new JButton("Quit");
        cPane.add(startButton);
		cPane.add(scoreboardButton);
        cPane.add(quitButton);

        startButton.addActionListener(this);
		scoreboardButton.addActionListener(this);
        quitButton.addActionListener(this);*/
        
        
        FlowLayout flowLayout = new FlowLayout();
		
		setLayout(flowLayout);
		setTitle("DIRTY HARRY SIMULATOR");
		setSize(300,200);
		setResizable(false);
		
		jl = new JLabel();
		jl.setText("<HTML><BR>Hello!   Welcome to Dirty Harry Simulator!<BR><BR>" + 
					"Hit 'OK' to begin the game. </HTML>");
		add(jl);
		JPanel jp = new JPanel();
		startButton = new JButton("Start");
		scoreboardButton = new JButton("Scoreboard");
		quitButton = new JButton("Quit");
		jp.add(startButton);
		jp.add(scoreboardButton);
		jp.add(quitButton);
		add(jp);			 	
		startButton.addActionListener(this);
		scoreboardButton.addActionListener(this);
		quitButton.addActionListener(this);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
         
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
		   
		   DifficultyScreen2 ds2 = new DifficultyScreen2();
           ds2.setVisible(true);

        }
        
        if (e.getSource () == scoreboardButton) {
        	
        	System.out.println("\nLoading the scoreboard . . . ");
        	
        	Scoreboard sb = new Scoreboard();
        	sb.setVisible(true);
        }

        if (e.getSource() == quitButton) {

            System.out.println("\nExiting the game . . . ");

            //DELAY TIMER	   
            try {
                Thread.sleep(500); //1000 milliseconds is one second.
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            System.exit(0);
        }

    }
}
