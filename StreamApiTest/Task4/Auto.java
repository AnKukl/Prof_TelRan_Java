package com.proftelran.Homework.StreamApiTest.Task4;

public class Auto {
    private String carNumber;
    private String color;
    private String carBrand;
    private int mileage;
    private int price;

    public Auto(String carNumber, String color, String carBrand, int mileage, int price) {
        this.carNumber = carNumber;
        this.color = color;
        this.carBrand = carBrand;
        this.mileage = mileage;
        this.price = price;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "carBrand='" + carBrand + '\'' +
                '}';
    }
}
