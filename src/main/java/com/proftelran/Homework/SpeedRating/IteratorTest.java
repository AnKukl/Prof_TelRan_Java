package com.proftelran.Homework.SpeedRating;

public class IteratorTest {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8};
        Customiterator customiterator = new Customiterator(numbers);


        while(customiterator.hasNext()){
            int number = customiterator.next();
            System.out.println(number);
        }
    }
}
