/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcomeToHogwarts;

import byui.cit260.hogwartsSchool.model.ChatScene;
import byui.cit260.hogwartsSchool.model.ClassSceneType;
import byui.cit260.hogwartsSchool.model.Location;
import byui.cit260.hogwartsSchool.model.QuidditchTypeScene;
import byui.cit260.hogwartsSchool.model.Exam;
import byui.cit260.hogwartsSchool.model.Game;
import byui.cit260.hogwartsSchool.model.Map;
import byui.cit260.hogwartsSchool.model.NotesInventory;
import byui.cit260.hogwartsSchool.model.Player;
import byui.cit260.hogwartsSchool.view.StartProgramView;

/**
 *
 * @author Coggputer
 */
public class WelcomeToHogwarts {
    
    private static Game currentGame = null;
    private static Player player = null;

    public static void main(String[] args) {
       
    // create StartProgramView and start the program
    StartProgramView startProgramView = new StartProgramView();
    startProgramView.startProgram();
    
    /**
     * Game
     */
        Game theGame = new Game();
    
        theGame.setPointAmount(700);
        theGame.setAllNotes("Here is the menu to access the notes!");
        theGame.setPlayerHouse("Griffyndor");
        theGame.setTotalPoints(1000);
        
        String pointAmount = theGame.toString();
        System.out.println(theGame);
    /**
    * Exams
    */
        Exam theExam = new Exam();
        
        theExam.setViewNotes("Notes menu!");
        theExam.setMultipleChoice("Here are some multiple choice questions!");
        theExam.setGetPoints("+100 points!");
        
        String viewNotes = theExam.toString();
        System.out.println(theExam);
    /**
     * Notes Inventory
     */
        NotesInventory notesInv = new NotesInventory();
        
        notesInv.setClassNotes("List of all the classes");
        notesInv.setOtherNotes("List of the other encounters that resulted in getting notes");
        
        String classNotes = notesInv.toString();
        System.out.println(notesInv);
        
    /**
     * Player
     */
        Player thePlayer = new Player();
        
        thePlayer.setPlayerName("Stephanie");
        thePlayer.setSortedHouse("Hufflepuff");
        
        String playerName = thePlayer.toString();
        System.out.println(thePlayer);
    /**
     * Map
     */
        Map theMap = new Map();
        
        theMap.setClassLocation("Here's the map!");
        theMap.setThroughHallways("Hallways you have to pass through");
        
        String classLocation = theMap.toString();
        System.out.println(theMap);
    /**
     * Location
     */
        Location theLocation = new Location();
        
        theLocation.setPlaceName("Here's the name of a place");
        theLocation.setVisited("List of visited places I guess?");
                
        String placeName = theLocation.toString();
        System.out.println(placeName);
    /**
     * Chat Scene
     */
        ChatScene chatting = new ChatScene();
        
        chatting.setDescription("Here's a description");
        chatting.setTakeNotes("The option to take some notes");
        chatting.setChat("blah blah blah chatting");
        
        String description = chatting.toString();
        System.out.println(chatting);
    /**
     * Class Scene Type
     */
        ClassSceneType classScene = new ClassSceneType();
        
        classScene.setDescription("here's a description");
        classScene.setTakeNotes("The option to take some notes");
        classScene.setTeacherTask("The teacher is telling you to do something!");
        
        String takeNotes = classScene.toString();
        System.out.println(classScene);
    
    /**
     * Quidditch Type Scene
     */
        QuidditchTypeScene quidditch = new QuidditchTypeScene();
        
        quidditch.setDescription("Here's a description");
        quidditch.setGameAnnouncement("Here's an announcement");
        quidditch.setGetPoints(100);
        
        String gameAnnouncement = quidditch.toString();
        System.out.println(quidditch);

        
    } 
        public static Game getCurrentGame() {
            return currentGame;
        }
        
        public static void setCurrentGame(Game currentGame) {
            WelcomeToHogwarts.currentGame = currentGame;
        }
        
        public static Player getPlayer() {
            return player;
        }
        
        public static void setPlayer(Player player) {
            WelcomeToHogwarts.player = player;
        } /* DUNNO WHY THIS IS GIVING US AN ERROR? */
