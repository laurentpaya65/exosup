package org.epita.exo1;

import anomalie.Anomalie;

public class ElementEloigne {
    public static int elementEloigne(int[] tabEntier) {
        int index = -1;
        int max = 0;
        if (tabEntier.length == 0) {
            throw new Anomalie("tableau vide");
        }
        for (int i = 0; i < tabEntier.length; i++) {
            if ( Math.abs(tabEntier[i]) > Math.abs(max)
                    || ( max - tabEntier[i] == 2 * max && max < 0 ) ) {
                max = tabEntier[i];
                index = i;
            }
        }

        return index;
    }
}
