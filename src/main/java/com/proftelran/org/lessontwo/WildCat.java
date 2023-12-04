package com.proftelran.org.lessontwo;

public class WildCat extends Cat {
    public WildCat(int age) {
        super(age);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("AAAAAAAAAAA!!!!!");
    }

    public void print() {
    }
}

