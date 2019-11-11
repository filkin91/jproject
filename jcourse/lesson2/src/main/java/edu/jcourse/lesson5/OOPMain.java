package edu.jcourse.lesson5;

public class OOPMain {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.name = "Billy";
//        dog.sayHello();
//
//        Cat cat = new Cat();
//        cat.name = "Kitty";
//        cat.sayHello();

        Animal animal = new Animal();
        animal.setName("Abstract Animal");
        animal.sayHello();

        Cat cat = new Cat();
        cat.setName("Pushok");
        cat.setAge(10);
        cat.sayHello();
        cat.printAge();


        Dog dog = new Dog();
        dog.setName("Sharik");
        dog.setAge(5);
        dog.sayHello();
        dog.printAge();


        System.out.println(animal);
        System.out.println(cat);




    }
    public static void test(Cat cat) {
        if (cat instanceof Animal) {}
    }
}

