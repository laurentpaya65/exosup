package org.epita.exo1;

import anomalie.Anomalie;

public class Moyenne {
    public static int moyenne(int[] tabEntier){
        if (tabEntier.length == 0) {
            throw new Anomalie("tableau vide");
        }
        double moyenne = 0;
        for (int i = 0; i < tabEntier.length; i++) {
            moyenne = moyenne + tabEntier[i] ;
        }
        return (int) moyenne / tabEntier.length;
    }
}
