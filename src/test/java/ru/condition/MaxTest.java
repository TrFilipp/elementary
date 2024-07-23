package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2And0Then2() {
        Max max = new Max();
        int result = max.max(1, 2, 0);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To0And2Then4() {
        Max max = new Max();
        int result = max.max(4, 0, 2);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax8To4And3And9The9() {
        Max max = new Max();
        int result = max.max(8, 4, 3, 9);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To3And2And1The3() {
        Max max = new Max();
        int result = max.max(2, 3, 2, 1);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}