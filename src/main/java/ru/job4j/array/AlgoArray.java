package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp;
        for (int index = 0; index < array.length; index++) {
            for (int j = index; j < array.length; j++) {
                if (array[index] > array[j]) {
                    temp = array[index];
                    array[index] = array[j];
                    array[j] = temp;
                }

            }
        }
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
