package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MainMenuTest {
    @Test
    public void should_get_menu_contents() {

        assertThat(MainMenu.menuContents(), is("1\tList Books\n" +
                "2\tQuit\n" +
                "3\tList Movies\n"));
    }

    @Test
    public void should_get_content() {

        assertThat(MainMenu.LIST.getContent(), is("List Books"));
    }

}