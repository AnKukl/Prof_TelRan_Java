package com.proftelran.Homework.StreamApiTest.Task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ClientsApp {

    public static void main(String[] args) {
        Customer john = new Customer(1, "John", 35, new Phone(355704698, TypeOfPhone.Stationary), new Phone(567890345, TypeOfPhone.Mobile));
        Customer huan = new Customer(2, "Huan", 28, new Phone(355704697, TypeOfPhone.Stationary), new Phone(467890345, TypeOfPhone.Mobile));
        Customer rita = new Customer(3, "Rita", 69, new Phone(355704696, TypeOfPhone.Stationary), new Phone(967890345, TypeOfPhone.Mobile));
        Customer peggi = new Customer(4, "Peggi", 83, new Phone(367890345, TypeOfPhone.Mobile));
        List<Customer> customers = Arrays.asList(john, huan, rita, peggi);
        Customer oldestWithStationaryPhone = customers.stream()
                .filter(clients -> clients.getListOfPhones().stream().anyMatch(phone -> phone.getType().equals(TypeOfPhone.Stationary)))
                .max(Comparator.comparingInt(Customer::getAge)).orElse(null);
        System.out.println(oldestWithStationaryPhone);

    }
}
