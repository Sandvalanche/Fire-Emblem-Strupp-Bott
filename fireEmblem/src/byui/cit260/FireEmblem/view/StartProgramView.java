/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FireEmblem.view;

import byui.cit260.FireEmblem.control.GameControl;
import byui.cit260.almostFireEmblem.model.Player;
import java.util.Scanner;

/**
 *
 * @author Carson
 */
public class StartProgramView extends View {

    public StartProgramView() {

        super("\nPlease enter your name: ");

        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println("\n*  Our game is pretty similar to Fire Emblem, where you have a team of people that you travel"
                + "\n* around with on your adventure and use them to battle your enemies. We plan on using an attack system"
                + "\n* that uses axes, swords, and lances, where axes are strong against lances, lances strong against swords,"
                + "\n* and swords strong against axes. Each party member will have their own attack, defense, how far they can"
                + "\n* move, and attack range. Our map will have different terrains and obstacles, enemies to fight, and even"
                + "\n* possible chests containing an item. There will also be different types and classes of enemies to fight."
                + "\n* The games ends once you defeat the boss standing guard at the castle and seize control of that castle."
                + "\n* On a less technical note we want to have fun little dialogues that can be used to get people to join "
                + "\n* your team and whatnot. This will be best explained though some spiffy end user stories. This will keep "
                + "\n* some good humor in the game, and add a little element of something else besides just fighting."
                + "\n* The main goals of our game are to recruit a team, fight enemies, and beat the boss. It is a pretty "
                + "\n* straightforward adventure style game.");
    }

    @Override
    public boolean doAction(String playersName) {

        if (playersName.length() < 2) {
            System.out.println("\nInvaid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }

        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);

        if (player == null) {  // if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
        // display next view
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println("\n============================================="
                + "\n Welcome to the game " + player.getName()
                + "\n We hope you have a lot of fun!"
                + "\n==========================================");

        //Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();

        mainMenuView.display();
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void displayStartProgramView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
