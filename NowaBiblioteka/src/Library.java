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

    public void rentItem(String title){
        LibraryItem item = this.findByTitle(title);
        if (item != null){
            this.findByTitle(title).borrowItem();
            System.out.println("Tytuł został przez Ciebie wypożyczony");
        } else {
            System.err.println("Błędna nazwa tytłu " + title);
        }
    }

    public void returnItem(String title){
        LibraryItem item = this.findByTitle(title);
        if (item != null){
            this.findByTitle(title).borrowItem();
            System.out.println("Tytuł został już zwrócomy");
        }else {
            System.err.println("Błędna nazwa tytułu " + title);
        }
    }
}
