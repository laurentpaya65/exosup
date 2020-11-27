package org.epita.exo1;

public class EntierAdjacent {
    public static int entieradjacent(int[] tabEntier) {
        if (tabEntier.length < 2) {
            return 0;
        }
        int max = tabEntier[0] * tabEntier[1];
        for (int i = 1; i < tabEntier.length -1; i++) {
            if (tabEntier[i] * tabEntier[i+1] > max) {
                max = tabEntier[i] * tabEntier[i+1];
            }
        }
        return max;
    }
}
