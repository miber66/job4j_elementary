package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceX2two() {
        double x1 = 0;
        double y1 = 0;
        double x2 = 2;
        double y2 = 0;
        double expected = 2;
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceX2six() {
        double x1 = 0;
        double y1 = 0;
        double x2 = 6;
        double y2 = 0;
        double expected = 6;
        double out = Point.distance(0, 0, 6, 0);
        Assert.assertEquals(expected, out, 0.01);
    }
}