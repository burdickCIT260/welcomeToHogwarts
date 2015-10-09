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
public class Map {
    // class instance variables
    private String classLocation;
    private String throughHallways;

    public Map() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.classLocation);
        hash = 97 * hash + Objects.hashCode(this.throughHallways);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "classLocation=" + classLocation + ", throughHallways=" + throughHallways + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (!Objects.equals(this.classLocation, other.classLocation)) {
            return false;
        }
        if (!Objects.equals(this.throughHallways, other.throughHallways)) {
            return false;
        }
        return true;
    }
    
    public String getClassLocation() {
        return classLocation;
    }

    public void setClassLocation(String classLocation) {
        this.classLocation = classLocation;
    }

    public String getThroughHallways() {
        return throughHallways;
    }

    public void setThroughHallways(String throughHallways) {
        this.throughHallways = throughHallways;
    }
    
    
}
