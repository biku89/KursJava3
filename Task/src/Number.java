import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int a = scanner.nextInt();
        scanner.nextLine();

        if (czyPierwsza(a)){
            System.out.println(a + " Jest liczbą pierwszą");
        }else {
            System.out.println(a + " Nie jest liczbą pierwszą");
        }
        System.out.println(czyPierwsza(a) ? a + " jest liczbą pierwszą " : a + " Nie jest liczbą pierwszą");
    }

    public static boolean czyPierwsza(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }

        }
        return true;
    }
}
