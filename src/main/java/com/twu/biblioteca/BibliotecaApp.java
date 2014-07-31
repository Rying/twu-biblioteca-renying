package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    private List<Book> books;
    private List<Movie> movies;

    public BibliotecaApp() {
        books = new ArrayList<Book>();
        movies = new ArrayList<Movie>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
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
        mainMenuIterms += MainMenu.menuContents();
        return mainMenuIterms;
    }

    public String chooseOption(int input) {
        String option;
        switch (input) {
            case 1:
                option = getBookDetails();
                break;
            case 2:
                option = MainMenu.QUIT.getContent();
                break;
            case 3:
                option = getMovieDetails();
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
                    return "Thank you! Enjoy the book.";
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

    public String getMovieDetails() {
        String movieDetails = "";

        for (Movie movie : movies) {
            movieDetails += movie.getDetail();
        }
        return movieDetails;
    }

    public String checkOut(Movie coMovie) {
        for (Movie movie : movies) {
            if(coMovie.equals(movie)){
                if(movie.checkOut())
                    return "Thank you! Enjoy the movie.";
            }
        }
        return "That movie is not available.";
    }
}
