package org.epita.testexo;

import anomalie.Anomalie;
import org.epita.exo1.ElementEloigne;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class Testexo3 {

    @Test
    public void element_eloigne() {
        int[] tabEntier = new int[] {1,-2,10,-15,3} ;
        int[] tabEntier2 = new int[] {-10,10,3,-5} ;
        int[] tabEntier3 = new int[] {-10,10,3,10} ;
        int[] tabEntierVide = new int[] {} ;
        assertThat(ElementEloigne.elementEloigne(tabEntier)).isEqualTo(3);
        assertThat(ElementEloigne.elementEloigne(tabEntier2)).isEqualTo(1);
        assertThat(ElementEloigne.elementEloigne(tabEntier3)).isEqualTo(1);
        Throwable thrown = catchThrowable(() -> {ElementEloigne.elementEloigne(tabEntierVide);});

        assertThat(thrown).isInstanceOf(Anomalie.class);
    }
}
