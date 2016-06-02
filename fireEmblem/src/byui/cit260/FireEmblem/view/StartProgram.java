/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FireEmblem.view;

/**
 *
 * @author Carson
 */
public class StartProgram {
    private String promptMessage;
    
    public StartProgram() {
    
    this.promptMessage = "\nPlease enter your name: ";
    
    this.displayBanner();
}

    private void displayBanner() {
        System.out.println( 
                "\nOur game is pretty similar to Fire Emblem, where you have a team of people that you travel" 
                +  "\naround with on your adventure and use them to battle your enemies. We plan on using an attack system" 
                 + "\nthat uses axes, swords, and lances, where axes are strong against lances, lances strong against swords," 
                +  "\nand swords strong against axes. Each party member will have their own attack, defense, how far they can" 
                 + "\nmove, and attack range. Our map will have different terrains and obstacles, enemies to fight, and even"
                +  "\npossible chests containing an item. There will also be different types and classes of enemies to fight. "
                 + "\nThe games ends once you defeat the boss standing guard at the castle and seize control of that castle."  
                 + "\n\tOn a less technical note we want to have fun little dialogues that can be used to get people to join "
                +  "\nyour team and whatnot. This will be best explained though some spiffy end user stories. This will keep" 
                +  "\nsome good humor in the game, and add a little element of something else besides just fighting." 
                +  "\n\tThe main goals of our game are to recruit a team, fight enemies, and beat the boss. It is a pretty" 
                + "\n straightforward adventure style game."
                           );
    }

    public void displayStartProgram() {
        System.out.println("\n*** displayStartProgram() function called ***");
    }
}
