package org.epita.testexo;

import org.epita.exo1.Monnaie;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class Testexo11 {
    @Test
    public void test_monnaie() {
        assertThat(Monnaie.monnaie(0,0,0,50)).isFalse();
        assertThat(Monnaie.monnaie(2,2,2,200)).isFalse();
        assertThat(Monnaie.monnaie(1,2,2,10)).isTrue();
        assertThat(Monnaie.monnaie(1,2,2,80)).isTrue();
        assertThat(Monnaie.monnaie(1,2,2,90)).isTrue();
        assertThat(Monnaie.monnaie(0,2,5,80)).isFalse();
        assertThat(Monnaie.monnaie(1,1,1,55)).isFalse();
        assertThat(Monnaie.monnaie(7,8,9,330)).isTrue();
    }
}
