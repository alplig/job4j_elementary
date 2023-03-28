package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;

        int shortChange = money - price;

        for (int coin : coins) {
            while (shortChange > 0) {
                if (shortChange >= coin) {
                    shortChange -= coin;
                    size++;
                    rsl[size - 1] = coin;
                } else {
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
