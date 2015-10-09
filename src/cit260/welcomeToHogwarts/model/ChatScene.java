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
public class ChatScene implements Serializable{
    
    private String description;
    private String takeNotes;
    private String chat;

    public ChatScene() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.description);
        hash = 47 * hash + Objects.hashCode(this.takeNotes);
        hash = 47 * hash + Objects.hashCode(this.chat);
        return hash;
    }

    @Override
    public String toString() {
        return "ChatScene{" + "description=" + description + ", takeNotes=" + takeNotes + ", chat=" + chat + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ChatScene other = (ChatScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.takeNotes, other.takeNotes)) {
            return false;
        }
        if (!Objects.equals(this.chat, other.chat)) {
            return false;
        }
        return true;
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

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public void getDescription(String heres_a_description) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getTakeNotes(String notes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getChat(String list_of_tasks) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
