package ru.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3Elements() {
        int[] data = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5Elements() {
        int[] data = new int[] {3, 6, 2, 8, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 5, 6, 8};
        assertThat(result).containsExactly(expected);
    }
}