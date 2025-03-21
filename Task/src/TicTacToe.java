import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char board [][] = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                board[row][col] = ' ';
            }
        }
        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameOver){
            printBoard(board);
            System.out.println("Gracz " + player + " wykonuje ruch ");
            System.out.println("Podaj numer wiersza od 0 - 2");
            int row = scanner.nextInt();
            System.out.println("Podaj numer kolumny od 0 - 2");
            int col = scanner.nextInt();

            if (board[row][col] == ' '){
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if (gameOver){
                    System.out.println("Gracz " + player + " Wygrał");
                }else {
//                    if (player == 'X'){
//                        player = 'O';
//                    }else {
//                        player = 'X';
//                    }
                    player = (player == 'X') ? 'O' : 'X';
                }
            }else {
                System.out.println("Błędny ruch. Spróbuj jeszcze raz");
            }
        }
        printBoard(board);
    }

    private static boolean haveWon(char[][] board, char player) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;

    }

    private static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
}
