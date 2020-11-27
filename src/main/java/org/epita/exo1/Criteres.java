package org.epita.exo1;

public class Criteres {
    public static boolean criteres(int age,int note,int salaire) {
        if (salaire >= 1000000) {
            return true;
        }
        if (age < 18 || age > 35) {
            return false;
        }
        if (note < 8 ) {
            return false;
        }
        if (salaire < 50000) {
            return false;
        }
        return true;
    }
}
