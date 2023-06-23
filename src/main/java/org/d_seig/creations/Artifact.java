package org.d_seig.creations;

import org.d_seig.interfaces.Destroying;
import org.d_seig.interfaces.Researching;

import java.util.ArrayList;

public class Artifact extends Creations implements Destroying, Researching {
    public Artifact(String name, String description) {
        super(name, description);
    }

    public Artifact(String name) {
        super(name);
    }

    @Override
    public ArrayList<Creations> toDestroy() {
        ArrayList<Creations> components = new ArrayList<>();
        //components.add(); // add two random things
        //components.add(); // from 2 another world
        // and (artifact) extends properties that things
        return components;
    }

    @Override
    public String research() {
        System.out.println("You researching artifact...");
        System.out.println("You researched world effect: " + "/effect/");
        return null;
    }
}
