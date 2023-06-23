package org.d_seig.creations;

import java.awt.*;

public abstract class Creations {
    private String name;
    private String description;
    private Desktop.Action action; // change later
    //public Weapon() {}
    public Creations(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Creations(String name) {
        this.name = name;
        this.description = "???";
    }
    public void setAction() {
        action = null;
    }
    public void setAction(Desktop.Action action) {
        this.action = action;
    }
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String toString() {
        return "Name: " + getName() + "\n"
                + "Description: " + getDescription();
    }
    public Desktop.Action getAction() {
        return this.action;
    }
}
