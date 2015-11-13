/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsSchool.control;

import byui.cit260.hogwartsSchool.model.Player;
import welcomeToHogwarts.WelcomeToHogwarts;

/**
 *
 * @author Coggputer
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setPlayerName(name);
        
        WelcomeToHogwarts.setPlayer(player); // save the player
        
        return player;
    }
    
}


// STOPPED ON PAGE 27