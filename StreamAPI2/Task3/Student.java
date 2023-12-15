package com.proftelran.Homework.StreamAPI2.Task3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private double rate;
    private boolean finished;
    private ClassType type;

    public Student() {
        this.name = "";
        this.rate = 0;
        this.finished = false;
        this.type = null;
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

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public ClassType getType() {
        return type;
    }

    public void setType(ClassType type) {
        this.type = type;
    }

    public static List<Student> generateStudents(ClassType type) {
        if (type == ClassType.FE) {
            List<Student> students = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                students.add(new FrontEndStudent("FrontEndStudent" + i, 4 + Math.random(), true));
            }
            return students;
        } else if (type == ClassType.BA) {
            List<Student> students = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                students.add(new BackEndStudent("BackEndStudent" + i, Math.random() + 4, true));
            }
            return students;
        } else if (type == ClassType.QA) {
            List<Student> students = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                students.add(new QAStudent("QAStudent" + i, Math.random() + 4, true));
            }
            return students;
        } else return null;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", type=" + type +
                '}';
    }
}
