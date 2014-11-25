
public class GameLauncher {

    public static void main(String args[])
    	{	 	
			System.out.print("\n\nLoading the game");	
			try {
    	   	Thread.sleep(1000); //1000 milliseconds is one second.
		   	} catch(InterruptedException ex) {
   		   	Thread.currentThread().interrupt();
		   	}
			
			System.out.print(" .");	
			try {
    	   	Thread.sleep(850);
		   	} catch(InterruptedException ex) {
   		   	Thread.currentThread().interrupt();
		   	}
			
			System.out.print(" .");	
			try {
    	   	Thread.sleep(850);
		   	} catch(InterruptedException ex) {
   		   	Thread.currentThread().interrupt();
		   	}
			
			System.out.print(" .");	
			try {
    	   	Thread.sleep(1500);
		   	} catch(InterruptedException ex) {
   		   	Thread.currentThread().interrupt();
		   	}
			
			System.out.println("\n\nLoading Complete! The game will now start . . . ");	
			try {
    	   	Thread.sleep(2000);
		   	} catch(InterruptedException ex) {
   		   	Thread.currentThread().interrupt();
		   	}
			
			MainMenu MM = new MainMenu();	
						 
		}
 		
}