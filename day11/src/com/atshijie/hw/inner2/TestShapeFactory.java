package com.atshijie.hw.inner2;

public class TestShapeFactory {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();
    }
}
