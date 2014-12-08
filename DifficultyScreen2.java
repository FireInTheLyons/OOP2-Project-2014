import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

/**
 * Frame class which handles its own button events
 */
public class DifficultyScreen2 extends JFrame implements ActionListener {

    JButton easyButton, mediumButton, hardButton;
    protected int health;
    protected int ammo;

    public static void main(String args[]) {
        DifficultyScreen2 ds2 = new DifficultyScreen2();
        ds2.setVisible(true);
    }

    public DifficultyScreen2() {

        setTitle("Difficulty Screen");
        setSize(300, 200);
        setLocation(250, 200);
        Container cPane = getContentPane();
        cPane.setBackground(Color.blue);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cPane.setLayout(new FlowLayout());
        easyButton = new JButton("Easy");
        mediumButton = new JButton("Medium");
        hardButton = new JButton("Hard");
        cPane.add(easyButton);
        cPane.add(mediumButton);
        cPane.add(hardButton);

        easyButton.addActionListener(this);
        mediumButton.addActionListener(this);
        hardButton.addActionListener(this);
    }
    
    

    private void gameSetup(String difficulty, int healthChance, int ammoChance, int healthBase, int ammoBase) {
        System.out.println("\n\nYou've selected " + difficulty + " difficulty . . . \n");

        int healthModifier = (int) (Math.random() * healthChance);
        int ammoModifier = (int) (Math.random() * ammoChance);

        health = healthBase - healthModifier;
        System.out.println("\nYours Stats . . . \n\nHealth: " + health);

        ammo = ammoBase - ammoModifier;
        System.out.println("\nAmmo count: " + ammo);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == easyButton) {
            this.gameSetup("Easy", 20, 2, 100, 6);
        }
        if (e.getSource() == mediumButton) {
            this.gameSetup("Medium", 20, 3, 80, 5);
        }
        if (e.getSource() == hardButton) {
            this.gameSetup("Hard", 15, 3, 65, 4);
        }

		Game g = new Game(this);

    }
    
    public void setHealth(int h) {
        this.health = h;
    }
    
    public void setAmmo(int a) {
        this.ammo = a;
    }
    
    public int getHealth() {
        return health;
    }
    
    public int getAmmo() {
        return ammo;
    }

    public String toString() {
        return "\nHealth: " + health + "\nAmmo: " + ammo;
    }

}
