package org.epita.testexo;

import org.epita.exo1.Virgule;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class Testexo10 {
    @Test
    public void test_chiffreentier() {
        assertThat(Virgule.virgule("1234",1)).isEqualTo(234);
        assertThat(Virgule.virgule("1234",2)).isEqualTo(34);
        assertThat(Virgule.virgule("1234",3)).isEqualTo(4);
        assertThat(Virgule.virgule("2020",1)).isEqualTo(202);
        assertThat(Virgule.virgule("12455787687",3)).isEqualTo(55787687);
    }
}
