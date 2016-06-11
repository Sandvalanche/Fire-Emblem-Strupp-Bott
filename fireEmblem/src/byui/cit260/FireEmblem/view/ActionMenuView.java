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
public class ActionMenuView {
    
     private String menu;
    
    public ActionMenuView() {
        this.menu = "\n"
                + "\n-------------------------------------"
                + "\n | Action Menu          |"
                + "\n------------------"
                + "\nA = ATTACK"
                + "\nT = TALK"
                + "\nI = ITEM"
                + "\nO = OPEN"
                + "\nQ - Quit and go back to Main Menu"
                + "\n----------------------------------------";    
    }
    
     public void displayActionMenuView() {
        
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
            case "A":  // Attack
                this.displayAttackMenu();
                break;
            case "T":  // talk
                this.displayTalkMenu();
                break;
            case "I": // Item
                this.displayItemMenu();
                break;
            case "O": // open
                this.displayOpenMenu();
                break;
            default:
                System.out.println("\n*** Invaid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayAttackMenu() {
        System.out.println("\n*** displayAttackMenu called");
    }

    private void displayTalkMenu() {
        System.out.println("\n*** displayTalkMenu called");
    }

    private void displayItemMenu() {
       System.out.println("\n*** displayItemMenu called");
    }

    private void displayOpenMenu() {
        System.out.println("\n*** displayOpenMenu called");
    }

   
    
    
}
