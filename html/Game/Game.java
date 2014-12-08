

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class Game implements ActionListener {

    //declaring GUI elements and objects
    static JButton shootButton;
    static JTextArea area;
    static JFrame frame;
    static Player p = new Player();
    static Harry h = new Harry();
    static DifficultyScreen2 ds2; //declaring
    //static Game game1;

    public Game(DifficultyScreen2 diff) { //Game constructor
        frame = new JFrame();
        FlowLayout fl = new FlowLayout();
        frame.setLayout(fl);
        area = new JTextArea();
        shootButton = new JButton("Fire");
        shootButton.addActionListener(this);
        
        ds2 = diff;

		p.setHealth(ds2.getHealth());
		p.setAmmo(ds2.getAmmo());

        frame.add(area);
        frame.setSize(200, 200);
        frame.add(shootButton);
        frame.setVisible(true);
        area.append(p.toString() + h.toString());
    }
    
    public void save() throws IOException {
		ObjectOutputStream os;
		os = new ObjectOutputStream(new FileOutputStream ("Character Stats.dat"));
		os.writeObject(p);
		os.close();
	}

    public static void main(String[] args) {



        System.out.println("\nYour turn . . . ");
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == shootButton) {

            System.out.println("\n\nYou fired! \nHarry loses 50 Health points.\n");

            area.setText(null); //remove all text from JTextArea
            p.playerShootsHarry(h);
            area.append(p.toString() + h.toString());

            if (h.health == 0) {
                JOptionPane.showMessageDialog(null, "\nGame over! Harry is dead! YOU WIN!");
                
                int choice = JOptionPane.showConfirmDialog(null,"Your Character's End Stats . . . \n\n" + p.toString() + "\n\nDo you want to save your results?\n\n",
														"Results:",JOptionPane.YES_NO_OPTION);
                
                
                if(choice == JOptionPane.YES_OPTION)
					{
						
						p.toString();
						
						try {
							save();
							System.out.println("Data saved successfully");
						}
						
						catch (IOException f){
							System.out.println("Not able to save the file:\n"+
							"Check the console printout for clues to why ");
							f.printStackTrace();
						}
						
					}			
               
                System.exit(0);
            }
            
            /*if (ds2.health == 0) {
            	JOptionPane.showMessageDialog(null, "\nGame over! You are dead! YOU LOSE! \n\nQuitting the game . . . \n");
            	System.exit(0);
            }*/
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nHarry fired! You lose 50 Health points.");

        area.setText(null);
        h.harryShootsPlayer(p);   	
        area.append(p.toString() + h.toString());

        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n\nYour turn again . . . ");

    }
}
