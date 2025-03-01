import java.util.Random;
import java.util.Scanner;

public class Ship {
    public static void main(String[] args) {
        int SIZE = 5;
        char board[][] = new char[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '0';
                System.out.print(board[i][j] + " ");
            }
            System.out.println();

        }


        boolean gameStart = false;
        int shipRow = random.nextInt(SIZE);
        int shipCol = random.nextInt(SIZE);
        board[shipRow][shipCol] = 'S';

        while (!gameStart){
            System.out.println("Gra w statki!");
            System.out.println("Podaj wiersz od 0 do 4");
            int targetRow = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Podaj kolumnę od 0 do 4");
            int targetCol = scanner.nextInt();
            scanner.nextLine();

            if (board[targetRow][targetCol] == 'S'){
                System.out.println("Trafionmy");
                gameStart = true;
            }else {
                System.out.println("Pudło!");
                board[targetRow][targetCol] = 'M';
            }
        }
        showBoard(board, SIZE);
    }
    public static void showBoard(char board[][],int SIZE){
        System.out.println("aktualna plansza");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 'S'){
                    System.out.print("o ");
                }else
                    System.out.println();

            }

        }

    }


}
