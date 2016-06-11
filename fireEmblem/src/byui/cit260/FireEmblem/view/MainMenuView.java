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
public class MainMenuView {
    
    private String menu;
    
    public MainMenuView() {
        this.menu ="\n"
                        + "\n==============="
                + "\nMAIN MENU"
                +"\n----------------------------"
                + "\nN = start NEW game"
                +"\nG = GET a saved game"
                +"\nH = HELP menu"
                + "\nS = SAVE game"
                +"\nQ = QUIT, we will be sad to see you go!"
                +"\nA = ACTION MENU (this will not be here normally, but it is here to call the action menu class)"
                +"\n";
    }
    
   void displayMainMenuView() {
       
       boolean done = false; // set flag to not done
       do {
           // prompt for and get players name
           String menuOption = this.getMenuOption();
           if  (menuOption.toUpperCase().equals("Q"))  // User wants to quit
               return; // exit the game
           
           done = this.doAction(menuOption);
           
       }while (!done);
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
        
        choice = choice.toUpperCase(); // convert to caps
        
        switch (choice) {
            case "N":  // new game
                this.startNewGame();
                break;
            case "G":  // get and start an existing game
                this.startExistingGame();
                break;
            case "H":  //help menu
                this.displayHelpMenu();
                break;
            case"S": //save game
                this.saveGame();
                break;
            case"A": //ACTION MENU (remove later)
                this.displayActionMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again yo!");
               break;
        }
        
        return false; 
    }

   private void startNewGame() {
       GameControl.createNewGame(FireEmblem.getPlayer());
       
       //display the game menu
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.displayMenu();
   }
   
   private void startExistingGame() {
       System.out.println(" *** startExistingGame called");
   }
   
   private void saveGame() {
        System.out.println(" *** saveGame called");
   }
   
   private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
                
        helpMenuView.displayHelpMenuView();
   }

    private void displayActionMenu() {
        ActionMenuView actionMenuView = new ActionMenuView();
        
        actionMenuView.displayActionMenuView();
    }

}
           

