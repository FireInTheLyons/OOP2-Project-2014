import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class Scoreboard extends JFrame {
    
    Player game1;
    
    public Scoreboard() {

        setTitle("Scoreboard");
        setSize(300, 200);
        setLocation(250, 200);
        Container cPane = getContentPane();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cPane.setLayout(new FlowLayout());
        
        open();
        
        JLabel txt = new JLabel(game1.toString());
        cPane.add(txt);
    }
    
		public void open() {
			try{
				ObjectInputStream is;
				is = new ObjectInputStream(new FileInputStream ("Character Stats.dat"));
				game1 = (Player) is.readObject();
				is.close();
				}
	
			catch(Exception e) {
				JOptionPane.showMessageDialog(null,"No File Detected, Generating. delete statsfile.dat to reset");
				e.printStackTrace();
				}
		}
    
}
