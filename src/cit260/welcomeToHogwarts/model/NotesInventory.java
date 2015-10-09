/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.welcomeToHogwarts.model;

import java.util.Objects;
import java.io.Serializable;

/**
 *
 * @author Coggputer
 */
public class NotesInventory implements Serializable{
    private String classNotes;
    private String otherNotes;

    public NotesInventory() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.classNotes);
        hash = 67 * hash + Objects.hashCode(this.otherNotes);
        return hash;
    }

    @Override
    public String toString() {
        return "NotesInventory{" + "classNotes=" + classNotes + ", otherNotes=" + otherNotes + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NotesInventory other = (NotesInventory) obj;
        if (!Objects.equals(this.classNotes, other.classNotes)) {
            return false;
        }
        if (!Objects.equals(this.otherNotes, other.otherNotes)) {
            return false;
        }
        return true;
    }
    
    public String getClassNotes() {
        return classNotes;
    }

    public void setClassNotes(String classNotes) {
        this.classNotes = classNotes;
    }

    public String getOtherNotes() {
        return otherNotes;
    }

    public void setOtherNotes(String otherNotes) {
        this.otherNotes = otherNotes;
    }
    
    
}
