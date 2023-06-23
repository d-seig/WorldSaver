package org.d_seig.factories;

import org.d_seig.creations.*;
import org.d_seig.worlds.WorldCore;

public class OwnWorldFabric implements Fabric {

    @Override
    public Weapon createWeapon() {
        return null;
    }

    @Override
    public LifeForm createLifeForm(Thing... things) {
        return new LifeForm("Вадя", "Жопный");
    }

    @Override
    public Armor createArmor(Artifact artifact, Thing... things) {
        return null;
    }

    @Override
    public Artifact createArtifact() {
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
        //if(core.type == ownworld.type) ownworld.stabilize()
    }
}
