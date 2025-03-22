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
}
