package com.proftelran.Homework.Solitaire;

import java.util.Arrays;

public class MyArrayDeque<E> implements MyDeque {
    private static final int DEFAULT_CAPACITY = 10;


    private Integer[] elements;
    private int headIndex = 0;
    private int tailIndex = 0;
    private int countOfElements = 0;

    public MyArrayDeque() {
        elements = new Integer[DEFAULT_CAPACITY];
    }




    public void addToHead(Integer element) {
        if (countOfElements == elements.length) {
            grow( );
        }
        elements[headIndex] = element;
        headIndex = (headIndex + 1) % elements.length;
        countOfElements++;
    }

    @Override
    public void addToTail(Integer element) {
        if (countOfElements == elements.length) {
            grow();
        }
        tailIndex = (tailIndex - 1 + elements.length) % elements.length;
        elements[tailIndex] = element;
        countOfElements++;
    }

    @Override
    public boolean isEmpty() {
        return countOfElements == 0;
    }

    @Override
    public Integer removeHead() {
        if (isEmpty()) {
            return null;
        }
        headIndex = (headIndex - 1 + elements.length) % elements.length;
        Integer removed = elements[headIndex];
        elements[headIndex] = null;
        countOfElements--;
        return removed;
    }

    @Override
    public Integer removeTail() {
        if (isEmpty()) {
            return null;
        }
        Integer removed = elements[tailIndex];
        elements[tailIndex] = null;
        tailIndex = tailIndex + 1 % elements.length;
        countOfElements--;
        return removed;
    }

    @Override
    public Integer peekHead() {
        if (isEmpty()) {
            return null;
        }
        return elements[headIndex];
    }

    @Override
    public Integer peekTail() {
        if (isEmpty()) {
            return null;
        }
        int tail = (tailIndex - 1 + elements.length) % elements.length;
        return elements[tail];
    }

    private void grow() {
        headIndex = elements.length;
        int newCapacity = (int) (elements.length * 1.5);
        final Integer[] newElements = elements = Arrays.copyOf(elements, newCapacity);

        elements = newElements;

    }

    @Override
    public String toString() {
        Integer[] numbers = new Integer[countOfElements];
        int i = 0;
        for (Integer elm: elements){
            if (elm != null){
                numbers[i++] = elm;
            }
        }
       return Arrays.toString(numbers);
    }
}



