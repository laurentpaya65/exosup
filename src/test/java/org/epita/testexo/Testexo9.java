package org.epita.testexo;

import org.epita.exo1.ChiffreEntier;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class Testexo9 {

    @Test
    public void test_chiffreentier() {
        int[] tabEntier = new int[] {1,3,1} ;
        int[] tabEntier2 = new int[] {5,7,5,9,7} ;
        int[] tabEntier3 = new int[] {9,1,3,1,7,4,6,6,7} ;
        assertThat(ChiffreEntier.chiffreEntier(tabEntier)).isEqualTo(13);
        assertThat(ChiffreEntier.chiffreEntier(tabEntier2)).isEqualTo(579);
        assertThat(ChiffreEntier.chiffreEntier(tabEntier3)).isEqualTo(134679);
    }
}
