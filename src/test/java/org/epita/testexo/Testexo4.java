package org.epita.testexo;

import anomalie.Anomalie;
import org.epita.exo1.ElementEloigne;
import org.epita.exo1.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class Testexo4 {

    @Test
    public void fibonacci() {
        int[] tabEntier = new int[] {1,-2,10,-15,3} ;
        int[] tabEntier2 = new int[] {-10,10,3,-5} ;
        int[] tabEntier3 = new int[] {-10,10,3,10} ;
        int[] tabEntierVide = new int[] {} ;
        assertThat(Fibonacci.calcul(2)).isEqualTo(1);
        assertThat(Fibonacci.calcul(3)).isEqualTo(2);
        assertThat(Fibonacci.calcul(10)).isEqualTo(55);
        assertThat(Fibonacci.calcul(16)).isEqualTo(987);
    }
    }
