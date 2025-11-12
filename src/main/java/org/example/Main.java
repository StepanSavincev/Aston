package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Факториал 5: " + factorial(5));
        System.out.println("Площадь треугольника (основание 5, высота 4): " + triangleArea(5, 4));

        runCalculator();

        System.out.println("5 больше 7? " + isGreater(5, 7));
        System.out.println("7 больше 5? " + isGreater(7, 5));
    }
    //1 Факториал
    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным.");
        }
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    //2 Площадь треугольника
    public static double triangleArea(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Основание и высота должны быть положительными.");
        }
        return (base * height) / 2;
    }

    //3 Калькулятор
    private static void runCalculator() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите операцию (+, -, *, /):");
        String operation = in.nextLine().trim();

        System.out.println("Введите первое целое число:");
        int number1 = in.nextInt();

        System.out.println("Введите второе целое число:");
        int number2 = in.nextInt();

        switch (operation) {
            case "+":
                System.out.println("Результат: " + (number1 + number2));
                break;
            case "-":
                System.out.println("Результат: " + (number1 - number2));
                break;
            case "*":
                System.out.println("Результат: " + (number1 * number2));
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено.");
                } else {
                    System.out.println("Результат: " + (number1 / number2));
                }
                break;
            default:
                System.out.println("Ошибка: неизвестная операция.");
                break;
        }
    }

    //4 какое число больше
    public static boolean isGreater(int a, int b) {
        return a > b;
    }
}