import javax.swing.*;

public class Player {
	private String name;
	
	protected int health = (int)(Math.random()*50);		
	private int ammo = (int)(Math.random()*6);
	
	/*public Player(String name)
	{
		setName(JOptionPane.showInputDialog("Please enter your name... ") "Player");
		setAmmo(ammo);
		setHealth(health);
	}*/
	
	public Player() 
	  {
	   	name = "Player";
	   	ammo = 5;
	   	health = 100;
	  }
		  
	  
	//Constructor Methods
	public Player(String name, int ammo, int health)
	{
		setName(name);
		setAmmo(ammo);
		setHealth(health);
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
