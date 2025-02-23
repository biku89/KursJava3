import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            double a = 0;
            double b = 0;
            char operator = ' ';
            double result = 0;

            boolean readComplete = false;

            while (!readComplete) {
                try {
                    System.out.println("Podaj liczbę a: ");
                    a = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Podaj operator + , - , * , / , % , ^");
                    operator = scanner.next().charAt(0);
                    scanner.nextLine();

                    System.out.println("Podaj liczbę b: ");
                    b = scanner.nextDouble();
                    scanner.nextLine();
                    readComplete = true;
                } catch (InputMismatchException e) {
                    System.out.println("Wprowadzono nie poprawne dane. Spróbuj jeszcze raz");
                    scanner.nextLine();
                }
            }
            try {
                result = Calculator.calculate(a, b, operator);
                System.out.println(a + " " + operator + " " + b + " = " + result);
            } catch (ArithmeticException e) {
                System.err.println(e.getMessage());
                System.err.println("Nie udało się obliczyć wyniku wyrażenia " + a + operator + b);

            }
            System.out.println("Czy chcesz kontynuować obliczenia ? (y/n)");
            String response = scanner.nextLine();

            if (!response.equals("y")) {
                Calculator.orEven( result);
                System.out.println("Kończymy program");
                break;
            }

        } while (true);


        scanner.close();
    }
}

