package model;

import exception.ItemAlredyBorrowExcpetion;
import exception.ItemArledyRetrunedException;

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

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Tytuł : " + title;
    }

    public void borrowItem(){
        if (isBorrowed){
            throw new ItemAlredyBorrowExcpetion("Element został już wypożyczony");
        }else {
            isBorrowed = true;
        }
    }
    public void returnItem() throws ItemArledyRetrunedException {
        if (!isBorrowed){
            throw new ItemArledyRetrunedException("Element był już zwrócony " + title);
        }else {
            isBorrowed = false;
        }
    }




}


