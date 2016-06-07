/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FireEmblem.view;
import byui.cit260.FireEmblem.control.GameControl;
import byui.cit260.almostFireEmblem.model.GameMenuView;
import fireemblem.FireEmblem;
/**
 *
 * @author Jacob
 */
public class HelpMenuView {
    
    private String menu;
    
    public HelpMenuView() {
        this.menu = "\n"
                + "\n-------------------------------------"
                + "\n | Help Menu          |"
                + "\n------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get hep on how to play the game"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n----------------------------------------";    }

    public void displayMainMenuView() {
        
        boolean done = false;
        do {
            // prompt for and get players name
        String menuOption = this.getMenuOption();
        if (menuOption.toUpperCase().equals("Q")) // user wants to quit
        return; // exit the game

// do the requested action and display the next view
    done = this.doAction(menuOption);
    }   while (!done);
}

    private String getMenuOption() {
        System.out.println("\n*** getMenuOption() function called ***");
        return "N";
    }

    private boolean doAction(String choice) {
    
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":  // create and start a new game
                this.startNewGame();
                break;
            case "G":  // get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invaid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(FireEmblem.getPlayer());
        // System.out.println("*** startNewGame function called ***");    }

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    
    private void startExistingGame() {
        System.out.println("*** startExistingFunction function called ***");   
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");    }

    private void saveGame() {
        System.out.println("*** startExistingGame function called ***");
    }
}