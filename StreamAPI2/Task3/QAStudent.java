package com.proftelran.Homework.StreamAPI2.Task3;

public class QAStudent extends Student {
    public QAStudent(String name, double rate, boolean finished) {
        this.setName(name);
        this.setRate(rate);
        this.setFinished(finished);
        this.setType(ClassType.QA);
    }
}
