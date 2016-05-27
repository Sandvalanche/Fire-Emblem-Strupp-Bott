/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.FireEmblem.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jacob
 */
public class controlTest {
    
    public controlTest() {
    }

    /**
     * Test of calcDamageStep method, of class control.
     */
    @Test
    public void testCalcDamageStep() {
        System.out.println("calcDamageStep");
        int attackStrength = 2;
        int attackWeapon = 2;
        double range = 1.0;
        double damageTotal = 6.0;
        control instance = new control();
        double expResult = 6.0;
        double result = instance.calcDamageStep(attackStrength, attackWeapon, range, damageTotal);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
