package com.proftelran.Homework.HW_ATM;

public interface Converter {
    default double converter(double eur) {
        return eur * 1.05504;
    }

}
