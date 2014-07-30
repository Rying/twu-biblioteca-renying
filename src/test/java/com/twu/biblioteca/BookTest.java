package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BookTest {
    Book book;

    @Before
    public void setUp() throws Exception {
        book = new Book("book1", "name1", "2011", 1);
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

    @Test
    public void should_get_number_of_the_book() {

        assertThat(book.getNumLeft(), is(1));
    }

    @Test
    public void should_check_out_one_book_number_of_the_book_less_one() {
        book.checkOut();
        assertThat(book.getNumLeft(), is(0));
    }

    @Test
    public void should_return_book_number_added_one() {
        book.returnBook();
        assertThat(book.getNumLeft(), is(2));
    }
}