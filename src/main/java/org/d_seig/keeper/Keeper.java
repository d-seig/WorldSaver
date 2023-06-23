package org.d_seig.keeper;

import org.d_seig.creations.Artifact;
import org.d_seig.creations.Creations;
import org.d_seig.creations.Thing;
import org.d_seig.factories.OwnWorldFabric;

import java.util.ArrayList;

public class Keeper extends Creations {
    private ArrayList<Creations> inventory;

    private OwnWorldFabric fabric;
    public Keeper(String name, String description) {
        super(name, description);
        inventory = new ArrayList<>(1);
    }
    public Keeper(String name) {
        super(name);
        inventory = new ArrayList<>();
    }

    public void createSomething(String somethingTypeName) {
        somethingTypeName = somethingTypeName.toUpperCase();
        switch (somethingTypeName) {
            case "ARMOR":
                fabric.createArmor(new Artifact("птичья жопка"));
                break;
            case "ARTIFACT":
                fabric.createArtifact();
                break;
            case "WEAPON":
                fabric.createWeapon();
            case "PURIFY":
                fabric.purifyThing(new Artifact("отблеск солнца в лучах капли дождя"));
                break;
            case "POLLUTE":
                fabric.polluteThing(new Artifact("предметное стеклышко"));
                break;
            case "LIFEFORM": // ("o_O')'
                fabric.createLifeForm(new Thing("Жопа летучей мыши"), new Thing("Подкрылки подмышки"),
                        new Thing("Ух, жусть, над этим я потел всю ночь"));
        }
    }
}
