/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsSchool.view;

import byui.cit260.hogwartsSchool.control.GameControl;
import java.util.Scanner;
import welcomeToHogwarts.WelcomeToHogwarts;

/**
 *
 * @author Coggputer
 */
class GameMenuView {

    private final String MENU = "\n"
            + "\n------------------------------------"
            + "\n|  Game Menu                       |"
            + "\n------------------------------------"
            + "\nV - View map"
            + "\nP - View current points"
            + "\nM - Move to a new location"
            + "\nE - Explore the area"
            + "\nN - View NOtes"
            + "\nT - Take Notes"
            + "\nX - Take Exam"
            + "\nH - Help"
            + "\nQ - Quit"
            + "\n------------------------------------";
            
    public void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of the string
            
            this.doAction(selection); // do action based on selection
        } while (selection != 'Q'); // a selection is not "Exit"
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
            case 'V': //View Map
                System.out.println("\n*** MAP WILL BE DISPLAYED ***");
                break;
            case 'P': //View Current Points
                System.out.println("\n*** CURRENT POINT TOTAL WILL BE DISPLAYED ***");
                break;
            case 'M': //Move to a new location
                System.out.println("\n*** USER WILL MOVE TO NEW LOCATION ***");
                break;
            case 'E': //Explore the area
                System.out.println("\n*** USER WILL EXPLORE THE AREA ***");
                break;
            case 'N': //View NOtes
                System.out.println("\n*** USER WILL HAVE ACCESS TO NOTES ***");
                break;
            case 'T': //Take Notes
                System.out.println("\n*** USER WILL TAKE NOTES ***");
                break;
            case 'H': //Help menu
                GameControl.displayHelpMenu(WelcomeToHogwarts.getPlayer());
                HelpMenuView displayMenu = new HelpMenuView();
                displayMenu.displayMenu();
                break;
            case 'Q': //exit
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
      
    }