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
public class Exam implements Serializable{
    
    // class instance variables
    private String viewNotes;
    private String multipleChoice;
    private String getPoints;

    public Exam() {
    }

    public String getViewNotes() {
        return viewNotes;
    }

    public void setViewNotes(String viewNotes) {
        this.viewNotes = viewNotes;
    }

    public String getMultipleChoice() {
        return multipleChoice;
    }

    public void setMultipleChoice(String multipleChoice) {
        this.multipleChoice = multipleChoice;
    }

    public String getGetPoints() {
        return getPoints;
    }

    public void setGetPoints(String getPoints) {
        this.getPoints = getPoints;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.viewNotes);
        hash = 29 * hash + Objects.hashCode(this.multipleChoice);
        hash = 29 * hash + Objects.hashCode(this.getPoints);
        return hash;
    }

    @Override
    public String toString() {
        return "Exam{" + "viewNotes=" + viewNotes + ", multipleChoice=" + multipleChoice + ", getPoints=" + getPoints + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Exam other = (Exam) obj;
        if (!Objects.equals(this.viewNotes, other.viewNotes)) {
            return false;
        }
        if (!Objects.equals(this.multipleChoice, other.multipleChoice)) {
            return false;
        }
        if (!Objects.equals(this.getPoints, other.getPoints)) {
            return false;
        }
        return true;
    }
    
    
}
