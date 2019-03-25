      // Rock, paper scissors game
      //*@Perfect.exe
      //*https://github.com/Perfectdotexe
      //*Cybersecurity student

// Important Java utilities necessary for program to function.
import java.util.Scanner; // Open scanner library
import java.util.Random; // Open random library

//Define object
public class ProgramRPS // Class head
   {
      public static void main(String[] args) // Main method
         {
         
            Scanner keyboard = new Scanner(System.in); // Creates a Scanner object for keyboard input.

            // === *** Strings/Variables needed for the program to function *** ===
            String humanStrat; // Consists of Rock, Paper, Scissors for human to choose from.
            String question; // Question to ask to play game.
            final int ROCK = 1, PAPER = 2, SCISSORS = 3; // Rock is 1, Paper is 2, and Scissors is 3.
            int counterBot = 0; // Scoring System for Bot
            int counterHuman = 0; // Scoring system for Human
            int intro = 0; // Skips intro if seen
            Random generate = new Random(); // Generate random value for computers move.

            // === *** Beginning of game *** ===

            // Greets player
            System.out.println("Would you like to play a game of RPS? Yes or No?");
            question = keyboard.nextLine(); // User input of Yes or No
            
            if ("No".equals(question) || "no".equals(question)) {
            System.out.println("Are you chicken McFly?"); // Response to No "Are you chicken McFly?"
            System.exit(0); // Afterwards, exit javascript.
            } else {
            System.out.flush(); // Push stream of data, guarantees that it gets out to the file.
            }
            
            do{
                  // Asks player RPS (Loop)
                  System.out.println("Rock, Paper, or Scissors?");
                  humanStrat = keyboard.nextLine(); // User input of RPS

                  // Simple line to generate moves.
                  int computerStrat = generate.nextInt((3 - 1) + 1) + 1; // Randomly generates value for computer choice of RPS. 3 is max 1 is minimum.
      
                  switch(computerStrat) { // Calls to value from computerStrat variable.
                    case 1: //If = 1 then print (Rock)
                        System.out.println("The Bot has chosen Rock!\nYou have chosen: " + humanStrat);
                        if (humanStrat.equals("Paper")) // If Paper is true and Bot chooses Rock then display win.
                        {
                              counterHuman++; // Increment counter by one.
                              System.out.println("Winner, winner, chicken dinner!\nThe score for you is now: " + counterHuman); // Notify user of win.
                        }
                        else if (humanStrat.equals("Rock"))
                        {
                              System.out.println("Colligationem!"); // Notify user of tie.
                        }
                        else {
                              counterBot++; // Increment counter by one.
                              System.out.println("The Bot wins this round.\nThe score is for the computer is now: " + counterBot);
                        }
                        break;
      
                    case 2: //If = 2 then print (Paper)
                        System.out.println("The Bot has chosen Paper!\nYou have chosen: " + humanStrat);
                        if (humanStrat.equals("Scissors")) // If Scissors is true and Bot chooses Paper then display win.
                        {
                              counterHuman++; // Increment counter by one.
                              System.out.println("Winner, winner, chicken dinner!\nThe score for you is now: " + counterHuman); // Notify user of win.
                        }
                        else if (humanStrat.equals("Paper"))
                        {
                              System.out.println("Colligationem!"); // Notify user of tie.
                        }
                        else {
                              counterBot++; // Increment counter by one.
                              System.out.println("The Bot wins this round.\nThe score is for the computer is now: " + counterBot);
                        }
                        break;
      
                    case 3: //If = 3 then print (Scissors)
                        System.out.println("The Bot has chosen Scissors!\nYou have chosen: " + humanStrat);
                        if (humanStrat.equals("Rock")) // If Rock is true and Bot chooses Paper then display win.
                        {
                              counterHuman++; // Increment counter by one.
                              System.out.println("Winner, winner, chicken dinner!\nThe score for you is now: " + counterHuman); // Notify user of win.
                        }
                        else if (humanStrat.equals("Scissors"))
                        {
                              System.out.println("Colligationem!"); // Notify user of tie.
                        }
                        else {
                              counterBot++; // Increment counter by one.
                              System.out.println("The Bot wins this round.\nThe score is for the computer is now: " + counterBot);
                        }
                        break;
                       }
                   }
            while (counterHuman <= 2 && counterHuman >= -2);
            {
            System.out.println("You have won!"); // Notify user of win.
                 }
               }
            }
