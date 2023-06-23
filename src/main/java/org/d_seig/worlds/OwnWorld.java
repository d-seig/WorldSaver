package org.d_seig.worlds;

import org.d_seig.creations.Artifact;
import org.d_seig.creations.Thing;
import org.d_seig.factories.OwnWorldFabric;

import java.util.Scanner;

public class OwnWorld {
    private String params;
    private OwnWorldFabric fabric;

    // rewrite to file strings.txt
    private String[] valuesToOutput = new String[] {
            "Enter name of your world, world keeper:",
            "Choose your world type (keeper, just enter number):\n\t[1] Tech\n\t[2] Magic\n\t[3] Primitive\n\t[4] Sci-Fi\n\t[5] H'tonic",
            "Enter name for world core, keeper:"
    };
    private static OwnWorld instance;

    public static OwnWorld getInstance() {
        return instance == null ? new OwnWorld() : instance;
    }

    private OwnWorld() {
        InitParams();
        fabric.createLifeForm(new Thing("Кость"),
                new Thing("Кость"),
                new Thing("Кость"),
                new Thing("Маленькая костлявая жопка"));
        fabric.createArmor(new Artifact("Эссенция костей"),
                new Thing("Кожа"),
                new Thing("Нитки"),
                new Thing("Руки (не из жопы)"),
                new Thing("Ноги (не из плеч)"));
    }

    private void InitParams() {
        Scanner scan = new Scanner(System.in);

        params = "";

        for (String str : valuesToOutput) {
            System.out.println(str);
            params += scan.nextLine() + ";";
        }
        scan.close();

    }

    public String toString() {
        return params;
    }

}