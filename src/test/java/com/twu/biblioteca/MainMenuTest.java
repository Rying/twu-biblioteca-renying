package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MainMenuTest {
    @Test
    public void should_get_menu_content() {

        assertThat(MainMenu.menuContent(), is("1\tList Books\n"));
    }

}