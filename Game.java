
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Game implements ActionListener
{

	//declaring GUI elements and objects
	static JButton shootButton;
	static JTextArea area;
	static JFrame frame;
	static Player p = new Player();
	static Harry h = new Harry();
	static Game game;
	
	public Game(){ //Game constructor
	frame = new JFrame();
	FlowLayout fl = new FlowLayout();
	frame.setLayout(fl);
	area = new JTextArea();
	shootButton = new JButton("Fire");
	shootButton.addActionListener(this) ;
		
	frame.add(area);
	frame.setSize(200,200);
	frame.add(shootButton);
	frame.setVisible(true);
	area.append(p.toString()+h.toString());
	}
	
		
	public static void main(String [] args)
	{
		game = new Game(); //instantiate Game
		
		System.out.println("\nYour turn . . . ");
	}
			
	
	public void actionPerformed(ActionEvent e)
	{
		
			if (e.getSource()==shootButton)
			{
				
				System.out.println("\nYou fired! \nHarry loses 50 Health points.");
				
				area.setText(null); //remove all text from JTextArea
				p.playerShootsHarry(h);
				area.append(p.toString()+h.toString());
				
						if(h.health==0)
							{
								JOptionPane.showMessageDialog(null, "\nGame over! Harry is dead! \n\nQuitting the game . . . \n");
								System.exit(0);
							}
						}
				
				try {
    	   		Thread.sleep(2000);
		   		} catch(InterruptedException ex) {
   		   		Thread.currentThread().interrupt();
		   		}
				
				System.out.println("\nHarry fired! You lose 50 Health points.");
				
				area.setText(null);
				h.harryShootsPlayer(p);
				area.append(p.toString()+h.toString());
				
				try {
    	   		Thread.sleep(1500);
		   		} catch(InterruptedException ex) {
   		   		Thread.currentThread().interrupt();
		   		}
		   		
		   		System.out.println("\nYour turn again . . . ");
				
	}
}


