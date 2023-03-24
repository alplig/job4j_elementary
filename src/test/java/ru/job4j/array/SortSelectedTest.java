package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortLength3() {
        int[] data = new int[] {99, 55, 73};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {55, 73, 99};
        assertThat(result).containsExactly(expected);
    }
}