package com.proftelran.Homework.StreamApiTest.Task1;

import java.util.Arrays;
import java.util.List;

public class Surnames {

    public static void main(String[] args) {
        List<String> surnames = Arrays.asList("Kovalchuk", "Sedrov", "Kaminovski", "Frodin", "Monki", "Kasperko", "Kovachich");
        surnames.stream().filter(x -> x.startsWith("K")).forEach(x -> System.out.println(x));
    }
}
