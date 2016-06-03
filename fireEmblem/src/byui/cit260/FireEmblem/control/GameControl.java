/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FireEmblem.control;

import byui.cit260.almostFireEmblem.model.Player;

/**
 *
 * @author Jacob
 */
public class GameControl {
    
    public static Player createPlayer(String playersName) {
        System.out.println("*** createPlayer() function called ***");
        return new Player();
        
    }
    
}
