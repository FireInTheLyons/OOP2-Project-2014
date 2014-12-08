import java.io.Serializable;

import javax.swing.*;

/**
 *A simple Aggregate class to assign and recieve attributes of the character(s)
 *
 */

public class Player implements Serializable { //instantiable class

    private String name;
    private int ammo;
    private int health;
    
    
    
	/**
	 * No-Argument Constructor that provides blank values for the character
	 */
    public Player() {
        name = JOptionPane.showInputDialog("Please enter your name... ");
        ammo = 2; //default values
        health = 40;
    }
    
    
    
    //Constructor Methods
   	/**
	 * Three Argument Constructor for building the character with determined values
	 *@param name Passes in the name you want to apply to the character
	 *@param ammo Passes in the ammo you want to apply to the character
     *@param health Passes in the health you want to apply to the character
     */
    public Player(String name, int ammo, int health) {
        setName(name);
        setAmmo(ammo);
        setHealth(health);
    }
    
    
    
    //Mutators
    /**
	 *Applies a name for the character
	 *@param name Passes in the name you want to apply to the character
	 */
    public void setName(String n) {
        this.name = n;
    }



	/**
	 *Applies a ammo for the character
	 *@param ammo Passes in the name you want to apply to the character
	 */
    public void setAmmo(int a) {
        this.ammo = a;
    }



    /**
	 *Applies a health for the character
	 *@param health Passes in the name you want to apply to the character
	 */
    public void setHealth(int h) {
        this.health = h;
    }



	/**
	 *Returns the character's name to be used
	 *@return Returns name (string)
	 */
    public String getName() {
        return name;
    }



	/**
	 *Returns the character's ammo to be used
	 *@return ammo (string)
	 */
    public int getAmmo() {
        return ammo;
    }



	/**
	 *Returns the character's health to be used
	 *@return health (string)
	 */
    public int getHealth() {
        return health;
    }
    

	//game methods
    public void playerShootsHarry(Harry h) {
        h.setHealth(h.health - 50);
        ammo--;

    }

	//toString method
    public String toString() {
        return name + "\nHealth: " + health + "\nAmmo: " + ammo;
        
        //Health and ammo not needed anymore because it is generated in DifficultyScreen2.
    }

}
