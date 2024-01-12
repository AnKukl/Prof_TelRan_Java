package com.proftelran.org.lessontwentytwo;

public class GenericTestTwo<T,U> {

    private T objectOne;
    private U objectTwo;

    public GenericTestTwo(T objectOne, U objectTwo) {
        this.objectOne = objectOne;
        this.objectTwo = objectTwo;
    }

    public void print(){
        System.out.println(objectOne);
        System.out.println(objectTwo);
    }

}
