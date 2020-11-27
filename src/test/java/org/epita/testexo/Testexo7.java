package org.epita.testexo;

import org.epita.exo1.MajMin;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class Testexo7 {

    @Test
    public void test_majmin() {
        assertThat(MajMin.majmin("Toto")).isEqualTo("toto");
        assertThat(MajMin.majmin("TITi")).isEqualTo("TITI");
        assertThat(MajMin.majmin("taTA")).isEqualTo("taTA");
    }
}
