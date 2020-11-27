package org.epita.testexo;

import anomalie.Anomalie;
import org.epita.exo1.Carre;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class Testexo1 {

    @Test
    public void carre() {
        int[] tabEntier = new int[] {1,2,3} ;
        int[] tabEntier2 = new int[] {14,9,-9,1,4,3} ;
        int[] tabEntierVide = new int[] {} ;
        int[] tabEntierMAX = new int[] {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE} ;
//        for (int i = 0; i < nb; i++) {
//            tabEntier[i] = (int) (Math.random()*Integer.MAX_VALUE);
//            System.out.println("tabEntier["+i+"]="+tabEntier[i]);
//        }
//        Carre.carre(tabEntierMAX);
        assertThat(Carre.carre(tabEntier)).isEqualTo(14);
        assertThat(Carre.carre(tabEntier2)).isEqualTo(384);
        assertThat(Carre.carre(tabEntierVide)).isEqualTo(-1);
        Throwable thrown = catchThrowable(() -> {Carre.carre(tabEntierMAX);});

        assertThat(thrown).isInstanceOf(Anomalie.class);
    }
}
