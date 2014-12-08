
public class Harry {

    private String name;
    protected int health;
    private int ammo;

    //Constructor Methods
	public Harry() 
	  {
	   	name = "\n\nDirty Harry";
	   	ammo = 6;
	   	health = 100;
	  }	  
	  
	//Constructor Methods
	public Harry(String name, int ammo, int health)
	{
		setName(name);
		setAmmo(ammo);
		setHealth(health);
	}

    //Mutators
    public void setName(String n) {
        this.name = n;
    }

    public void setAmmo(int a) {
        this.ammo = a;
    }

    public void setHealth(int h) {
        this.health = h;
    }

    //accessors
    public String getName() {
        return name;
    }

    public int getAmmo() {
        return ammo;
    }

    public int getHealth() {
        return health;
    }

    //game methods
    
    public void harryShootsPlayer(Player p) {
        p.setHealth(p.getHealth() - 50);
        ammo--;
    }

	//toString method
    public String toString() {
        return name + "\nHealth: " + health + "\nAmmo: " + ammo;
    }

}
