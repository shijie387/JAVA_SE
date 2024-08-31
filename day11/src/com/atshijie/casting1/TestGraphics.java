package com.atshijie.casting1;

public class TestGraphics {
    public static void main(String[] args) {
        Graphic[] g = new Graphic[3];
        g[0] = new Circle(1.2);
        g[1] = new Rectangle(1,2);
        g[2] = new Triangle(3,5,4);

        System.out.println("before");
        for (Graphic graphic : g) {
            System.out.println("graphic = " + graphic);
        }
        System.out.println("after");
        for (int i = 1; i < g.length; i++) {
            for (int j = 0; j < g.length-i; j++) {
                if (g[j].area()>g[j+1].area()){
                    Graphic temp = g[j];
                    g[j] = g[j+1];
                    g[j+1]= temp;
                }
            }
        }
        for (Graphic graphic : g) {
            System.out.println("graphic = " + graphic);
        }
    }
}
