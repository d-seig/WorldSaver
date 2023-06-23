package org.d_seig.factories;

import org.d_seig.creations.*;
import org.d_seig.worlds.WorldCore;

public interface Fabric {
    Weapon createWeapon();

    LifeForm createLifeForm(Thing... things);

    Armor createArmor(Artifact artifact, Thing... things);

    Artifact createArtifact();

    Artifact polluteThing(Artifact artifact);

    Artifact purifyThing(Artifact artifact);

    void StabilizeWorldCore(WorldCore core); // equals OwnWorld Type
}
