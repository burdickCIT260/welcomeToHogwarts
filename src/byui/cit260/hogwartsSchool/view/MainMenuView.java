/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsSchool.view;

import byui.cit260.hogwartsSchool.model.Player;
import byui.cit260.hogwartsSchool.control.GameControl;
import java.util.Scanner;
import welcomeToHogwarts.WelcomeToHogwarts;

/**
 *
 * @author Coggputer
 */
public class MainMenuView {
    
    private final String MENU = "\n"
            + "\n------------------------------------"
            + "\n|  Main Menu                       |"
            + "\n------------------------------------"
            + "\nN - Start New Game"
            + "\nG - Load Saved Game"
            + "\nH - Get help"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n------------------------------------";
            
    public void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of the string
            
            this.doAction(selection); // do action based on selection
        } while (selection != 'E'); // a selection is not "Exit"
    } 

    private String getInput() {
        boolean valid = false; // indicates if the name has to be retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
    
        while(!valid) { // while a valid menu option has not been retrieved

	// prompt user to input menu option
	System.out.println("Please enter a menu option below:");

	// get users input and trim off blanks
	input = keyboard.nextLine();
	input = input.trim();

	// if name is invalid (more than one letter; not G, S, H or E) display error message
	if (input.length() > 1) {
		System.out.println("Please only enter one character");
		continue; //add repeat again
	}
	break; // out of the (exit) repition)     
        }
	return input;
        
    }

    public void doAction(char choice) {
        
        switch (choice) {
            case 'N': //start new game
                this.startNewGame();
                break;
            case 'G': //start game
                this.startExistingGame();
                break;
            case 'H': //get help
                this.displayHelpMenu();
                break;
            case 'S': //save game
                this.saveGame();
                break;
            case 'E': //exit
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void startNewGame() {
        GameControl.createNewGame(WelcomeToHogwarts.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    
    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    
    private void saveGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    
    private void displayHelpMenu() {
        GameControl.displayHelpMenu(WelcomeToHogwarts.getPlayer());
        
        HelpMenuView displayMenu = new HelpMenuView();
        displayMenu.displayMenu();
        
        
    }
}