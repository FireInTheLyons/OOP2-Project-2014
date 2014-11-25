
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

/** Frame class which handles its own button events */
public class MainMenu extends JFrame implements ActionListener {
  
	JButton startButton, difficultyButton, quitButton;

	public static void main(String args[]){
		MainMenu win = new MainMenu();
		win.setVisible(true);
	}
	
	public MainMenu(){
		   
			setTitle("Dirty Harry Simulator");
			setSize(300,200);
			setLocation(250,200);
			Container cPane = getContentPane();
			cPane.setBackground(Color.red);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			cPane.setLayout(new FlowLayout());
			startButton = new JButton("Start");
			difficultyButton = new JButton("Difficulty");
			quitButton = new JButton("Quit");
			cPane.add(startButton);
			cPane.add(difficultyButton);
			cPane.add(quitButton);
			
			startButton.addActionListener(this);
			difficultyButton.addActionListener(this);
			quitButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startButton){

		   System.out.println("\nLoading the game . . . ");
		   
		   
		}
		
		if (e.getSource() == quitButton) {
			
		   System.out.println("\nExiting the game . . . ");
		   
		   //DELAY TIMER	   
		   try {
    	   Thread.sleep(1500); //1000 milliseconds is one second.
		   } catch(InterruptedException ex) {
   		   Thread.currentThread().interrupt();
		   }
		   
		   System.exit(0);}
		   
		   
		   
		//THIS NEEDS FIXING...
		//maybe have the difficulty button open up DifficultyScreen.java   
		   
		/*if (e.getSource() == difficultyButton) {
			
			
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
		    System.out.println("\n\nThanks for using the system - goodbye!\n\n");
		}

	public static void displayMenu()
		{
			System.out.print("\n\n\n\tSelect a difficulty . . . ");
			System.out.print("\n\t1. Easy");
			System.out.print("\n\t2. Medium");
			System.out.print("\n\t3. Hard");	
		}
	
	public static void easyDifficulty()
		{
			System.exit(0);
		}

	public static void mediumDifficulty()
		{
			System.exit(0);
		}

	public static void hardDifficulty()
		{
			System.exit(0);
		}*/
			
		}
	}

  								
