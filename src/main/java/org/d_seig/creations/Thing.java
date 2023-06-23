package org.d_seig.creations;

import org.d_seig.interfaces.Destroying;
import org.d_seig.interfaces.Researching;
import org.d_seig.worlds.WorldCore;

import java.util.ArrayList;

public class Thing extends Creations implements Destroying, Researching {
    WorldCore.WorldType type;
    public Thing(String name, String description) {

        super(name, description);
        //super.setAction(worldType.getThingEffects());
    }

    public Thing(String name) {
        super(name);
    }


    @Override
    public ArrayList<Creations> toDestroy() {
        if(getName().equals("Ash"))
            return null;
        else {
            ArrayList<Creations> components = new ArrayList<>(1);
            components.add(new Thing("Ash"));
            return components;
        }
    }

    @Override
    public String research() {
        System.out.println("You researching thing...");
        System.out.println("You researched world effect: " + "/effect/");
        return null;
    }
}
