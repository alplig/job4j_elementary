package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to00then0() {
        double expected = 0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to00then1() {
        double expected = 1;
        Point a = new Point(1, 0);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when99to99then0() {
        double expected = 0;
        Point a = new Point(9, 9);
        Point b = new Point(9, 9);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public  void when000to000then0() {
        double expected = 0;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to111then1dot732() {
        double expected = 1.732;
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public  void when888to123then10dot488() {
        double expected = 10.488;
        Point a = new Point(8, 8, 8);
        Point b = new Point(1, 2, 3);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}