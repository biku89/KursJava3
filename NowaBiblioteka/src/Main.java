public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addItem(new Book("Las","Ciemny", 430));
        library.addItem(new Book("Koty","psy", 999));
        library.addItem(new Film("Za szybcy","Za wścielko", 69));
        library.printAllTitle();
        System.out.println("Liczba książek " + Book.getCountBook());
    }
}