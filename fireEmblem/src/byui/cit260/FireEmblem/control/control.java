/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FireEmblem.control;

/**
 *
 * @author Jacob
 */
public class control {

public double calcDamageStep (int attackStrength, int attackWeapon, double range, double damageTotal) {
	if (attackStrength < 0   ||  attackWeapon < 0) {  
		return -1;
        } 
        
	if (range == 2) {
		int damageDealt = attackStrength + attackWeapon; 		
	}
        // Else the range is 1
	else {
                    double damageDealt = (attackStrength + attackWeapon) * 1.5 ; 
                    
                    return damageDealt;
        }
           return damageTotal;
    }         
}
