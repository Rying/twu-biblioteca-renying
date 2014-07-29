package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    private Book[] books;

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public String getWelcomeMessage() {

        return "Welcome to Biblioteca!";
    }

    public List getListBooks() {
        List bookNames = new ArrayList();
        for (Book book : books) {
            bookNames.add(book.getBookName());
        }
        return bookNames;
    }

    public List getBookAuthors() {
        List authorNames = new ArrayList();
        for (Book book : books) {
            authorNames.add(book.getAuthorName());
        }
        return authorNames;
    }

    public List getBookYears() {
        List bookYears = new ArrayList();
        for (Book book : books) {
            bookYears.add(book.getYear());
        }
        return bookYears;
    }

    public String getBookDetails() {
        String details = "";

        for (Book book : books) {
            details += book.getDetail();
        }
        return details;
    }
}
