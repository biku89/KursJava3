import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        List<Character> correctOperators = Arrays.asList('+', '-', '/', '*', '^', '%');
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean runLoop = true;


        //todo: zrób jedną pętle.
        while (runLoop) {
            double a = 0;
            double b = 0;
            char operator = ' ';
            double result = 0;

            try {
                System.out.println("Podaj liczbę a: ");
                a = scanner.nextDouble();
                scanner.nextLine();


                //todo: wyrzuć while i spróbuj z contiunee
                System.out.println("Podaj operator + , - , * , / , % , ^");
                operator = scanner.next().charAt(0);
                scanner.nextLine();

                if (!correctOperators.contains(operator)) {
                    System.out.println("Wprowadź poprawny operator.");
                    continue;
                }


                System.out.println("Podaj liczbę b: ");
                b = scanner.nextDouble();
                scanner.nextLine();

                result = calculator.calculate(a, b, operator);
                System.out.println(a + " " + operator + " " + b + " = " + result);

            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono nie poprawne dane. Spróbuj jeszcze raz");
                scanner.nextLine();
                continue;

            }
            System.out.println("Czy chcesz kontynuować obliczenia ? (y/n)");
            String response = scanner.nextLine();

            if (!response.equals("y")) {
                calculator.orEven(result);
                calculator.plusOrMinus(result);
                System.out.println("Kończymy program");
                break;
            }
        }
    scanner.close();
    }
}

