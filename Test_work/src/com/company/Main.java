package com.company;

class Human {
    String name;
    String surname;
    int age;

    public Human() {}

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Человек: " +
                "имя: " + name +
                ", фамилия: " + surname +
                ", возраст: " + age + ".";
    }
}

public class Main {

    public static void main(String[] args) {

        Human firstHuman = new Human("Angela", "Luchkina", 20);

        System.out.println(firstHuman.toString());

    }
}