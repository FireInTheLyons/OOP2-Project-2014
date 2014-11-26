
public class Harry {
	private String name;
	protected int health;
	private int ammo;
	
	//Constructor Methods
	public Harry(String name, int ammo, int health)
	{
		setName(name);
		setAmmo(ammo);
		setHealth(health);
	}
	
	public Harry(String name)
	{
		setName(name);
		setAmmo(5);
		setHealth(100);
	}
	
	public Harry() 
	  {
	   	this("\n\nHarry",5, 100);
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
	public void harryShootsPlayer(Player p){
		p.setHealth(p.health - 50);
		this.ammo = ammo - 1;
	}
	
	//toString method
	
	public String toString(){
		return name + "\nHealth: " + health + "\nammo: " + ammo;
	}

}
