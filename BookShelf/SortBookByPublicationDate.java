package com.proftelran.Homework.BookShelf;

import java.util.Comparator;

public class SortBookByPublicationDate implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {

        return o1.getDateOfPublication().compareTo(o2.getDateOfPublication());
    }
}


