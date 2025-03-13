package service;

import exception.ItemArledyRetrunedException;
import exception.ItemNotFoundException;
import model.LibraryItem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void printAll() {
        for (LibraryItem item : items) {
            System.out.println(item);
        }
    }
    public void printAvailable() {
        for (LibraryItem item : items) {
            if (item.isBorrowed()){
                continue;
            }
            System.out.println(item);
        }
    }


    public LibraryItem findByTitle(String title){
        for (LibraryItem item : items){
            if (item.getTitle().equals(title)){
                return item;
            }
        }
        return null;
    }
    public void rentItem(String title) throws ItemNotFoundException {
        LibraryItem item = findByTitle(title); //Sprwadzam czy item nie zwróci mi nulla
        if (item != null){
            findByTitle(title).borrowItem();
            System.out.println("Tytuł został przez Ciebie wypożyczony");
        }else {
            throw new ItemNotFoundException("Tytuł nieznaleziony : " + title);

        }
    }

    public void returnItem(String title) throws ItemArledyRetrunedException {
        LibraryItem item = findByTitle(title);
        if (item != null){
            findByTitle(title).returnItem();
            System.out.println("Tytuł został przez Ciebie zwrócony");

        } else System.err.println("Błędna nazwa tytułu " + title );
    }
}



