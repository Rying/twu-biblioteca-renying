package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MovieTest {
    Movie movie;

    @Before
    public void setUp() throws Exception {
        movie = new Movie("movie1", "director1", "2011", 2, 1);
    }

    @Test
    public void should_get_movie_name() {

        assertThat(movie.getMovieName(), is("movie1"));
    }

    @Test
    public void should_get_movie_director() {
        assertThat(movie.getMovieDirector(), is("director1"));
    }

    @Test
    public void should_get_movie_year() {

        assertThat(movie.getMovieYear(), is("2011"));
    }

    @Test
    public void should_get_movie_rates() {

        assertThat(movie.getMovieRates(), is(2));
    }

    @Test
    public void should_get_movie_detail_info() {

        assertThat(movie.getDetail(), is("movie1\tdirector1\t2011\t2\n"));
    }

    @Test
    public void should_check_out_a_movie_exist() {

        assertThat(movie.checkOut(), is(true));
    }
}