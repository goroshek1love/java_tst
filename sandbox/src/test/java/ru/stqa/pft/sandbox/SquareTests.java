package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

    @Test
    public void testAreaFirst() {
        Square square = new Square(5);
        assert square.area() == 25;
    }

    @Test
    public void testAreaSecond() {
        Square square = new Square(4);
        Assert.assertEquals(square.area(), 16);
    }
}
