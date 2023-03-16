package ru.job4j.condition;

import  java.lang.Math;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double deltaX = x1 - x2;
        double deltaY = y2 - y1;
        double powDeltaX = Math.pow(deltaX, 2);
        double powDeltaY = Math.pow(deltaY, 2);
        double sum = powDeltaX + powDeltaY;
        double rsl = Math.sqrt(sum);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(10, 16, -4, 5);
        System.out.println("result (0, 0) to (2, 0) " + result1);
    }
}
