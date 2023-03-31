package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int a = 1;
        int b = 2;
        int result = Max.max(a, b);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int a = 2;
        int b = 1;
        int result = Max.max(a, b);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax0To0Then2() {
        int a = 0;
        int b = 0;
        int result = Max.max(a, b);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenA1B2C3Max3() {
        int a = 1;
        int b = 2;
        int c = 3;
        int result = Max.max(a, b, c);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenA1B4C3D2Max3() {
        int a = 1;
        int b = 4;
        int c = 3;
        int d = 2;
        int result = Max.max(a, b, c, d);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}