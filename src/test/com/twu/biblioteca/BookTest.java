package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BookTest {
    Book book;

    @Before
    public void setUp() throws Exception {
        book = new Book("book1", "name1", "2011");
    }

    @Test
    public void should_get_book_name() {

        assertThat(book.getBookName().equals("book1"), is(true));
    }

    @Test
    public void should_get_book_author() {

        assertThat(book.getAuthorName().equals("name1"), is(true));
    }

    @Test
    public void should_get_book_year() {

        assertThat(book.getYear().equals("2011"), is(true));
    }

    @Test
    public void should_get_detail() {

        assertThat(book.getDetail().equals("book1\tname1\t2011\n"), is(true));
    }
}