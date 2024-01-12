package com.proftelran.Homework.StreamAPI2.Task3;

public class FrontEndStudent extends Student {
    public FrontEndStudent(String name, double rate, boolean finished) {
        this.setName(name);
        this.setRate(rate);
        this.setFinished(finished);
        this.setType(ClassType.FE);
    }
}
