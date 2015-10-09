/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.welcomeToHogwarts.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Coggputer
 */
public class Game implements Serializable{
    
    // class instance variables
    private double pointAmount;
    private String allNotes;
    private String playerHouse;
    private double totalPoints;

    public Game() {
    }
    
    

    public double getPointAmount() {
        return pointAmount;
    }

    public void setPointAmount(double pointAmount) {
        this.pointAmount = pointAmount;
    }

    public String getAllNotes() {
        return allNotes;
    }

    public void setAllNotes(String allNotes) {
        this.allNotes = allNotes;
    }

    public String getPlayerHouse() {
        return playerHouse;
    }

    public void setPlayerHouse(String playerHouse) {
        this.playerHouse = playerHouse;
    }

    public double getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(double totalPoints) {
        this.totalPoints = totalPoints;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.pointAmount) ^ (Double.doubleToLongBits(this.pointAmount) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.allNotes);
        hash = 29 * hash + Objects.hashCode(this.playerHouse);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.totalPoints) ^ (Double.doubleToLongBits(this.totalPoints) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "pointAmount=" + pointAmount + ", allNotes=" + allNotes + ", playerHouse=" + playerHouse + ", totalPoints=" + totalPoints + '}';
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.pointAmount) != Double.doubleToLongBits(other.pointAmount)) {
            return false;
        }
        if (!Objects.equals(this.allNotes, other.allNotes)) {
            return false;
        }
        if (!Objects.equals(this.playerHouse, other.playerHouse)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalPoints) != Double.doubleToLongBits(other.totalPoints)) {
            return false;
        }
        return true;
    }
    
    
    
}
