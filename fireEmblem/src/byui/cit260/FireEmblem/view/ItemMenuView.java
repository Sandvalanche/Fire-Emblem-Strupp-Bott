/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FireEmblem.view;

import java.util.Scanner;

/**
 *
 * @author Jacob
 */
public abstract class ItemMenuView implements ViewInterface {

    protected String displayMessage;
    private String menu;

    public ItemMenuView() {

       
        this.menu = "\n"
                        + "\n==============="
                + "\nITEM MENU"
                +"\nQ = Leave this menu";
    }

    public ItemMenuView(String message) {
        this.displayMessage = message;
    }

    @Override
       public void display() {
       
       boolean done = false; // set flag to not done
       do {
           // prompt for and get players name
           String value = this.getInput();
           if  (value.toUpperCase().equals("Q"))  // User wants to quit
               return; // exit the game
           
           done = this.doAction(value);
           
       }while (!done);
   }
       
       @Override
       public String getInput() {
           
        Scanner keyboard = new Scanner(System.in);
        String value = ""; // value to be returned
        boolean valid = false;  // initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.displayMessage);
            
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
    @Override
       public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert to caps
        
        switch (choice) {
            case "W":  // new game
                this.itemScreen();
                break;
            case "G":  //help menu
                this.returnToGameMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again yo!");
               break;
        }
        
        return false; 
    }
       
     // The goal is to display a menu or a new view of menu items to be used
     private void itemScreen() { 
        System.out.println("The ItemsScreen function was called"); //To change body of generated methods, choose Tools | Templates.
        
    }

    private void returnToGameMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}