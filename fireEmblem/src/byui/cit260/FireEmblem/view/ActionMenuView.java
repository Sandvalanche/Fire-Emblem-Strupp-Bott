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
public class ActionMenuView extends View {
    

    
    public ActionMenuView() {
        super("\n"
                + "\n-------------------------------------"
                + "\n | Action Menu          |"
                + "\n------------------"
                + "\nA = ATTACK"
                + "\nT = TALK"
                + "\nI = ITEM"
                + "\nO = OPEN"
                + "\nQ - Quit and go back to Main Menu"
                + "\n----------------------------------------");    
    }
    

    @Override
    public boolean doAction(String choice) {
    
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
