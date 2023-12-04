package com.proftelran.Homework.BookShelf;

import java.util.*;

public class BookShelfNewVersion {

    public static void main(String[] args) {
        Author author1 = new Author("Adam Mickiewicz", "24.12.1798");
        Author author2 = new Author("William Shakespeare", "03.05.1564");
        Publisher publisher1 = new Publisher("BookKeeper", "12.08.2014");
        Publisher publisher2 = new Publisher("Library #1", "03.03.1998");

        List<Book> bookShelf = new ArrayList<>(Arrays.asList(
                new Book("Romeo and Juliet", author2, 500, "2020.12.14", publisher2),
                new Book("Hamlet", author2, 315, "2004.10.21", publisher2),
                new Book("Pan Tadeusz", author1, 203, "2015.01.10", publisher1),
                new Book("Dziady", author1, 417, "2020.04.04", publisher1),
                new Book("Cymbeline", author2, 689, "1999.12.05", publisher2),
                new Book("The Tempest", author2, 235, "2018.07.22", publisher1),
                new Book("Konrad Wallenrod", author1, 379, "2002.04.15", publisher2)));
        System.out.println(bookShelf);
        action(bookShelf);

    }
    public static void action(List<Book> bookshelf) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ сортировки:\n 1.Author\n 2.Date\n 3.Publisher");
        String answer = scanner.nextLine().toLowerCase();
        if ("author".equals(answer) || "1".equals(answer)) {
            Collections.sort(bookshelf, Comparator.comparing(Book::getAuthorName));
            System.out.println("Result: " + bookshelf);

        } else if ("date".equals(answer) || "2".equals(answer)) {
            Collections.sort(bookshelf, Comparator.comparing(Book::getDateOfPublication));
            System.out.println("Result: " + bookshelf);
        } else if ("Publisher".equals(answer) || "3".equals(answer)) {
            Collections.sort(bookshelf, Comparator.comparing(Book::getPublisherName));
            System.out.println("Result: " + bookshelf);
        } else {
            System.out.println("Incorrect data.Try again");
            action(bookshelf);
        }
    }
}
