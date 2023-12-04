package com.proftelran.org.lessontwo;

public class LessonTwoApp {
    public static void main(String[] args) {
        Cat cat = new Cat(15);
        cat.voice();
        cat.setColor("Red");

        WildCat wildCat = new WildCat(10);
        wildCat.voice();
        wildCat.setColor("White");

        LittleCat littleCat = new LittleCat(5);
        littleCat.voice();
        littleCat.jump();
        littleCat.setColor("Black");

        LittleCat littleCatTwo = new LittleCat(12);
        littleCatTwo.voice();
        littleCatTwo.setColor("Yellow");

        SeaCat seaCat = new SeaCat(6);
        seaCat.voice();
        seaCat.setColor("Blue");
        seaCat.setHeight(20);
        seaCat.swim();

        System.out.println("Cat color = " + cat.getColor() + " age = " + cat.getAge());
        System.out.println("WildCat color = " + wildCat.getColor());
        System.out.println("LittleCat color = " + littleCat.getColor());
        System.out.println("LittleCatTwo color = " + littleCatTwo.getColor());
        System.out.println("SeaCat color = " + seaCat.getColor());


    }
}
