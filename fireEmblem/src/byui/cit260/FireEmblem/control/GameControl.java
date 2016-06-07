/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FireEmblem.control;

import byui.cit260.almostFireEmblem.model.Player;
import fireemblem.FireEmblem;

/**
 *
 * @author Jacob
 */
public class GameControl {
    
    public static Player createPlayer(String name) {
        /* System.out.println("*** createPlayer() function called ***");
        return new Player(); */
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        FireEmblem.setPlayer(player);
        
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame stub function called ***");    
    }
    
}
