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
public class MoveMenuView extends View {
    
    
    private String menu;
    
    public MoveMenuView() {
        this.menu ="\n"
                        + "\n==============="
                + "\nMOVE MENU"
                +"\n----------------------------"
                + "\nW = start NEW game"
                +"\nA = GET a saved game"
                +"\nS = HELP menu"
                + "\nD = SAVE game"
                +"\nQ = Leave this menu"
                +"\n";
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

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert to caps
        
        switch (choice) {
            case "W":  // new game
                this.moveUp();
                break;
            case "A":  // get and start an existing game
                this.moveLeft();
                break;
            case "S":  //help menu
                this.moveDown();
                break;
            case "D": //save game
                this.moveRight();
                break;
            case "G":  // return to game menu
                this.returnToGameMenu();
            default:
                System.out.println("\n*** Invalid Selection *** Try again yo!");
               break;
        }
        
        return false; 
    }

    private void moveUp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveLeft() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveDown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveRight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void returnToGameMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
