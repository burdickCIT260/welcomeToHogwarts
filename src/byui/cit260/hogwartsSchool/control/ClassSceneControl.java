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
    
    public double calcAstronomy(double magnitude, double distance) {
        if (magnitude > 3001 || magnitude < 3001) {
            return -1;
        }
        if (distance > 10) {
            return -1;
        }
        
        double x = Math.pow(distance, 2);
        double apparentMagnitude = magnitude / x;
        
        return apparentMagnitude;
    }
    
    public double calcFlyingAccelleration (double distance, double time) {
        if (time > 60 || time < 0) {
            return -1;
        }
            
        if (distance < 0) {
            return -1;
        }
            
        double x = distance / time;
        double accelleration = x / time;
            
        return accelleration;
        }
}