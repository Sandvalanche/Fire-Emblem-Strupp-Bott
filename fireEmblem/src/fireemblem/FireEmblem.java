/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem;


import byui.cit260.FireEmblem.view.StartProgramView;
import byui.cit260.almostFireEmblem.model.Game;
import byui.cit260.almostFireEmblem.model.Player;
/*
import byui.cit260.almostFireEmblem.model.Dialogue;
import byui.cit260.almostFireEmblem.model.Game;
import byui.cit260.almostFireEmblem.model.Item;
import byui.cit260.almostFireEmblem.model.Location;
import byui.cit260.almostFireEmblem.model.Map;
import byui.cit260.almostFireEmblem.model.Person;
import byui.cit260.almostFireEmblem.model.Player;
import byui.cit260.almostFireEmblem.model.Weapon;
import byui.cit260.almostFireEmblem.model.Game;
import byui.cit260.almostFireEmblem.model.Map;
import byui.cit260.almostFireEmblem.model.Location;
*/


/**
 *
 * @author Carson
 */
public class FireEmblem {


    
    private static Game currentGame = null;
    private static Player player = null;

  
    public static void main(String[] args) {
     
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.displayStartProgramView();
       
    } 
        public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        FireEmblem.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        FireEmblem.player = player;
    }
}
