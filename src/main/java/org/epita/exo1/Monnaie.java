package org.epita.exo1;

public class Monnaie {
    public static boolean monnaie(int a,int b,int c,int somme) {
        boolean possible = false;
        int nbPiece = 0;
        int min = a + b + c;

        for (int i = 0; i <= b; i++) {
            for (int j = 0; j <= c; j++) {
                if (      (somme - 20 * i - 50 * j  >= 0)
                    && (  (somme - 20 * i - 50 * j ) % 10 == 0)
                    && (  (somme - 20 * i - 50 * j ) / 10 <= a)  ) {
                    possible = true;
                    nbPiece = (somme - 20 * i - 50 * j ) / 10 + i + j;
                    if (nbPiece < min) {
                        min = nbPiece;
                    }
                }
            }
        }
        if (possible) {
            System.out.println("nombre piece minimum = "+min);
        }
        return possible;
    }
}
