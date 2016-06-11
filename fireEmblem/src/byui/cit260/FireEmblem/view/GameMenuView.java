
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FireEmblem.view;

public class GameMenuView {
    
            private String menu;
            
            public GameMenuView() {
            this.menu = "\n"
                + "\n-------------------------------------"
                + "\n | Game Menu          |"
                + "\n------------------"
                + "\nA - Action (attack, talk, use item, open stuff)"
                + "\nT - Team members (including you)"
                + "\nE - Exploring and explain a space or enemy"
                + "\nM - Move selected character"
                + "\nS - Save game"
                + "\nH - Help menu "
                + "\nQ - Quit game and return to main menu"
                + "\n----------------------------------------";    
            }
    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private boolean doAction(String choice) {
    
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "A":  // create and start a new game
                this.performAction();
                break;
            case "T":  // get and start an existing game
                this.viewTeamMembers();
                break;
            case "E": // display the help menu
                this.exploreOption();
                break;
            case "M":
                this.moveCharacter();
                break;
            case "S":
                this.saveGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "Q":
                this.quitGame();
                break;
            default:
                System.out.println("\n*** Invaid selection *** Try again");
                break;
        }
        return false;
    }

    private void performAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewTeamMembers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void exploreOption() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveCharacter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void quitGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void displayGameMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }
