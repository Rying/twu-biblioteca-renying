package com.twu.biblioteca;

public class Book {

    private String year;
    private String authorname;
    private String bookName;
    private int numLeft;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (!authorname.equals(book.authorname)) return false;
        if (!bookName.equals(book.bookName)) return false;
        if (!year.equals(book.year)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = year.hashCode();
        result = 31 * result + authorname.hashCode();
        result = 31 * result + bookName.hashCode();
        return result;
    }

    public Book(String bookName, String authorName, String year, int numLeft) {
        this.bookName = bookName;
        this.authorname = authorName;
        this.year = year;
        this.numLeft = numLeft;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorname;
    }

    public String getYear() {
        return year;
    }

    public String getDetail() {
        return bookName + '\t' + authorname + '\t' + year + '\n';
    }

    public int getNumLeft() {
        return numLeft;
    }

    public boolean checkOut() {
        if (numLeft > 0) {
            numLeft--;
            return true;
        } else
            return false;
    }

    public void returnBook() {
        numLeft++;
    }
}
