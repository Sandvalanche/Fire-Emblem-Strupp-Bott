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
                + "\nM - How to move"
                + "\nA - How to attack and other violence explained"
                + "\nE - Exploring spaces & getting enemy info"
                + "\nI - Items explained"
                + "\nQ - Quit "
                + "\n----------------------------------------";    }

    public void displayHelpMenuView() {
        
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
            case "M":  // create and start a new game
                this.displayHowToMove();
                break;
            case "A":  // get and start an existing game
                this.displayHowToAttack();
                break;
            case "E": // display the help menu
                this.displayHowToExplore();
                break;
            case "I":
                this.displayHowItemsWork();
                break;
            case "T":
                this.displayHowToTalk();
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

        HelpMenuView HelpMenu = new HelpMenuView();
        HelpMenu.displayMenu();
    }

    private void displayHowToMove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHowToAttack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHowToExplore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHowItemsWork() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHowToTalk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}