package org.example;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull = false;
    private int foodBowl = 0;
    public Cat() {
        catCount++;
    }
    public static int getCatCount() {
        return catCount;
    }
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать больше 200 м.");
        }
    }
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }
    public void eat(int foodAmount) {
        if (foodAmount <= foodBowl && foodAmount > 0) {
            foodBowl -= foodAmount;
            isFull = true;
            System.out.println("Кот поел и теперь сыт.");
        } else if (foodAmount > foodBowl) {
            System.out.println("Недостаточно еды в миске для кота.");
        } else {
            System.out.println("Кот не может поесть отрицательное количество еды.");
        }
    }
    public void setFoodBowl(int foodBowl) {
        if (foodBowl >= 0) {
            this.foodBowl = foodBowl;
            System.out.println("В миске теперь " + this.foodBowl + " еды.");
        } else {
            System.out.println("Количество еды в миске не может быть отрицательным.");
        }
    }
    public boolean isFull() {
        return isFull;
    }
}
