package service;

import exception.ItemAlredyReturnedException;
import exception.ItemNotFoundException;
import model.LibraryItem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<LibraryItem> items = new ArrayList<>();

    public Library(){

    }

    public void addItem(LibraryItem item){
        this.items.add(item);
    }

    public void printAllTitle(){
        for (LibraryItem item : this.items){
            System.out.println(item);
        }
    }
    public void printAvaiable(){
        for (LibraryItem item : this.items){
            if (!item.isBorrowed()){
                System.out.println(item);
            }
        }
    }

    public LibraryItem findByTitle(String title) {
        for (LibraryItem item : this.items) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }

    public void rentItem(String title) throws ItemNotFoundException {
        LibraryItem item = this.findByTitle(title);
        if (item != null){
            this.findByTitle(title).returnItem();
            System.out.println("Tytuł został przez Ciebie wypożyczony");
        } else {
            System.err.println("Błędna nazwa tytłu " + title);
        }
    }

    public void returnItem(String title) throws ItemAlredyReturnedException {
        LibraryItem item = this.findByTitle(title);
        if (item != null){
            this.findByTitle(title).borrowItem();
            System.out.println("Tytuł został pomyślnie zwrócony");
        }else {
            System.err.println("Błędna nazwa tytułu " + title);
        }
    }
}
