/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FireEmblem.view;

import java.util.Scanner;

/**
 *
 * @author Carson
 */
public class StartProgramView {
    private String promptMessage;
    
    public StartProgramView() {
    
    this.promptMessage = "\nPlease enter your name: ";
    
    this.displayBanner();
}

    private void displayBanner() {
        System.out.println("\n*  Our game is pretty similar to Fire Emblem, where you have a team of people that you travel" +
                           "\n* around with on your adventure and use them to battle your enemies. We plan on using an attack system" + 
                           "\n* that uses axes, swords, and lances, where axes are strong against lances, lances strong against swords," + 
                           "\n* and swords strong against axes. Each party member will have their own attack, defense, how far they can" +
                           "\n* move, and attack range. Our map will have different terrains and obstacles, enemies to fight, and even" +
                           "\n* possible chests containing an item. There will also be different types and classes of enemies to fight." +
                           "\n* The games ends once you defeat the boss standing guard at the castle and seize control of that castle." +
                           "\n* On a less technical note we want to have fun little dialogues that can be used to get people to join " +
                           "\n* your team and whatnot. This will be best explained though some spiffy end user stories. This will keep " +
                           "\n* some good humor in the game, and add a little element of something else besides just fighting." +
                           "\n* The main goals of our game are to recruit a team, fight enemies, and beat the boss. It is a pretty " + 
                           "\n* straightforward adventure style game.");
    }

    public void displayStartProgramView() {

        boolean done = false;   //set flag to not done
        
        do {
            // Prompt for and get the input, in this case the player's name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) 
                return;
            
 // do requested action and display the next view
            done = this.doAction(playersName);
        } while (!done);
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in);
        String value = ""; // value to be returned
        boolean valid = false;  // initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();  // get next line typed on keyboard
            value = value.trim();  // trim off leading and trailing blanks
            
            if (value.length() < 1) {  // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break;  // end the loop
        }
        return value;  // return the value entered
       
}

    private boolean doAction(String playersName) {
        System.out.println("\n*** doAction() called ***");
        return true;
    }
}
