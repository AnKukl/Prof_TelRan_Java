package com.proftelran.Homework.StreamApiTest.Task4;

import java.util.Arrays;
import java.util.List;

public class AutoCheck {

    public static void main(String[] args) {
        Auto first = new Auto("1234", "white", "toyota", 400000, 30000);
        Auto second = new Auto("5678", "black", "toyota", 0, 18948);
        Auto third = new Auto("910AS", "green", "bmw", 100565, 30872);
        Auto forth = new Auto("D34FH7", "grey", "chevrolet", 40789, 23896);
        Auto fifth = new Auto("AJG46", "black", "volcwagen", 0, 12475);
        Auto sixth = new Auto("KUW923", "red", "linkoln", 238625, 41812);
        Auto seventh = new Auto("LFH27", "grey", "audi", 0, 32820);
        Auto eighth = new Auto("BUE92", "black", "subaru", 726789, 15609);
        Auto ninth = new Auto("2386NW", "dark-blue", "nissan", 56282, 37542);
        Auto tenth = new Auto("N37BE", "purple", "mercedes", 0, 40265);

        List<Auto> cars = Arrays.asList(first, second, third, forth, fifth, sixth, seventh, eighth, ninth, tenth);
        List<Auto> blackNewCars = cars.stream().filter(car -> "black".equals(car.getColor()) && car.getMileage() == 0).toList();
        System.out.println(blackNewCars);

        long countOfUniqueCars = cars.stream().filter(car -> car.getPrice() <= 50000 && car.getPrice() >= 30000)
                .map(car -> car.getCarBrand())
                .distinct().count();
        System.out.println(countOfUniqueCars);
    }
}
