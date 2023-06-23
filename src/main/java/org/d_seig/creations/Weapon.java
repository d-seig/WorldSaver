package org.d_seig.creations;

import org.d_seig.interfaces.Destroying;

import java.util.ArrayList;

public class Weapon extends Creations implements Destroying {
    //public WorldType effects;
    public Weapon(String name) {
        super(name);
    }
    public Weapon(String name, String description) {
        super(name, description);
    }

    @Override
    public ArrayList<Creations> toDestroy() {
        return null;
    }
}
