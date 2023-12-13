package com.proftelran.Homework.StreamApiTest.Task3;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private int age;
    private List<Phone> listOfPhones = new ArrayList<>();

    public List<Phone> getListOfPhones() {
        return listOfPhones;
    }

    public void setListOfPhones(List<Phone> listOfPhones) {
        this.listOfPhones = listOfPhones;
    }

    public Customer(int id, String name, int age, Phone phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.listOfPhones.add(phone);
    }
    public Customer(int id, String name, int age, Phone phone1, Phone phone2) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.listOfPhones.add(phone1);
        this.listOfPhones.add(phone2);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", listOfPhones=" + listOfPhones +
                '}';
    }
}
