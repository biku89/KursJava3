import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokość");
        int high = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < high; i++) {
            for (int j = 0; j < high - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }scanner.close();//todo: spróbuj zrobić z repeat
    }
}
