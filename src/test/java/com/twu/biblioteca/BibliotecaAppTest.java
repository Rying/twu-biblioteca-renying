package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class BibliotecaAppTest {
    BibliotecaApp bibliotecaApp = new BibliotecaApp();
    Book book = new Book("book1", "name1", "2011", 1);

    @Before
    public void setUp() throws Exception {
        bibliotecaApp.addBook(new Book("book1", "name1", "2011", 1));
        bibliotecaApp.addBook(new Book("book2", "name2", "2012", 1));
        bibliotecaApp.addBook(new Book("book3", "name3", "2013", 1));
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
    public void should_only_get_list_books_option_for_now() {

        assertThat(bibliotecaApp.getMainMenu(), is("You can choose a option\n" +
                "1\tList Books\n"));
    }

    @Test
    public void should_list_books_when_option_is_1() {
        String details = "book1\tname1\t2011\n" +
                "book2\tname2\t2012\n" +
                "book3\tname3\t2013\n";

        assertThat(bibliotecaApp.chooseOption(1), is(details));
    }

    @Test
    public void should_give_notice_when_option_is_invalid() {

        assertThat(bibliotecaApp.chooseOption(3), is("Select a valid option!"));
    }

    @Test
    public void should_return_quit_when_option_is_2() {

        assertThat(bibliotecaApp.chooseOption(2), is("quit"));
    }

    @Test
    public void should_check_out_book_will_not_appear_in_biblioteca() {
        bibliotecaApp.checkOutBook(new Book("book1", "name1", "2011", 1));
        String details = "book2\tname2\t2012\n" +
                "book3\tname3\t2013\n";

        assertThat(bibliotecaApp.getBookDetails(), is(details));
    }

    @Test
    public void should_user_get_check_out_success_message_while_the_book_available() {

        assertThat(bibliotecaApp.checkOutBook(book), is("Thank you! Enjoy the book"));
    }

    @Test
    public void should_user_get_check_out_unsuccess_message_while_the_book_not_available() {
        bibliotecaApp.checkOutBook(book);

        assertThat(bibliotecaApp.checkOutBook(book), is("That book is not available."));
    }

    @Test
    public void should_return_book_appear_in_the_bibioteca() {
        String details = "book1\tname1\t2011\n" +
                "book2\tname2\t2012\n" +
                "book3\tname3\t2013\n";

        bibliotecaApp.checkOutBook(book);
        bibliotecaApp.returnBook(book);

        assertThat(bibliotecaApp.getBookDetails(), is(details));
    }

    @Test
    public void should_show_success_return_message_if_return_success() {

        assertThat(bibliotecaApp.returnBook(book), is("Thank you for returning the book."));
    }

    @Test
    public void should_show_unsuccess_return_message_if_return_faild() {
        Book bookNotExit = new Book("book4", "name4", "2014", 1);
        
        assertThat(bibliotecaApp.returnBook(bookNotExit), is("That is not a valid book to return."));
    }
}
