package org.example;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        printThreeWorld();
        checkSumSign();
        printColor();
        compareNumbers();
        checkSumInRange();
        checkPositiveOrNegative();
        System.out.println(isNegative(-2));
        printStringMultipleTimes("Строка", 5);
        System.out.println(isLeapYear(2001));
        invertArray(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0});
        fillArrWithSequence();
        multiplyLessThanSix();
        fillDiagonalArray();
        int[] resultArray = createArray(5, 10);
        System.out.println(Arrays.toString(resultArray));
    }
    // 1
    public static void printThreeWorld() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    // 2
    public static void checkSumSign() {
        int a = 3;
        int b = 5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    // 3
    public static void printColor() {
        System.out.println("\nЗадание 3:");
        int value = 3;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4
    public static void compareNumbers() {
        int a = 3;
        int b = 5;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    // 5
    public static void checkSumInRange() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();
        int res;
        res = num1 + num2;
        if (res >= 10 && res <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    // 6
    public static void checkPositiveOrNegative() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num1 = scan.nextInt();
        if (num1 >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // 7
    public static boolean isNegative(int number) {
        return number < 0;}

    // 8
    public static void printStringMultipleTimes(String str, int times){
        if (times < 0) {
            System.out.println("Количество повторений не может быть отрицательным.");
            return;
        }
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    // 9
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 10
    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
            System.out.print(arr[i] + " ");
        }
    }

    // 11
    public static void fillArrWithSequence(){
        int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i]= i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    // 12
    public static void multiplyLessThanSix() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 11};
        for (int i =0; i < arr.length; i++) {
            if (arr[ i ] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    // 13
    public static void fillDiagonalArray() {
        int size = 4;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 14
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}