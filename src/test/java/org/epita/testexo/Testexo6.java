package org.epita.testexo;

import org.epita.exo1.Ticket;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class Testexo6 {

    @Test
    public void test_ticket() {
        assertThat(Ticket.ticket("123456789012")).isEqualTo("########9012");
        assertThat(Ticket.ticket("1234 5678 9012")).isEqualTo("##########9012");
        assertThat(Ticket.ticket("MomNomEstPersonne")).isEqualTo("#############onne");
        assertThat(Ticket.ticket("42")).isEqualTo("42");
    }
}
