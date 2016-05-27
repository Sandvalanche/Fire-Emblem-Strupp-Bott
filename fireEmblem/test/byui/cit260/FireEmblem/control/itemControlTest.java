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
 * @author Carson
 */
public class itemControlTest {
    
    public itemControlTest() {
    }

    /**
     * Test of calcItemHeal method, of class itemControl.
     */
    @Test
    public void testCalcItemHeal() {
        System.out.println("calcItemHeal");
        
        /******************
        * Test case 1
        ******************/
        System.out.println("\tTest Case #1");
        
        //Input Variables
        int hp = 15;
        int maxHp = 30;
        int itemHeal = 10;
        
        double expResult = 25; // hopefully this will be the result
        
        // create an instance
         itemControl instance = new itemControl();
        
        // call the function to run test
        double result = instance.calcItemHeal(hp, maxHp, itemHeal);
        
        // compare the result with the expected result
        assertEquals(expResult, result, 0.0);
        
         
        /******************
        * Test case 2
        ******************/
        System.out.println("\tTest Case #2");
        
        //Input Variables
        hp = -1;
        itemHeal = -1;
        
        expResult = -1; // hopefully this will be the result

        // call the function to run test
        result = instance.calcItemHeal(hp, maxHp, itemHeal);
        
        // compare the result with the expected result
        assertEquals(expResult, result, 0.0);
        
        /******************
        * Test case 3
        ******************/
        System.out.println("\tTest Case #3");
        
        //Input Variables
        hp = 30;
        itemHeal = 10;
        
        expResult = -1; // hopefully this will be the result

        // call the function to run test
        result = instance.calcItemHeal(hp, maxHp, itemHeal);
        
        // compare the result with the expected result
        assertEquals(expResult, result, 0.0);
        
        /******************
        * Test case 4
        ******************/
        System.out.println("\tTest Case #4");
        
        //Input Variables
        hp = 31;
        itemHeal = 10;
        
        expResult = -1; // hopefully this will be the result

        // call the function to run test
        result = instance.calcItemHeal(hp, maxHp, itemHeal);
        
        // compare the result with the expected result
        assertEquals(expResult, result, 0.0);
        
        /******************
        * Test case 5
        ******************/
        System.out.println("\tTest Case #5");
        
        //Input Variables
        hp = 29;
        itemHeal = 10;
        
        expResult = 30; // hopefully this will be the result

        // call the function to run test
        result = instance.calcItemHeal(hp, maxHp, itemHeal);
        
        // compare the result with the expected result
        assertEquals(expResult, result, 0.0);
        
        /******************
        * Test case 6
        ******************/
        System.out.println("\tTest Case #2");
        
        //Input Variables
        hp = 1;
        itemHeal = 0;
        
        expResult = 1; // hopefully this will be the result

        // call the function to run test
        result = instance.calcItemHeal(hp, maxHp, itemHeal);
        
        // compare the result with the expected result
        assertEquals(expResult, result, 0.0);
    }
    
}
