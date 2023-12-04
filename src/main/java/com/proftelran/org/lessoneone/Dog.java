package com.proftelran.org.lessoneone;

public class Dog {

    private String breed;
    private int age;
    private String color;
    private int weight;

    public Dog() {

    }

    public Dog(String breed, int age, String color, int weight) {
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public Dog(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            return;
        }
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}


