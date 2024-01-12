package com.proftelran.Homework.StreamAPI2.Task3;

public class ProjectStudent {
    private String name;
    private double rate;
    private ClassType type;

    public ProjectStudent(String name, double rate, ClassType type) {
        this.name = name;
        this.rate = rate;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public ClassType getType() {
        return type;
    }

    public void setType(ClassType type) {
        this.type = type;
    }
}
