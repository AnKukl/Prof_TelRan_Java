package com.proftelran.Homework.BookShelf;

public class Publisher implements Comparable<Publisher>{
    private String name;
    private String dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Publisher(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Publisher:" +
                 name;
    }

    @Override
    public int compareTo(Publisher o) {
        return this.name.compareTo(o.name);
    }
}
