/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FireEmblem.control;

/**
 *
 * @author Carson
 */
public class itemControl {
    
    public double calcItemHeal(int hp, int maxHp, int itemHeal) {
        
        if  (hp < 1) { // is the character dead? you can heal a dead dude.
            return -1;
        }	
        
        if  (hp >= maxHp) { // does the character have more hp then they are allowed? Or do they already have full hp?
            return -1;
        }
								

        if (itemHeal < 0) { //will the item hurt the character?
            return -1;
        }									

    double heal = hp + itemHeal;
    if (heal >= maxHp) { //so you don't heal more than the max hp
        return maxHp;
    }
    return heal;

   
    }
    
}
