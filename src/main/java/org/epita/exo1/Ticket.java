package org.epita.exo1;

public class Ticket {
    public static String ticket(String chaine) {
        if (chaine.length() < 5) {
            return chaine;
        }

        String retour = "";
            for (int i = 0; i < chaine.length() - 4; i++) {
                retour = retour + "#";
            }

        return retour + chaine.substring(chaine.length() - 4,chaine.length());
    }
}
