

public class GameLauncher {
    
    public static void main(String args[]) {
			System.out.print("\n\nLoading the game");	
			try {
    	   	Thread.sleep(650); //1000 milliseconds is one second.
		   	} catch(InterruptedException ex) {
   		   	Thread.currentThread().interrupt();
		   	}
			
			System.out.print(" .");	
			try {
    	   	Thread.sleep(650);
		   	} catch(InterruptedException ex) {
   		   	Thread.currentThread().interrupt();
		   	}
			
			System.out.print(" .");	
			try {
    	   	Thread.sleep(650);
		   	} catch(InterruptedException ex) {
	   		Thread.currentThread().interrupt();
		   	}
			
			System.out.print(" .");	
			try {
    	   	Thread.sleep(650);
		   	} catch(InterruptedException ex) {
   		   	Thread.currentThread().interrupt();
		   	}
			
			System.out.print(" 100%!");	
			try {
    	   	Thread.sleep(1000);
		   	} catch(InterruptedException ex) {
   		   	Thread.currentThread().interrupt();
		   	}
			
			System.out.println("\n\nLoading Complete! The game will now start . . . ");	
			try {
   	   		Thread.sleep(1000);
		   	} catch(InterruptedException ex) {
   		   	Thread.currentThread().interrupt();
		   	}
        
        MainMenu mm = new MainMenu();        
        mm.setVisible(true);
        
    }
    
}
