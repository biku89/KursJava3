import java.util.Scanner;

public class Nwd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj liczbę b");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println(nwd(a, b));

    }
    public static int nwd(int a, int b){
        while (a != b){
            if (a > b){
                a -= b;
            }else b -= a;
        }return a;
    }
}
