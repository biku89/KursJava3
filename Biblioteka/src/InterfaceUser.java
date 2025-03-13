import exception.ItemAlredyBorrowExcpetion;
import exception.ItemArledyRetrunedException;
import exception.ItemNotFoundException;
import model.Book;
import model.Film;
import service.Library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUser {
    Scanner scanner = new Scanner(System.in);
    Library library = new Library();

    public InterfaceUser(Library library) {
        this.library = library;
    }

    public void showMenu() {

        while (true) {
            displayMenu();

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.println("Dostępna lista: ");
                        library.printAll();
                    }
                    case 2 -> {
                        System.out.println("Jaki tytuł chcesz wypożyczyć ?:");
                        String title = scanner.nextLine();
                        library.rentItem(title);

                    }
                    case 3 -> {
                        System.out.println("Podaj tytuł do zwrotu");
                        String title = scanner.nextLine();
                        library.returnItem(title);
                    }
                    case 4 -> {
                        System.out.println("Liczba książek : " + Book.getBookCount());
                        System.out.println("Liczba filmów : " + Film.getFilmCount());
                    }
                    case 5 -> {
                        System.out.println("Dostępna lista: ");
                        library.printAvailable();
                    }
                    case 0 -> {
                        System.out.println("Kończymy działanie programu");
                        return;
                    }
                    default -> System.err.println("Wprowadziłeś błędny znak");
                }

            } catch (ItemNotFoundException | ItemArledyRetrunedException | ItemAlredyBorrowExcpetion e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private void displayMenu() {
        System.out.println("1 - Dostępna lista ogólna filmów i książek");
        System.out.println("2 - Wpożyczenie");
        System.out.println("3 - Zwracanie");
        System.out.println("4 - Wyświetlenie liczby książek i filmów");
        System.out.println("5 - Wyświetlenie dostępnych książek i filmów do wypożyczenia");
        System.out.println("0 - Wyjście z programu");
        System.out.println("Wybierz opcję");
    }

}
