package com.proftelran.Homework.Solitaire;

public interface MyDeque<E> {
    void addToHead(Integer element);
    void addToTail(Integer element);
    boolean isEmpty();
    Integer removeHead();
    Integer removeTail();
    Integer peekHead();
    Integer peekTail();

}
