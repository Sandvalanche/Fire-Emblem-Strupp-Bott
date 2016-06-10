/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FireEmblem.view;
import byui.cit260.FireEmblem.control.GameControl;
import byui.cit260.almostFireEmblem.model.GameMenuView;
import fireemblem.FireEmblem;
import java.util.Scanner;
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
                + "\nQ - Quit and go back to Main Menu"
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
        Scanner keyboard = new Scanner(System.in);
        String value = ""; // value to be returned
        boolean valid = false;  // initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.menu);
            
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
        System.out.println("*** displayHowToMove() called***");
    }

    private void displayHowToAttack() {
        System.out.println("*** displayHowToAttack() called***");
    }

    private void displayHowToExplore() {
        System.out.println("*** displayHowToExplore() called***");
    }

    private void displayHowItemsWork() {
       System.out.println("*** displayHowItemsWork() called***");
    }

    private void displayHowToTalk() {
       System.out.println("*** displayHowToTalk() called***");
    }

    private void displayMenu() {
        System.out.println("*** displayMenu() called***");
    }
}