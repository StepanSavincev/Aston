package org.example;

public class Animal {
    private static int animalCount = 0;
    public Animal() {
        animalCount++;
    }
    public static int getAnimalCount() {
        return animalCount;
    }
}
