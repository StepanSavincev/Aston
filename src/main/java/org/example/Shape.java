package org.example;

public interface Shape { double calculateArea();

    double calculatePerimeter();
    default String getDescription() {
        return "Периметр: " + calculatePerimeter() + ", Площадь: " + calculateArea();
    }
}
class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String getDescription() {
        return super.getClass() + ", Цвет заливки: " + fillColor + ", Цвет границ: " + borderColor;
    }
}
class Rectangle implements Shape {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
    @Override
    public String getDescription() {
        return Shape.super.getDescription() + ", Цвет заливки: " + fillColor + ", Цвет границ: " + borderColor;
    }
}
class Triangle implements Shape {
    private double a, b, c;
    private String fillColor;
    private String borderColor;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    @Override
    public double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
    @Override
    public String getDescription() {
        return Shape.super.getDescription() + ", Цвет заливки: " + fillColor + ", Цвет границ: " + borderColor;
    }
}
