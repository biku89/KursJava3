package service;

import exception.ItemAlredyReturnedException;
import exception.ItemNotFoundException;
import model.LibraryItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    private final List<LibraryItem> items = new ArrayList<>();

    public Library() {

    }

    public void addItem(LibraryItem item) {
        this.items.add(item);
    }

    public void printAllTitle() {
        for (LibraryItem item : this.items) {
            System.out.println(item);
        }
    }

    public void printAvaiable() {
        for (LibraryItem item : this.items) {
            if (!item.isBorrowed()) {
                System.out.println(item);
            }
        }
    }

    public Optional<LibraryItem> findByTitle(String title) {
        return items.stream()
                .filter(item -> item.getTitle().equals(title))
                .findFirst();
    }

//    public void rentItem(String title) throws ItemNotFoundException {
//        LibraryItem item = this.findByTitle(title);
//        if (item != null){
//            this.findByTitle(title).returnItem();
//            System.out.println("Tytuł został przez Ciebie wypożyczony");
//        } else {
//            System.err.println("Błędna nazwa tytłu " + title);
//        }
//    }

    public void rentItem(String title) throws ItemNotFoundException {
        LibraryItem item = findByTitle(title)
                .orElseThrow(() -> new ItemNotFoundException("Nie znaleizonoi tytłu" + title)); //Wywołuje findBytitle który zwróci mi optionala
        item.borrowItem();
        }

    }
//    public void returnItem(String title) throws  ItemAlredyReturnedException{
//        Optional <LibraryItem> optionalItem = findByTitle(title); //TODO: przerób tak jak wyżej
//        if (optionalItem.isPresent()){
//            LibraryItem item = optionalItem.get();
//            if (item.isBorrowed()){
//                item.returnItem();
//                System.out.println("Tytuł został przez Ciebie zwrócony " + title);
//            }else {
//                System.err.println("Tytuł został już zwrócony " + title);
//            }
//        }else {
//            System.err.println("Błędna nazwa tytułu " + title);




