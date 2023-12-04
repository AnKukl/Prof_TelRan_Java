package com.proftelran.org.lessonfour;

public class ParentTest {
    public static void main(String[] args) {
        Parent parent;

        //parent = ChildOne.create();
        parent = new ChildOne();
        parent.printGreetings();

        parent = new ChildTwo();
        parent.printGreetings();

        parent = new MiddleChild();
        parent.printGreetings();
        parent.printThanks();
        parent.printWishes();
        parent.name = "Alex";

        System.out.println(ChildTwo.HELLO);
        ChildTwo.printHello();

        ChildTwo childTwo = new ChildTwo();
        childTwo.printAll();
    }
}
