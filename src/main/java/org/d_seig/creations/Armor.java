package org.d_seig.creations;

import org.d_seig.interfaces.Destroying;

import java.util.ArrayList;

public class Armor extends Creations implements Destroying {
    public Armor(String name, String description) {
        super(name, description);
    }

    public Armor(String name) {
        super(name);
    }

    @Override
    public ArrayList<Creations> toDestroy() {
        ArrayList<Creations> components = new ArrayList<>(); // rewrite to basic world components
        //components.addAll();
        components.add(new Artifact("on of the World artifacts..."));
        return components;
    }
}
