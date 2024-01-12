package com.proftelran.org.lessontwentytwo;

public class GenericTest<T> {

    private T obj;

    private String name;
    public GenericTest(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
