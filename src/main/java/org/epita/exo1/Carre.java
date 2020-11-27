package org.epita.exo1;

import anomalie.Anomalie;

public class Carre {
    public static int carre(int[] tabEntier) throws Anomalie {
        if (tabEntier.length == 0 ) {
            return -1;
        }
        double som = 0.0D;
        for (int i = 0; i < tabEntier.length ; i++) {
            som = som + (double) tabEntier[i]*(double) tabEntier[i];
            if (som > Long.MAX_VALUE) {
                throw new Anomalie("depassement capacité");
            }
        }
        return (int) som;
    }
}
