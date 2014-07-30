package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    private List<Book> books;

    public BibliotecaApp() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
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
            if (book.getNumLeft() > 0)
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

    public String checkOutBook(Book coBook) {
        for (Book book : books) {
            if (coBook.equals(book)) {
                if (book.checkOut())
                    return "Thank you! Enjoy the book";
            }
        }
        return "That book is not available.";
    }

    public String returnBook(Book reBook) {
        for (Book book : books) {
            if(reBook.equals(book)){
                book.returnBook();
                return "Thank you for returning the book.";
            }
        }
        return "That is not a valid book to return.";
    }

}
