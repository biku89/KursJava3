import java.util.Scanner;

public class PyramidRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wysokość");
        int high = scanner.nextInt();

        for (int i = 0; i < high; i++) {
            String move = " ".repeat(high - i);
            String star = "*".repeat(2 * i - 1);
            System.out.println(move + star);


            }
        scanner.close();

        }
    }

