/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem;

import byui.cit260.almostFireEmblem.model.Person;
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
        Player playerOne = new Player();
        
        playerOne.setName(" Marth");
        playerOne.setBestTime(8.00);
        
        String playerInfo = playerOne.toString();;
        System.out.println(playerInfo);
        
        // Person class test
        Person personOne = new Person();
        
        personOne.setName(" Old Man McGuggit");
        personOne.setDescription("A hobo from Gravity Falls OR. Once accidently kissed a racoon.");
        personOne.setStrength(12);
        personOne.setDefense(13);
        personOne.setSpeed(4);
        personOne.setHp(29);
        personOne.setTurn(5);
        personOne.setLocation("A,6");
        personOne.setItems("Roll of ductape, 4 cheerios");
        personOne.setWeapon("Raw Tuna");
        
        String personInfo = personOne.toString();
        System.out.println(personInfo);
    }
    
}
