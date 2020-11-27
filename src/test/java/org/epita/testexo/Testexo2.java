package org.epita.testexo;

import anomalie.Anomalie;
import org.epita.exo1.Moyenne;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class Testexo2 {

    @Test
    public void test_moyenne() {
        int[] tabEntier = new int[] {10,20} ;
        int[] tabEntier2 = new int[] {11,12,13,14,15,16} ;
        int[] tabEntier3 = new int[] {11,13,17} ;
        int[] tabEntier4 = new int[] {-1,1,-1,1} ;
        int[] tabEntierVide = new int[] {} ;
        assertThat(Moyenne.moyenne(tabEntier)).isEqualTo(15);
        assertThat(Moyenne.moyenne(tabEntier2)).isEqualTo(13);
        assertThat(Moyenne.moyenne(tabEntier3)).isEqualTo(13);
        assertThat(Moyenne.moyenne(tabEntier4)).isEqualTo(0);
        Throwable thrown = catchThrowable(() -> {Moyenne.moyenne(tabEntierVide);});

        assertThat(thrown).isInstanceOf(Anomalie.class);
    }
}
