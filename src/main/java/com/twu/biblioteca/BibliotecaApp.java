package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    private List<Book> books;

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getWelcomeMessage() {

        return "Welcome to Biblioteca!";
    }

    public List getListBooks() {
        List bookNames = new ArrayList();
        for (int index = 0; index < books.size(); index++) {
            bookNames.add(books.get(index).getBookName());
        }
        return bookNames;
    }

    public List getBookAuthors() {
        List authorNames = new ArrayList();
        for (int index = 0; index < books.size(); index++) {
            authorNames.add(books.get(index).getAuthorName());
        }
        return authorNames;
    }

    public List getBookYears() {
        List bookYears = new ArrayList();
        for (int index = 0; index < books.size(); index++) {
            bookYears.add(books.get(index).getYear());
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

    public String getMainMenu() {
        String mainMenuIterms = "You can choose a option\n";
        mainMenuIterms += MainMenu.menuContent();
        return mainMenuIterms;
    }

    public String chooseOption(int input) {
        String option;
        switch (input) {
            case 1:
                option = getBookDetails();
                break;
            case 2:
                option = "quit";
                break;
            default:
                option = "Select a valid option!";
                break;
        }
        return option;
    }

    public void checkOutBook(Book coBook) {
        for (int index = 0;index<books.size();index++) {
            if (coBook.equals(books.get(index)))
                books.remove(index);
        }
    }
}
