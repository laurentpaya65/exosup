package org.epita.testexo;

import org.epita.exo1.EntierAdjacent;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class Testexo8 {

    @Test
    public void test_majmin() {
        int[] tabEntier = new int[] {1,2,3} ;
        int[] tabEntier2 = new int[] {9,5,10,2,24,-1,-48} ;
        int[] tabEntier3 = new int[] {-23,4,-5,99,-27,329,-2,7,-921} ;
        assertThat(EntierAdjacent.entieradjacent(tabEntier)).isEqualTo(6);
        assertThat(EntierAdjacent.entieradjacent(tabEntier2)).isEqualTo(50);
        assertThat(EntierAdjacent.entieradjacent(tabEntier3)).isEqualTo(-14);
    }
}

