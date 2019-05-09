      // Rock, Paper, or Scissors game
      //*@Perfect.exe
      //*Austin Tapia
      //*https://github.com/Perfectdotexe
      //*Website: https://ewhitehat.com/
      //*Cybersecurity student

// Important Java utilities necessary for program to function.
import java.util.Scanner; // Open scanner library
import java.util.Random; // Open random library
import javax.swing.*; // Imports entire javax.swing GUI library

//Define object
public class ProgramRPS // Class head
   {
      public static void main(String[] args) // Main method
         {
         
            Scanner keyboard = new Scanner(System.in); // Creates a Scanner object for keyboard input.
            
            Random rand = new Random(); // Generate random value for computers move.
            
            // === *** Graphical User Interface *** ===
            
            JFrame winrar = new JFrame(); // Winner GUI popup declaration
            winrar.setSize(800, 700); // Size of the window (Width by height)
            winrar.add(new JLabel(new ImageIcon("chicken.gif"))); // Adds image to window (Credit: https://giphy.com/stickers/chicken-dance-SRdLmS9EcaW1G)
            winrar.setTitle("Winner!"); // Title of window
            winrar.setLocationRelativeTo(null); // Center window
            winrar.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // By exiting the window, it closes the program.
            
            // === *** Strings/Variables needed for the program to function *** ===
            
            String humanStrat, robotStrat = "", question; // Declares Rock, Paper, Scissors string for the human to make their choice, Robot strategy declaration and initialization, and declares the question string. 
            final String ROCK = "ROCK";
            final String PAPER = "PAPER";
            final String SCISSORS = "SCISSORS";
            int counterBot = 0, counterHuman = 0; // Scoring System
            
            // === *** Beginning of game *** ===

            // Greets player
            System.out.println("____________________  _________");
            System.out.println("\\______   \\______   \\/   _____/");
            System.out.println(" |       _/|     ___/\\_____  \\");
            System.out.println(" |    |   \\|    |    /        \\");
            System.out.println(" |____|_  /|____|   /_______  /");
            System.out.println("        \\/                  \\/ ");
            System.out.println("    Programmed by: Perfect.exe\n");
            System.out.println("Would you like to play a game of RPS? Yes or No?");
            System.out.println("Instructions: Paper beats Rock, Scissors beats Paper, and Rock beats Scissors. If you want to quit input \"q\" at anytime.");
            question = keyboard.nextLine(); // User input of Yes or No
            
            if ("no".equalsIgnoreCase(question)) { // Ignores case of characters.
            System.out.println("Are you chicken McFly?");
            System.exit(0); // Quits the game.
            }
            else if ("q".equalsIgnoreCase(question))
            {
            System.out.println("You have quit the game!");
            System.exit(0); // Quits the game.
            }
            else 
            {
            System.out.flush(); // Clears messages.
            }
            
            do {
            // Asks player RPS (Loop)
            System.out.println("Rock, Paper, or Scissors?");
            humanStrat = keyboard.nextLine().toLowerCase(); // User input of RPS
            
            int rando = rand.nextInt(3); // Generates a random integer and case switch below utilizes it.
                  switch (rando) // Calls to rando
                  {
                  case 0: //If nextInt = 0 then it will set the robotStrat string to Rock.
                     robotStrat = ROCK;
                        break; // Loop termination.
                  case 1:
                     robotStrat = PAPER; //If nextInt = 1 then it will set the robotStrat string to Paper.
                        break; // Loop termination.
                  case 2:
                     robotStrat = SCISSORS; //If nextInt = 2 then it will set the robotStrat string to Scissors.
                        break; // Loop termination.
                  }
                  
                  // Simple line to generate moves.
      
                  switch(robotStrat) { // Calls to value from computerStrat variable.
                    case "ROCK": //If = 0 then print (Rock)
                        System.out.println("The Bot has chosen Rock!\nYou have chosen: " + humanStrat);
                        if (humanStrat.equals("paper")) // If Paper is true and Bot chooses Rock then display win.
                        {
                              counterHuman++; // Increment counter by one for Human.
                              System.out.println("The score for you is now: " + counterHuman); // Notify user of win.
                        }
                        else if (humanStrat.equals("rock"))
                        {
                              System.out.println("Tie!"); // Notify user of tie.
                        }
                        else if (humanStrat.equals("q"))
                        {
                           System.out.println("You have quit the game!");
                           System.exit(0); // Quits the game.
                        }
                        else {
                              counterBot++; // Increment counter by one for Bot.
                              System.out.println("The Bot wins this round.\nThe score is for the computer is now: " + counterBot);
                        }
                        break; // Loop termination.
      
                    case "PAPER": //If = 1 then print (Paper)
                        System.out.println("The Bot has chosen Paper!\nYou have chosen: " + humanStrat);
                        if (humanStrat.equals("scissors")) // If Scissors is true and Bot chooses Paper then display win.
                        {
                              counterHuman++; // Increment counter by one for Human.
                              System.out.println("The score for you is now: " + counterHuman); // Notify user of win.
                        }
                        else if (humanStrat.equals("paper"))
                        {
                              System.out.println("Tie!"); // Notify user of tie.
                        }
                        else if (humanStrat.equals("q")) // Quits the game.
                        {
                           System.out.println("You have quit the game!");
                           System.exit(0); // Quits the game.
                        }
                        else {
                              counterBot++; // Increment counter by one for Bot.
                              System.out.println("The Bot wins this round.\nThe score is for the computer is now: " + counterBot);
                        }
                        break; // Loop termination.
      
                    case "SCISSORS": //If = 2 then print (Scissors)
                        System.out.println("The Bot has chosen Scissors!\nYou have chosen: " + humanStrat);
                        if (humanStrat.equals("rock")) // If Rock is true and Bot chooses Paper then display win.
                        {
                              counterHuman++; // Increment counter by one for Human.
                              System.out.println("The score for you is now: " + counterHuman); // Notify user of win.
                        }
                        else if (humanStrat.equals("scissors"))
                        {
                              System.out.println("Tie!"); // Notify user of tie.
                        }
                        else if (humanStrat.equals("q"))
                        {
                           System.out.println("You have quit the game!");
                           System.exit(0); // Quits the game.
                        }
                        else {
                              counterBot++; // Increment counter by one for Bot.
                              System.out.println("The Bot wins this round.\nThe score is for the computer is now: " + counterBot);
                        }
                        break; // Loop termination.
                       }
                   }
        while (counterHuman <= 2 && counterHuman >= -2 && counterBot <= 2 && counterBot >= -2 ); // Leave loop if bot or human reach above 2 or one loses
        if (counterHuman > counterBot ){ // If Human integer is greater than Bot.
            System.out.println("Winner, winner, chicken dinner!"); // Notify user of win.
            System.out.println("     MM      ");
            System.out.println("    <' \\___/|");
            System.out.println("  u/  \\_  _/ ");
            System.out.println("        ][   ");
            winrar.show(); // Brings up window
        }
        else if (counterHuman < counterBot){ // If Bot integer is greater than Human.
            System.out.println("You have lost!"); // Notify user of loss.
            System.exit(0); // Quits the game.
                  }
               }
}
