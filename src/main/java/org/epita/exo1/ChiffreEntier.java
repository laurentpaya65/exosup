package org.epita.exo1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ChiffreEntier {
    public static int chiffreEntier(int[] tabEntier) {
        Set<Integer> tabChiffre = new TreeSet<>();
        int nombre = 0;

        for (Integer entier : tabEntier) {
            tabChiffre.add(entier);
        }

        for (Integer chiffre : tabChiffre ) {
            nombre = nombre * 10 + chiffre;
        }
        return nombre;
    }
}
