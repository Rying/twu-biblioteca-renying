package com.twu.biblioteca;

public class Book {

    private String year;
    private String authorname;
    private String bookName;

    public Book(String bookName, String authorName, String year) {
        this.bookName = bookName;
        this.authorname = authorName;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorname;
    }
}
