package com.twu.biblioteca;

public class Movie {

    private int rates;
    private String year;
    private String director;
    private String name;
    private int numleft;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;

        Movie movie = (Movie) o;

        if (rates != movie.rates) return false;
        if (!director.equals(movie.director)) return false;
        if (!name.equals(movie.name)) return false;
        if (!year.equals(movie.year)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rates;
        result = 31 * result + year.hashCode();
        result = 31 * result + director.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    public Movie(String name, String director, String year, int rates, int numleft) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.rates = rates;
        this.numleft = numleft;
    }

    public String getMovieName() {
        return name;
    }

    public String getMovieDirector() {
        return director;
    }

    public String getMovieYear() {
        return year;
    }

    public int getMovieRates() {
        return rates;
    }

    public String getDetail() {

        return name + "\t" + director + "\t" + year + "\t" + rates + "\n";
    }

    public boolean checkOut() {
        if (numleft > 0) {
            numleft--;
            return true;
        } else
            return false;
    }
}
