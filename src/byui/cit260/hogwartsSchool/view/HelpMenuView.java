/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsSchool.view;

import byui.cit260.hogwartsSchool.control.GameControl;
import byui.cit260.hogwartsSchool.model.Player;
import java.util.Scanner;
import welcomeToHogwarts.WelcomeToHogwarts;

/**
 *
 * @author Coggputer
 */
public class HelpMenuView {
    
    private final String MENU = "\n"
            + "\n------------------------------------"
            + "\n|  Help Menu                       |"
            + "\n------------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nM - How to move"
            + "\nP - How do I get points?"
            + "\nH - What house am I in?"
            + "\nN - What are notes?"
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
            case 'G': //goal of the game
                System.out.println("\n*** What is the goal of the game??? Explaination ***");
                break;
            case 'M': //how to move
                System.out.println("\n*** How to move??? Explaination ***");
                break;
            case 'P': //how to get points
                System.out.println("\n*** How do I get points??? Explaination ***");
                break;
            case 'H': //what house am i in?
                System.out.println("\n*** What house am I in??? Explaination ***");
                break;
            case 'N': //what are ntoes?
                System.out.println("\n*** What are Notes??? Explaination ***");
                break;
            case 'Q': //exit
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
      
    }