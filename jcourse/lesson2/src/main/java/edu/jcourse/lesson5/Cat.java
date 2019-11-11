package edu.jcourse.lesson5;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void sayHello() {
        System.out.println(getName() + " says Meow");
    }

//    public void printAge() {
//        System.out.println(age);
//    }

}
