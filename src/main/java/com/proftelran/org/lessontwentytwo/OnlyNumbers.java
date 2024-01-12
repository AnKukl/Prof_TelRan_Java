package com.proftelran.org.lessontwentytwo;

public class OnlyNumbers<T extends Number> { // наследники дженерика только числа

    private T number;

    public OnlyNumbers(T number) {
        this.number = number;
    }

    public void print(){
        System.out.println(number);
    }
}
