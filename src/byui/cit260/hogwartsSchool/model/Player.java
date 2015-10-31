/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsSchool.model;

import java.util.Objects;
import java.io.Serializable;
/**
 *
 * @author Coggputer
 */
public class Player implements Serializable{
    
    // class instance variables
    private String playerName;
    private String sortedHouse;

    public Player() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.playerName);
        hash = 19 * hash + Objects.hashCode(this.sortedHouse);
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "playerName=" + playerName + ", sortedHouse=" + sortedHouse + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        if (!Objects.equals(this.sortedHouse, other.sortedHouse)) {
            return false;
        }
        return true;
    }
    
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getSortedHouse() {
        return sortedHouse;
    }

    public void setSortedHouse(String sortedHouse) {
        this.sortedHouse = sortedHouse;
    }

    public void setName(String name) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
