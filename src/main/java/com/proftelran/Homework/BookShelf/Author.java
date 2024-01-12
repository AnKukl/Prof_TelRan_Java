package com.proftelran.Homework.BookShelf;

public class Author implements Comparable<Author> {
    private String name;
    private String dateOfBirth;

    public Author(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

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

    @Override
    public String toString() {
        return "Author:" +
                name;
    }

    @Override
    public int compareTo(Author o) {
        return this.name.compareTo(o.name);
    }
}
