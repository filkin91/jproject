package edu.jcourse.lesson5;

public class Animal {
//    public String name;
//    public int age;
//    public String category;

    private String name;
    private int age;
    private String type;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Animal");
    }

    public void printAge() {
        System.out.println(age);
    }

    @Override
    public String toString() {
        return getName();
    }
}


