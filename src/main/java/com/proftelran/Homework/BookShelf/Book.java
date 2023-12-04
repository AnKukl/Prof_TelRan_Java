package com.proftelran.Homework.BookShelf;

public class Book  {
    private String name;
    private Author authorName;
    private int numberOfPages;
    private String dateOfPublication;
    private Publisher publisherName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public void setAuthorName(Author authorName) {
        this.authorName = authorName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public Publisher getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(Publisher publisherName) {
        this.publisherName = publisherName;
    }

    public Book(String name, Author authorName, int numberOfPages, String dateOfPublication, Publisher publisherName) {
        this.name = name;
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
        this.setDateOfPublication(dateOfPublication);
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return "Book {" +
                " name = '" + name + '\'' +
                ", authorName = " + authorName +
                ", numberOfPages = " + numberOfPages +
                ", dateOfPublication = " + getDateOfPublication() +
                ", publisherName = " + publisherName +
                " }\n";
    }

}
