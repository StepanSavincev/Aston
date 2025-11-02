package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        dog1.run(150);
        dog1.swim(5);
        cat1.run(100);
        cat1.swim(10);
        Cat[] cats = new Cat[3];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
            cats[i].setFoodBowl(10);
            cats[i].eat(5);
            System.out.println("Кот " + (i + 1) + " сытый: " + cats[i].isFull());
        }
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
    }
}