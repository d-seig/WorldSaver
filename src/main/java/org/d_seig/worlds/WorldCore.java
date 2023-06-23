package org.d_seig.worlds;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class WorldCore {
    HashMap<String, Float> worldEffects = new HashMap<>();
    String worldName, nameCore;

    WorldType type;
    public enum WorldType {
        TECH,
        MAGIC,
        PRIMITIVE,
        SCI_FI,
        H_TONIC,
        ANOTHER
    }

    public WorldCore() {}
    public WorldCore(String worldName, String nameCore, WorldType type) {
        this.worldName = worldName;
        this.nameCore = nameCore;
        this.type = type;
    }
    private void getParams() {
        Scanner in = new Scanner(System.in);
        String typeDamage = "";
        switch (this.type) {
            case TECH:
                typeDamage = "F";
                break;
            case MAGIC:
                typeDamage = "M";
                break;
            case PRIMITIVE:
                typeDamage = "P";
                break;
            case SCI_FI:
                typeDamage = "E";
                break;
            case H_TONIC:
                typeDamage = "S";
                break;
            case ANOTHER:
                typeDamage = "A";
                break;
            /*default:
                this.type = WorldType.ANOTHER;
                getParams();
                break;*/
        }
        // add usability interface
        worldEffects.put("Population density", in.nextFloat());
        worldEffects.put("Atmosphere damage", in.nextFloat());
        worldEffects.put(typeDamage, in.nextFloat());
        worldEffects.put("Fine research", in.nextFloat());
        worldEffects.put("Fine movement", in.nextFloat());
        worldEffects.put("Fine health", in.nextFloat());
    }


}
