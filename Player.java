import javax.swing.*;

public class Player {
	private String name;
	protected int health;
	private int ammo;
	
	//Constructor Methods
	public Player(String name, int ammo, int health)
	{
		setName(name);
		setAmmo(ammo);
		setHealth(health);
	}
	
	public Player(String name)
	{
		setName(/*JOptionPane.showInputDialog("Please enter your name... ")*/ "Player");
		setAmmo(5);
		setHealth(100);
	}
	
	public Player() 
	  {
	   	this("Player",5, 100);
	  }
	
	
	//Mutators
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setAmmo(int a)
	{
		this.ammo = a;
	}
	
	public void setHealth(int h)
	{
		this.health = h;
	}
	
	
	//accessors
	public String getName()
	{
		return name;
	}
	
	public int getAmmo()
	{
		return ammo;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	
	//game methods
	
	public void playerShootsHarry(Harry h){
		h.setHealth(h.health - 50);
		this.ammo = ammo - 1;

	}
	
	//toString method
	
	public String toString(){
		return name + "\nHealth: " + health + "\nammo: " + ammo;
	}
	
}
