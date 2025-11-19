package org.example;

public class MainShapes {
    public static void main(String[] args) {

        Shape circle = new Circle(5, "Красный", "Черный");
        Shape rectangle = new Rectangle(4, 6, "Зеленый", "Синий");
        Shape triangle = new Triangle(3, 4, 5, "Желтый", "Фиолетовый");

        System.out.println("Круг: " + circle.getDescription());
        System.out.println("Прямоугольник: " + rectangle.getDescription());
        System.out.println("Треугольник: " + triangle.getDescription());
    }
}
