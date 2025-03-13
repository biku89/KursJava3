import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ShipTest {
    Scanner scanner = new Scanner(System.in);
    int sizeRow;
    int sizeColumn;
    char[][] board;
    Random random = new Random();

    int howManyShots = 0;
    boolean gameStart = false;



    public void createBoard() {//todo: Zrób ograniczenia do planszy !!!
        boolean correctSize = false;
        while (!correctSize){
            try {
                System.out.println("Podaj rozmiar wierszy [0 - 10]");
                sizeRow = scanner.nextInt();
                if (sizeRow < 0 || sizeRow > 10) {
                    System.out.println("Wyszedłeś poza obszar planszy! spróbuj jeszcze raz");
                    continue;
                }
                scanner.nextLine();

                System.out.println("Podaj rozmaiar kolumny [0 - 10]");
                sizeColumn = scanner.nextInt();
                if (sizeColumn < 0 || sizeColumn > 10) {
                    System.out.println("Wyszedłeś poza obszar planszy! spróbuj jeszcze raz");
                    continue;
                }
                scanner.nextLine();
                correctSize = true;
            }catch (InputMismatchException e){
                System.out.println("Wprowadziłeś złe dane!");
                scanner.nextLine();
            }
        }
        board = new char[sizeRow][sizeColumn];

        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeColumn; j++) {
                board[i][j] = 'o';
            }
        }
    }


    public void addShip() {
        int shipRow, shipColumn;
        shipRow = random.nextInt(sizeRow);
        shipColumn = random.nextInt(sizeColumn);
        board[shipRow][shipColumn] = 'S';
    }

    public void showBoard() {
        System.out.print("     ");
        //System.out.println("    ----------");
        for (int i = 0; i < sizeColumn; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < sizeRow; i++) {
            System.out.printf("%2d | ", i);
            for (int j = 0; j < sizeColumn; j++) {
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
            try {
                System.out.println("Podaj wiersz od 0 do " + sizeRow);
                int targetRow = scanner.nextInt();
                if (targetRow < 0 || targetRow > sizeRow) {
                    System.out.println("Wykroczyłeś poza mapę! Spróbuj jeszcze raz");
                    continue;
                }
                scanner.nextLine();
                System.out.println("Podaj kolumnę od 0 do " + sizeColumn);
                int targetColumn = scanner.nextInt();
                if (targetColumn < 0 || targetColumn > sizeColumn) {
                    System.out.println("Wykroczyłeś poza mapę! Spróbuj jeszcze raz");
                    continue;
                }
                scanner.nextLine();

                if (board[targetRow][targetColumn] == 'S') {
                    System.out.println("Trafiony zatopiony");
                    board[targetRow][targetColumn] = 'X';
                    gameStart = true;

                } else if (board[targetRow][targetColumn] == 'M')
                    System.out.println("Tutaj już padł strzał! Wybierz inne pole");
                else {
                    System.out.println("Pudło");
                    board[targetRow][targetColumn] = 'M';
                    howManyShots++;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono nie poprawne dane. Spróbuj ponownie!");
                scanner.nextLine();
            }
            showBoard();

        }
        System.out.println("Trafiłeś w statek za " + howManyShots +
                " " + "razem");
    }
}
