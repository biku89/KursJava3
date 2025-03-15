import java.util.Scanner;

public class Rectangel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokość");
        int high = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Szerokosć");
        int b = scanner.nextInt();

        for (int i = 0; i < high; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        scanner.close();
    }
}

