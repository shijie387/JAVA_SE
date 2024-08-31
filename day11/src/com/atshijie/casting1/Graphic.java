package com.atshijie.casting1;

public abstract class Graphic {

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return area() + ";" + perimeter();
    }
}