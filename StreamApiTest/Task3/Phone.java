package com.proftelran.Homework.StreamApiTest.Task3;

public class Phone {
    private int number;
    private TypeOfPhone type;

    public Phone(int number, TypeOfPhone type) {
        this.number = number;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public TypeOfPhone getType() {
        return type;
    }

    public void setType(TypeOfPhone type) {
        this.type = type;
    }
}
