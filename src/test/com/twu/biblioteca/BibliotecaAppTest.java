package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class BibliotecaAppTest {
    Book[] books = new Book[3];
    BibliotecaApp bibliotecaApp = new BibliotecaApp();

    @Before
    public void setUp() throws Exception {
        books[0] = new Book("book1", "name1", "2011");
        books[1] = new Book("book2", "name2", "2012");
        books[2] = new Book("book3", "name3", "2013");
        bibliotecaApp.setBooks(books);
    }

    @Test
    public void should_print_welcome_message() {
        assertThat(bibliotecaApp.getWelcomeMessage().equals("Welcome to Biblioteca!"), is(true));
    }

    @Test
    public void should_get_list_books() {
        List bookNames = new ArrayList();
        bookNames.add("book1");
        bookNames.add("book2");
        bookNames.add("book3");

        assertThat(bibliotecaApp.getListBooks().equals(bookNames), is(true));
    }

    @Test
    public void should_get_book_author_list() {
        List bookAuthors = new ArrayList();
        bookAuthors.add("name1");
        bookAuthors.add("name2");
        bookAuthors.add("name3");

        assertThat(bibliotecaApp.getBookAuthors().equals(bookAuthors), is(true));
    }

    @Test
    public void should_get_book_year_list() {
        List bookYears = new ArrayList();
        bookYears.add("2011");
        bookYears.add("2012");
        bookYears.add("2013");

        assertThat(bibliotecaApp.getBookYears().equals(bookYears), is(true));
    }

    @Test
    public void should_list_books_details() {
        String details = "book1\tname1\t2011\n" +
                "book2\tname2\t2012\n" +
                "book3\tname3\t2013\n";

        assertThat(bibliotecaApp.getBookDetails().equals(details), is(true));
    }

    @Test
    public void should_input_list_and_list_book_details() {

//        assertThat(, )
    }
}
