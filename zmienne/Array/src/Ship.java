import java.util.Random;
import java.util.Scanner;

public class Ship {
    int size = 5;
    char[][] board = new char[size][size];
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int howManyShots = 0;
    boolean gameStart = false;

    public void createBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = 'o';
            }
        }
    }

    public void addShip() {
        int shipRow, shipColumn;
        shipRow = random.nextInt(5);
        shipColumn = random.nextInt(5);
        board[shipRow][shipColumn] = 'S';
    }

    public void showBoard() {
        System.out.println("     0 1 2 3 4");
        System.out.println("    ----------");

        for (int i = 0; i < size; i++) {
            System.out.printf("%2d | ", i);
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 'S') {
                    System.out.print("o ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();

        }
    }

    public void startGame() {

        while (!gameStart) {

                System.out.println("Podaj wiersz od 0 do 4");
                int targetRow = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Podaj kolumnę od 0 do 4");
                int targetColumn = scanner.nextInt();
                scanner.nextLine();

                if (board[targetRow][targetColumn] == 'S') {
                    System.out.println("Trafiony zatopiony");
                    board[targetRow][targetColumn] = 'X';
                    gameStart = true;

                }else if (board[targetRow][targetColumn] == 'M')
                    System.out.println("Tutaj już padł strzał! Wybierz inne pole");
                else {
                    System.out.println("Pudło");
                    board[targetRow][targetColumn] = 'M';
                    howManyShots++;

                }
                showBoard();

            }System.out.println("Trafiłeś w statek za " + howManyShots +
                " " + "razem");
        }
    }
