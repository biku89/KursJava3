import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int SIZE = 5;
        char board[][] = new char[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = 'o';
                System.out.print(board[i][j] + " ");

            }
            System.out.println();
        }

        int shipRow = random.nextInt(SIZE);
        int shopCol = random.nextInt(SIZE);
        board[shipRow][shopCol] = 'S';

        boolean gameStart = false;

        while (!gameStart) {
            System.out.println("Strzał w tabicę od 0 do 4");

            System.out.println("Podaj wiersz");
            int targetRow = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Podaj kolumnę");
            int targetColumn = scanner.nextInt();
            scanner.nextLine();

            if (board[targetRow][targetColumn] == 'S') {
                System.out.println("Trafiony zatopiony");
                board[targetRow][targetColumn] = 'X';
                gameStart = true;
            } else {
                System.out.println("Pudło");
                board[targetRow][targetColumn] = 'M';

            }
            showBoard(board, SIZE);

        }

    }//todo: przenieś do metod wykonane strzały.

    public static void showBoard(char[][] board, int SIZE) {
        System.out.println("Aktualna plansza:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 'S') {
                    System.out.print("o ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
