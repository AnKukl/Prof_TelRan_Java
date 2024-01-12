package com.proftelran.org.lessontwentytwo;

public class OnlyNumberTest {

    public static void main(String[] args) {
        OnlyNumbers<Integer> integerOnlyNumbers = new OnlyNumbers<>(1);
        OnlyNumbers numbers1 = new OnlyNumbers<>(4);
        OnlyNumbers numbers2 = new OnlyNumbers<>(2L);
//        OnlyNumbers numbers3 = new OnlyNumbers<>("A"); compile error
    }
}
