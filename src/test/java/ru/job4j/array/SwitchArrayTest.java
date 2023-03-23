package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {10, 22, 345, 455, 7054};
        int source = 2;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {10, 22, 455, 345, 7054};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap5to3() {
        int[] input = {10, 22, 455, 345, 7054, 17, 99};
        int source = 5;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {10, 22, 455, 17, 7054, 345, 99};
        assertThat(result).containsExactly(expected);
    }
}