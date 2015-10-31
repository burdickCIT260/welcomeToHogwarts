/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsSchool.view;

import byui.cit260.hogwartsSchool.control.ProgramControl;
import byui.cit260.hogwartsSchool.model.Player;
import java.util.Scanner;

/**
 *
 * @author Coggputer
 */
public class StartProgramView {
    
    public StartProgramView() {
    }
    
    public void startProgram() {

        // Display the banner screen
        this.displayBanner();

        // prompt the player to enter their name Retrieve the name of the player
        String playersName = this.getPlayersName();
        
        // Create and save the player object
        Player player = ProgramControl.createPlayer(playersName);
        
        // DISPLAY a customized welcome message
        this.displayWelcomeMessage(player);
        
        // DISPLAY the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
        
    }
    private void displayBanner() {
        System.out.println("\n\n****************************************************************");
        System.out.println("*                                                              *"
                + "\n*      In this game, you will attend Hogwarts School of        *"
                + "\n*                     Witchcraft & Wizardry!                   *");
        System.out.println("*                                                              *"
                + "\n*   You will be traveling through Hogwarts to be sorted into   *"
                + "\n*   your house, attend your classes, take notes, and finally   *"
                + "\n*         take a final exam to complete your education!        *");
        System.out.println("*                                                              *"
                + "\n*  Best of luck on your adventure through the Wizarding World! *"
                + "\n*                                                              *");
        System.out.println("****************************************************************");
    }

    private String getPlayersName() {
        boolean valid = false; // indicates if the name has to be retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            // prompt for the player's name
            System.out.println("Enter your name below:");
            
            // get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            // if the name is invalid (less than two characters in length)
            if (playersName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue; //add repeat again
            }
            break; // out of the (exit) repition
        }
        
        return playersName; // return the name
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n****************************************************************");
        System.out.println("\tWelcome to Hogwarts " + player.getName());
        System.out.println("\tEnjoy the game!");
        System.out.println("****************************************************************");
    }
}
