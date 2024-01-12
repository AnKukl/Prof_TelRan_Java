package com.proftelran.org.lessontwentytwo;

public class GenericTestApp {

    public static void main(String[] args) {

        Test objectOne = new Test("Hello");
        System.out.println(objectOne.getObj());
        TetsInteger objectTwo = new TetsInteger(2);
        System.out.println(objectTwo.getObj());

        System.out.println();

        GenericTest<String> object = new GenericTest<>("Hello");
        System.out.println(object.getObj());
        GenericTest<Integer> object1 = new GenericTest<>(5);
        System.out.println(object1.getObj());

        System.out.println();

        GenericTestTwo<String, Integer> ObjectSix = new GenericTestTwo<>("Hello", 6);
        ObjectSix.print();

    }
}
