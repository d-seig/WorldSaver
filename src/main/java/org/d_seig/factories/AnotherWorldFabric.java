package org.d_seig.factories;

import org.d_seig.creations.*;
import org.d_seig.worlds.WorldCore;

public class AnotherWorldFabric implements Fabric {
    @Override
    public Weapon createWeapon() {
        System.out.println("Creating weapon...");

        return null;
    }

    @Override
    public LifeForm createLifeForm(Thing... things) {
        System.out.println("Creating lifeform...");
        return null;
    }

    @Override
    public Armor createArmor(Artifact artifact, Thing... things) {
        System.out.println("Creating armor...");
        return null;
    }

    @Override
    public Artifact createArtifact() {
        System.out.println("Creating artifact...");
        return null;
    }

    @Override
    public Artifact polluteThing(Artifact artifact) {
        System.out.println("polluting artifact...");
        return null;
    }

    @Override
    public Artifact purifyThing(Artifact artifact) {
        System.out.println("purifying artifact...");
        return null;
    }

    @Override
    public void StabilizeWorldCore(WorldCore core) {

    }
}
