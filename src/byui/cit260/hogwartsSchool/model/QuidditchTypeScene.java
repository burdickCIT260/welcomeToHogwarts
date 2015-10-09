/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsSchool.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author MyHome
 */
public class QuidditchTypeScene implements Serializable{
    
    // class instance variables
    private String description;
    private String gameAnnouncement;
    private double getPoints;

    public QuidditchTypeScene() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGameAnnouncement() {
        return gameAnnouncement;
    }

    public void setGameAnnouncement(String gameAnnouncement) {
        this.gameAnnouncement = gameAnnouncement;
    }

    public double getGetPoints() {
        return getPoints;
    }

    public void setGetPoints(double getPoints) {
        this.getPoints = getPoints;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.gameAnnouncement);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.getPoints) ^ (Double.doubleToLongBits(this.getPoints) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "QuidditchTypeScene{" + "description=" + description + ", gameAnnouncement=" + gameAnnouncement + ", getPoints=" + getPoints + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final QuidditchTypeScene other = (QuidditchTypeScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.gameAnnouncement, other.gameAnnouncement)) {
            return false;
        }
        if (Double.doubleToLongBits(this.getPoints) != Double.doubleToLongBits(other.getPoints)) {
            return false;
        }
        return true;
    }
    
    
    
}
