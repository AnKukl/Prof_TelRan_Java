package com.proftelran.org.lessonten;

import java.util.HashSet;
import java.util.Set;

public class CompareObjectExample {
    public static void main(String[] args) {
        Cat catOne = new Cat();
        Cat catTwo = new Cat();

        boolean equals = catOne.equals(catTwo);  // false
        boolean equals1 = catOne.equals(catOne); // true
        //catTwo.equals(catOne);

        Set<Cat> catSet = new HashSet<>();
        catSet.add(catOne);
        catSet.add(catTwo);
    }
}
