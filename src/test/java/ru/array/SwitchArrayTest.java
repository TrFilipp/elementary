package ru.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap1to6() {
        int[] input = {5, 3, 1, 6, 7, 2};
        int source = 2;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 3, 6, 1, 7, 2};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap7to2() {
        int[] input = {1, 5, 3, 6, 7, 2, 9, 14, 20, 8};
        int source = 4;
        int dest = 5;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 5, 3, 6, 2, 7, 9, 14, 20, 8};
        assertThat(result).containsExactly(expected);
    }
}