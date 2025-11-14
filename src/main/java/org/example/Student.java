package org.example;
import java.util.*;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Double> grades; // оценки по предметам

    public Student(String name, String group, int course, Map<String, Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (double grade : grades.values()) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void nextCourse() {
        this.course++;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }
    // Удаляет студентов со средним баллом < 3
    public static void removeLowGradeStudents(Set<Student> students) {
        students.removeIf(s -> s.getAverageGrade() < 3);
    }
    // Переводит студентов с средним баллом >= 3 на следующий курс
    public static void promoteStudents(Set<Student> students) {
        for (Student s : students) {
            if (s.getAverageGrade() >= 3) {
                s.nextCourse();
            }
        }
    }
    // Печатает имена студентов данного курса
    public static void printStudents(Set<Student> students, int course) {
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }
}
