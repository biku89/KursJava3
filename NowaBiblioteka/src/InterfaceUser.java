import java.util.Scanner;

public class InterfaceUser {
    Scanner scanner;
    Library library;

    public InterfaceUser(Library library) {
        this.scanner = new Scanner(System.in);
        this.library = library;

    }

    public void showMenu(){
        while (true){
            displayMenu();

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice){
                    case 0 ->{
                        System.out.println("Kończymy działanie programu");
                        return;
                    }
                    case 1 ->{
                        System.out.println("Dostępna lista: ");
                        library.printAllTitle();
                    }
                    case 2 ->{
                        System.out.println("Jaki tytuł chcesz wypożyczyć ? ");
                        String title = scanner.nextLine();
                        this.library.rentItem(title);
                    }
                    case 3 ->{
                        System.out.println("Podaj tytuł do zwortu");
                        String title = scanner.nextLine();
                        library.returnItem(title);
                    }
                    case 4 -> {
                        System.out.println("Liczba książek: " + Book.getCountBook());
                        System.out.println("Liczba Filmów: " + Film.getCountFilm());
                    }
                    case 5 ->{
                        System.out.println("Dostpęna lista tytułów do wypożyczenia");
                        library.printAvaiable();
                    }
                    default -> System.err.println("Wprowadziłeś błędny znak");
                }
            }catch (ItemAlredyReturnedException | ItemAlredyBorrowException e){
                System.err.println();
            }
        }
    }

    private void displayMenu() {
        System.out.println("Wybierz jedną z opcji");
        System.out.println("1 - Wyświetl zawartość biblioteki");
        System.out.println("2 - Wypożyczenie");
        System.out.println("3 - Zwrot");
        System.out.println("4 - Liczba książek i filmów");
        System.out.println("5 - Lista dostępnych tytułów");
    }
}
