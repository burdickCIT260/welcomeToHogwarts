/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsSchool.control;

/**
 *
 * @author Coggputer
 */
public class ClassSceneControl {
    
    public double calcPotionsDiameter(double diameter, double depth) {
            if (diameter > 30 || diameter < 0) {
                return -1;
            }
            
            if (depth < 0) {
                return -1;
            }
            
            double x = diameter / 2;
            double y = x * x * 3.14 * depth;
            double gallons = y / 231;
            
            return gallons;
            }
    
}
