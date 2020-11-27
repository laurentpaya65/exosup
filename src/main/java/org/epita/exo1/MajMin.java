package org.epita.exo1;

public class MajMin {
    public static String majmin(String chaine) {
        int nbMaj = 0;
        int nbMin = 0;
        for (int i = 0; i < chaine.length(); i++) {
            if (chaine.substring(i,i+1).equals(chaine.substring(i,i+1).toUpperCase())) {
                nbMaj = nbMaj + 1;
            }
        }
        nbMin = chaine.length() - nbMaj;

        if (nbMaj == nbMin) {
            return chaine;
        }
        if (nbMaj > nbMin) {
            return chaine.toUpperCase();
        } else {
            return chaine.toLowerCase();
        }
    }
}
