public class LibraryItem {
    private String title;
    private boolean isBorrowed;

    public LibraryItem(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }




    @Override
    public String toString() {
        return "Tytuł " + title;
    }
}
