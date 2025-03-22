public class Book extends LibraryItem {
    private String author;
    private int page;
    private static int countBook;

    public Book(String title, String author, int page) {
        super(title);
        this.author = author;
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public static int getCountBook() {
        return countBook;
    }

    public static void setCountBook(int countBook) {
        Book.countBook = countBook;
    }
}

