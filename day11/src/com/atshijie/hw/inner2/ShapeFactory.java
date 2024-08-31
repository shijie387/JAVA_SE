package com.atshijie.hw.inner2;
//（2）创建一个工厂`ShapeFactory`类 ，使用成员内部类实现不同的形状接口（如 Circle, Square, Triangle）。
//        ShapeFactory 应该有一个静态方法 `getShape(String type)`，根据类型返回相应的形状对象。
public class ShapeFactory {
    public static class Circle implements Shape{
        public void draw(){
            System.out.println("circle");
        };
    }
    public static class Square implements Shape{
        public void draw(){
            System.out.println("square");
        };
    }
    public static class Triangle implements Shape{
        public void draw(){
            System.out.println("triangle");
        };
    }
    public static Shape getShape(String type){
        switch (type){
            case "circle" :return new Circle();
            case "square": return new Square();
            case "triangle":return new Triangle();
            default: return null;
        }
    }
}
