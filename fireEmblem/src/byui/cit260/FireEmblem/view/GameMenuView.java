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
    }
