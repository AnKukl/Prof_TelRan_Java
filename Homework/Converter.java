package com.proftelran.Homework;

public interface Converter {
    default double converter(double eur) {
        return eur * 1.05504;
    }

}
