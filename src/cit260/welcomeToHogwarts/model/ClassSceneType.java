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
public class ClassSceneType implements Serializable{
    
    //Class instance variables
    private String description;
    private String takeNotes;
    private String teacherTask;

    public ClassSceneType() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTakeNotes() {
        return takeNotes;
    }

    public void setTakeNotes(String takeNotes) {
        this.takeNotes = takeNotes;
    }

    public String getTeacherTask() {
        return teacherTask;
    }

    public void setTeacherTask(String teacherTask) {
        this.teacherTask = teacherTask;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + Objects.hashCode(this.takeNotes);
        hash = 89 * hash + Objects.hashCode(this.teacherTask);
        return hash;
    }

    @Override
    public String toString() {
        return "ClassSceneType{" + "description=" + description + ", takeNotes=" + takeNotes + ", teacherTask=" + teacherTask + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClassSceneType other = (ClassSceneType) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.takeNotes, other.takeNotes)) {
            return false;
        }
        if (!Objects.equals(this.teacherTask, other.teacherTask)) {
            return false;
        }
        return true;
    }

    public void getDescription(String heres_a_description) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getTakeNotes(String notes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getTeacherTask(String list_of_tasks) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
