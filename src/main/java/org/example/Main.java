package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> grades1 = Map.of("Литература", 4.0, "Физ-ра", 3.5);
        Map<String, Double> grades2 = Map.of("Литература", 2.0, "Физ-ра", 2.5);

        Set<Student> students = new HashSet<>();
        students.add(new Student("Иванов", "121", 1, grades1));
        students.add(new Student("Петров", "415", 1, grades2));

        Student.removeLowGradeStudents(students);
        Student.promoteStudents(students);
        Student.printStudents(students, 2);
        PhoneBook phoneBook = new PhoneBook();

        // Добавляем записи в телефонный справочник
        phoneBook.add("Иванов", "89001234567");
        phoneBook.add("Петров", "89001234577");
        phoneBook.add("Александров", "89001234587");
        phoneBook.add("Сидоров", "89001234597");
        phoneBook.add("Петров", "89001234507");

        // Получаем номера по фамилии
        System.out.println("Номера телефонов для Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Номера телефонов для Петрова: " + phoneBook.get("Петров"));

        // Вывод всех записей (для проверки)
        System.out.println("\nВсе записи в телефонном справочнике:");
        phoneBook.printAll();
    }
}