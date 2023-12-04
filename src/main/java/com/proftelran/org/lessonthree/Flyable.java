package com.proftelran.org.lessonthree;

public interface Flyable {
    void fly();

    default void canFly() {
        System.out.println("");
    }
}
