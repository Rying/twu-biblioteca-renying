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
    }

    @Test
    public void should_print_welcome_message() {
        assertThat(bibliotecaApp.getWelcomeMessage().equals("Welcome to Biblioteca!"), is(true));
    }

    @Test
    public void should_get_list_books() {
        bibliotecaApp.setBooks(books);
        List bookNames = new ArrayList();
        bookNames.add("book1");
        bookNames.add("book2");
        bookNames.add("book3");

        assertThat(bibliotecaApp.getListBooks().equals(bookNames), is(true));
    }

    @Test
    public void should_get_book_author_list() {
        bibliotecaApp.setBooks(books);
        List bookAuthors = new ArrayList();
        bookAuthors.add("name1");
        bookAuthors.add("name2");
        bookAuthors.add("name3");

        assertThat(bibliotecaApp.getBookAuthors().equals(bookAuthors), is(true));
    }
}
