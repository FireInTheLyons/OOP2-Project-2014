/**
 * @(#)random.java
 *
 *
 * @author 
 * @version 1.00 2014/11/20
 */


public class random {

    public static void main(String args[]) {
    	
    	int abc = (int)(Math.random()*50);		
		int xyz = (int)(Math.random()*6);
		//maybe 7 instead of 6.
    	
    	/*int health = 100 - abc;*/
    	System.out.println("\nYour Health: " + abc /*+ health*/);
    	
    	/*int ammoCount = 6 - xyz;*/
    	System.out.println("\nYour ammo count: " + xyz /*+ ammoCount*/);
    }
    
    
}