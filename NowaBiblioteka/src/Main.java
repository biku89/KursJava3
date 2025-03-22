public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addItem(new Book("Las","Ciemny", 430));
        library.printAllTitle();
    }
}