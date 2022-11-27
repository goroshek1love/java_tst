package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTests {

    @Test
    public void testRectangleFirst() {
        Rectangle rectangle = new Rectangle(5, 5);
        assert rectangle.area() == 25;
    }

    @Test
    public void testRectangleSecond() {
        Rectangle rectangle = new Rectangle(4, 4);
        Assert.assertEquals(rectangle.area(), 16);
    }
}
