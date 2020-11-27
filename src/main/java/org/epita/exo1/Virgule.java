package org.epita.exo1;

public class Virgule {
    public static int virgule(String chaine,int nbVirgule) {
        int nbmax = chaine.length() - nbVirgule;
        int max = 0;
        for (int i = 0; i <= chaine.length() - nbmax; i++) {
            if (Integer.parseInt(chaine.substring(i,i+nbmax)) > max) {
                max = Integer.parseInt(chaine.substring(i,i+nbmax));
            }
        }
        return max;
    }
}
