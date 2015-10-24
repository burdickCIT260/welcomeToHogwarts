/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsSchool.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Coggputer
 */
public class ClassSceneControlTest {
    
    public ClassSceneControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcPotionsDiameter method, of class ClassSceneControl.
     */
    @Test
    public void testCalcPotionsDiameter() {
        System.out.println("calcPotionsDiameter");
        
        /************************************************************************************
         * Test case #1
         ************************************************************************************/
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        double diameter = 22;
        double depth = 10;
        
        double expResult = 16.5; //expected output returned value
        
    
        // create instance of calcPotionsDiameter
        ClassSceneControl instance = new ClassSceneControl();
        
        // call function to run test
        double result = instance.calcPotionsDiameter(diameter, depth);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
       
        /************************************************************************************
         * Test case #2
         ************************************************************************************/
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        diameter = -1;
        depth = 19;
        
        expResult = -1; //expected output returned value
        
        // call function to run test
        result = instance.calcPotionsDiameter(diameter, depth);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /************************************************************************************
         * Test case #3
         ************************************************************************************/
        System.out.println("\tTest case #3");
        
        // input values for test case 3
        diameter = 27;
        depth = -1;
        
        expResult = -1; //expected output returned value
        
        // call function to run test
        result = instance.calcPotionsDiameter(diameter, depth);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /************************************************************************************
         * Test case #4
         ************************************************************************************/
        System.out.println("\tTest case #4");
        
        // input values for test case 4
        diameter = 31;
        depth = 12;
        
        expResult = -1; //expected output returned value
        
        // call function to run test
        result = instance.calcPotionsDiameter(diameter, depth);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /************************************************************************************
         * Test case #5
         ************************************************************************************/
        System.out.println("\tTest case #5");
        
        // input values for test case 5
        diameter = 0;
        depth = 5;
        
        expResult = 0; //expected output returned value
        
        // call function to run test
        result = instance.calcPotionsDiameter(diameter, depth);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /************************************************************************************
         * Test case #6
         ************************************************************************************/
        System.out.println("\tTest case #6");
        
        // input values for test case 6
        diameter = 30;
        depth = 0;
        
        expResult = 0; //expected output returned value
        
        // call function to run test
        result = instance.calcPotionsDiameter(diameter, depth);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /************************************************************************************
         * Test case #7
         ************************************************************************************/
        System.out.println("\tTest case #7");
        
        // input values for test case 7
        diameter = 30;
        depth = 10;
        
        expResult = 30.6; //expected output returned value
        
        // call function to run test
        result = instance.calcPotionsDiameter(diameter, depth);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        
    }
    
    /**
     * Test of calcAstronomy method, of class ClassSceneControl.
     */
    @Test
    public void testCalcAstronomy() {
        System.out.println("calcAstronomy");
        
        /************************************************************************************
         * Test case #1
         ************************************************************************************/
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        double magnitude = 3001;
        double distance = 8;
        
        double expResult = 46.9; //expected output returned value
        
    
        // create instance of calcPotionsDiameter
        ClassSceneControl instance = new ClassSceneControl();
        
        // call function to run test
        double result = instance.calcAstronomy(magnitude, distance);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
       
        /************************************************************************************
         * Test case #2
         ************************************************************************************/
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        magnitude = 6584;
        distance = 9;
        
        expResult = -1; //expected output returned value
        
        // call function to run test
        result = instance.calcAstronomy(magnitude, distance);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /************************************************************************************
         * Test case #3
         ************************************************************************************/
        System.out.println("\tTest case #3");
        
        // input values for test case 3
        magnitude = 3001;
        distance = 523;
        
        expResult = -1; //expected output returned value
        
        // call function to run test
        result = instance.calcAstronomy(magnitude, distance);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /************************************************************************************
         * Test case #4
         ************************************************************************************/
        System.out.println("\tTest case #4");
        
        // input values for test case 4
        magnitude = 1865;
        distance = 8;
        
        expResult = -1; //expected output returned value
        
        // call function to run test
        result = instance.calcAstronomy(magnitude, distance);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /************************************************************************************
         * Test case #5
         ************************************************************************************/
        System.out.println("\tTest case #5");
        
        // input values for test case 5
        magnitude = 0;
        distance = 8;
        
        expResult = -1; //expected output returned value
        
        // call function to run test
        result = instance.calcAstronomy(magnitude, distance);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /************************************************************************************
         * Test case #6
         ************************************************************************************/
        System.out.println("\tTest case #6");
        
        // input values for test case 6
        magnitude = 3001;
        distance = 1;
        
        expResult = 3001; //expected output returned value
        
        // call function to run test
        result = instance.calcAstronomy(magnitude, distance);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        /************************************************************************************
         * Test case #7
         ************************************************************************************/
        System.out.println("\tTest case #7");
        
        // input values for test case 7
        magnitude = 3001;
        distance = 10;
        
        expResult = 30; //expected output returned value
        
        // call function to run test
        result = instance.calcAstronomy(magnitude, distance);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.1);
        
        
    }
    
}
