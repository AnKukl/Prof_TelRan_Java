package com.proftelran.org.lessoneone;

public class LessonOneApp {
    public static void main(String[] args) {
        Dog shepard = new Dog();
        shepard.setColor("White");
        shepard.setAge(30);
        shepard.setBreed("shepard");

        Dog angryDog = new Dog();
        angryDog.setBreed("yard");
        angryDog.setColor("Black");
        angryDog.setAge(10);

        Dog littleDog = new Dog("little Dog", "red");
        littleDog.setAge(5);
        littleDog.setWeight(300);
        Dog bigDog = new Dog("Big Dog", 20, "blue", 10 );

        System.out.println(shepard);
        System.out.println(angryDog);
        System.out.println(littleDog);
        System.out.println(bigDog);

        System.out.println("Color is " + shepard.getColor());


    }
}
