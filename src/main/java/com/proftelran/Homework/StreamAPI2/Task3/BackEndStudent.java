package com.proftelran.Homework.StreamAPI2.Task3;

public class BackEndStudent extends Student {
    public BackEndStudent(String name, double rate, boolean finished) {
        this.setName(name);
        this.setRate(rate);
        this.setFinished(finished);
        this.setType(ClassType.BA);
    }
}
