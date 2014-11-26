//Exercise1.java
/*This program uses a pseudocode solution developed in parts (a), (b) and (c) to write
 * a menu-driven program involving methods*/

import java.util.Scanner;

public class DifficultyScreen {
	public static void main(String args[])
		{
			
			int choice;
			Scanner input = new Scanner(System.in);

		    do {
				 displayMenu();
				 System.out.print("\n\n\nEnter your choice: ");
				 choice = input.nextInt();
			
				 switch (choice)
				 {
				     case 1:
							easyDifficulty();
							break;
				     case 2:
							mediumDifficulty();
							break;
				     case 3:
							hardDifficulty();
							break;
				     case 4:
							break;
				     default:
							System.out.print("Invalid choice -- please choose again\n");
				 }
		    } while (choice != 4);
		    System.out.println("\n\nReturning to the Main Menu . . . \n\n");
		}

	public static void displayMenu()
		{
			System.out.print("\n\n\n\tSelect a difficulty . . . \n");
			System.out.print("\n\t1. EASY");
			System.out.print("\n\t2. MEDIUM");
			System.out.print("\n\t3. HARD");
			System.out.print("\n\t4. Back to Main Menu \n\n\n");	
		}

	public static void easyDifficulty()
		{
			System.out.println("\n\nYou've selected Easy difficulty . . . \n");
			
			int abc = (int)(Math.random()*20);		
			int xyz = (int)(Math.random()*2);
    	
    		int health = 100 - abc;
    		System.out.println("\nYours Stats . . . \n\nHealth: " + health);
    	
    		int ammoCount = 6 - xyz;
    		System.out.println("\nAmmo count: " + ammoCount);
			
			try {
    	    Thread.sleep(4000);
		    } catch(InterruptedException ex) {
   		    Thread.currentThread().interrupt();
		    }			 
			
			System.out.println("\nNow returning to the Main Menu . . . \n");
			
			try {
    	    Thread.sleep(1500);
		    } catch(InterruptedException ex) {
   		    Thread.currentThread().interrupt();
		    }
			
			//clear console
			
			System.exit(0);
		}

	public static void mediumDifficulty()
		{
			
			System.out.println("\n\nYou've selected Medium difficulty . . . \n");
			
			try {
    	    Thread.sleep(1000);
		    } catch(InterruptedException ex) {
   		    Thread.currentThread().interrupt();
		    }
			
			int abc = (int)(Math.random()*20);		
			int xyz = (int)(Math.random()*3);
    	
    		int health = 80 - abc;
    		System.out.println("\nYours Stats . . . \n\nHealth: " + health);
    	
    		int ammoCount = 5 - xyz;
    		System.out.println("\nAmmo count: " + ammoCount);
			
			try {
    	    Thread.sleep(4000);
		    } catch(InterruptedException ex) {
   		    Thread.currentThread().interrupt();
		    }			 
			
			System.out.println("\nNow returning to the Main Menu . . . \n");
			
			try {
    	    Thread.sleep(1500);
		    } catch(InterruptedException ex) {
   		    Thread.currentThread().interrupt();
		    }
			
			//clear console
			
			System.exit(0);
		}

	public static void hardDifficulty()
		{
			System.out.println("\n\nYou've selected Hard Difficulty . . . \n");
			
			int abc = (int)(Math.random()*15);		
			int xyz = (int)(Math.random()*3);
    	
    		int health = 65 - abc;
    		System.out.println("\nYours Stats . . . \n\nHealth: " + health);
    	
    		int ammoCount = 4 - xyz;
    		System.out.println("\nAmmo count: " + ammoCount);
			
			try {
    	    Thread.sleep(4000);
		    } catch(InterruptedException ex) {
   		    Thread.currentThread().interrupt();
		    }			 
			
			System.out.println("\nNow returning to the Main Menu . . . \n");
			
			try {
    	    Thread.sleep(1500);
		    } catch(InterruptedException ex) {
   		    Thread.currentThread().interrupt();
		    }
			
			//clear console
			
			System.exit(0);
		}
}			
			
			
			
			
			
			
			
			
			
			
			
		