package ru.hse.lab1.second;

/**
 * @author Новиков А.Н.
 * @version 1.0
 * @since 2026
 */

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Привет, меня зовут " + name);
    }
}
