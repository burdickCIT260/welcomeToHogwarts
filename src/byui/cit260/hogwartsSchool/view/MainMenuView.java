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
public class MainMenuView {
    
    private final String MENU = "\n"
            + "\n------------------------------------"
            + "\n|  Main Menu                       |"
            + "\n------------------------------------"
            + "\nG - Start game"
            + "\nH - Get help"
            + "\nS Save game"
            + "\nE Exit"
            + "\n------------------------------------";
    private Object GameControl;
            
    public void displayMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU); //display main menu
            
            String input = this.getInput(); //get user's input
            selection = input.charAt(0); //get first character of string
           
            this.doAction(selection); //do action based on selection
            
        } while (selection !='E'); //a selection is not "Exit"
    }

    
    private void startNewGame() {
        System.out.println("*** startNewGame function called ***");
    }
    
    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    
    private void saveGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    
    start void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }

    public void doAction(char choice) {
        
        switch (choice) {
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

    //private String getInput() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    // I think we need to fix/fill this out but I'm not sure how????
    
    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(WelcomeToHogwarts.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    
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
