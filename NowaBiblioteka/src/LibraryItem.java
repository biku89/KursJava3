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

    public void borrowItem(){
        if (this.isBorrowed){
            throw new ItemAlredyBorrowException("Element był już zwrócony ");
        }else {
            this.isBorrowed = true;
        }
    }

    public void returnItem()throws ItemAlredyReturnedException{
        if (!this.isBorrowed){
            throw new ItemAlredyReturnedException("Element był już zwrócny" + this.title);
        }else {
            this.isBorrowed = false;
        }
    }

    @Override
    public String toString() {
        return "Tytuł " + title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
