package com.proftelran.Homework.SpeedRating;

import javax.swing.text.html.HTMLDocument;

public class Customiterator implements java.util.Iterator {
    private int[] integers;
    private int position;



    public Customiterator(int[] integers) {
        this.integers = integers;
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }



    @Override
    public boolean hasNext() {
        if (getPosition() == integers.length) {
            return false;
        } else return true;
    }

    @Override
    public Integer next() {
        if(getPosition() <= integers.length){
        return integers[position++];
        }
        else return null;
    }
}
