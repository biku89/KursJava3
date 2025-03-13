package model;

public class Book extends LibraryItem {
    private String author;
    private int pages;
    static int bookCount = 0;

    public Book(String title, String author, int pages) {
        super(title);
        this.author = author;
        this.pages = pages;
        bookCount++;
    }

    public static int getBookCount() {
        return bookCount;
    }

    @Override
    public String toString() {
        return super.toString() + " Autor: " + author + " " + "Liczba stron: " + pages;
    }
}
