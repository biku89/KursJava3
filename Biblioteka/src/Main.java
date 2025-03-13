import model.Book;
import model.Film;
import service.Library;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java", "Tak", 466);
        Book book1 = new Book("Las", "Jan", 69);
        Film film = new Film("Moooovie", "Krzysztof", 120);
        //System.out.println(book.toString());
        Library library = new Library();
        library.addItem(book);
        library.addItem(film);
        //library.printAll();
        //System.out.println("Liczba książek : "  + model.Book.getBookCount());
        //System.out.println("Liczba filmów : " + model.Film.getFilmCount());

        InterfaceUser interfaceUser = new InterfaceUser(library);
        interfaceUser.showMenu();

    }
}