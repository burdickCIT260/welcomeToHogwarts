/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsSchool.view;

import byui.cit260.hogwartsSchool.model.Player;
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
            + "\nP How do I get points?"
            + "\nH What house am I in?"
            + "\nN What are notes?"
            + "\nQ Quit"
            + "\n------------------------------------";
    private Object GameControl;
            
    public void displayMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU); //display main menu
            
            String input = this.getInput(); //get user's input
            selection = input.charAt(0); //get first character of string
           
            this.doAction(selection); //do action based on selection
            
        } while (selection !='Q'); //a selection is not "Exit"
    }

    
    private void displayHelpGame() {
        System.out.println("*** displayHelpGame function called ***");
    }
    
    private void displayHelpMove() {
        System.out.println("*** displayHelpMove function called ***");
    }
    
    private void displayHelpPoints() {
        System.out.println("*** displayHelpPoints function called ***");
    }
    
    private void displayHelpHouse() {
        System.out.println("*** displayHelpHouse function called ***");
    }

    private void displayHelpNotes() {
        System.out.println("*** displayHelpNotes function called ***");
    }

    public void doAction(char choice) {
        
        switch (choice) {
            case 'G':
                this.helpGame();
                break;
            case 'M': 
                this.helpMove();
                break;
            case 'P': 
                this.helpPoints();
                break;
            case 'H': 
                this.helpHouse();
                break;
            case 'N': 
                this.helpNotes();
                break;
            case 'Q': //exit
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     // I think we need to fix/fill this out but I'm not sure how????
    
    public class GameControl {
        
        public static void createNewGame(Player player) {
            System.out.println("\n*** createNewGame stub function called ***");
        }
    }
    public class GameMenuView {
        
        void displayMenu() {
            System.out.println("\n*** displayMenu stub function called ***");
        }
    }
}
