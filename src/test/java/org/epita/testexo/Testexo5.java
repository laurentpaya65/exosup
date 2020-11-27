package org.epita.testexo;

import org.epita.exo1.Criteres;
import org.epita.exo1.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class Testexo5 {

    @Test
    public void criteres() {
        assertThat(Criteres.criteres(21,9,60000)).isTrue();
        assertThat(Criteres.criteres(10,9,60000)).isFalse();
        assertThat(Criteres.criteres(21,7,90000)).isFalse();
        assertThat(Criteres.criteres(90,2,2000000)).isTrue();
    }
}

