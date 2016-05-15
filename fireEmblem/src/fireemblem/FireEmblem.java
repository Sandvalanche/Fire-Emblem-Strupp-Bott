/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem;

import byui.cit260.almostFireEmblem.model.Game;
import byui.cit260.almostFireEmblem.model.Location;
import byui.cit260.almostFireEmblem.model.Map;
import byui.cit260.almostFireEmblem.model.Player;

/**
 *
 * @author Carson
 */
public class FireEmblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Map mapOne = new Map();
        mapOne.setRow (2);
        mapOne.setColumn (3);
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        Game gameOne = new Game();
        gameOne.setTurn(5);
        gameOne.setTime(2.5);
        gameOne.setNoPeople(4);
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        Location currentLocation = new Location();
        currentLocation.setRowLocation(4);
        currentLocation.setColLocation(3);
        currentLocation.setPerson( "Kratos");
        String locationInfo = currentLocation.toString();
        System.out.println(locationInfo);
        
        Player playerOne = new Player();
        playerOne.setName(" Marth");
        playerOne.setBestTime(8.00);    
        String playerInfo = playerOne.toString();;
        System.out.println(playerInfo);
    }
    
}
