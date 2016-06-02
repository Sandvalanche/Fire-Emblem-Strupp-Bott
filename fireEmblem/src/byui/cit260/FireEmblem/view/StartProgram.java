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
        System.out.println(/*  Our game is pretty similar to Fire Emblem, where you have a team of people that you travel 
                            around with on your adventure and use them to battle your enemies. We plan on using an attack system 
                            that uses axes, swords, and lances, where axes are strong against lances, lances strong against swords, 
                            and swords strong against axes. Each party member will have their own attack, defense, how far they can 
                            move, and attack range. Our map will have different terrains and obstacles, enemies to fight, and even 
                            possible chests containing an item. There will also be different types and classes of enemies to fight. 
                            The games ends once you defeat the boss standing guard at the castle and seize control of that castle.  
                            On a less technical note we want to have fun little dialogues that can be used to get people to join 
                            your team and whatnot. This will be best explained though some spiffy end user stories. This will keep 
                            some good humor in the game, and add a little element of something else besides just fighting. 
                            The main goals of our game are to recruit a team, fight enemies, and beat the boss. It is a pretty 
                            straightforward adventure style game. */);
    }
}
