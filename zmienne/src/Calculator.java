public class Calculator {
    private static final char PLUS = '+';
    private static final char MINUS = '-';
    private static final char MULTIPLY = '*';
    private static final char DIVIDE = '/';
    private static final char POWER = '^';
    private static final char MODULO = '%';

    public static double calculate (double a, double b, char operator){
        double result = 0;

        switch (operator){
            case PLUS -> result = a + b;
            case MINUS -> result = a - b;
            case MULTIPLY -> result = a * b;
            case DIVIDE -> {
                if (b == 0){
                    throw new ArithmeticException("Dzielenie przez 0");
                }
                result = a / b;
            }
            case POWER -> result = Math.pow(a, b);
            case MODULO -> result = a % b;
            default -> System.out.println("Nie poprawny operator");
        }
        return result;

    }
    public static void orEven(double result) {
        String evenOrOdd = (result % 2 == 0) ? result + " jest liczbą parzystą" : result + " jest liczbą nieparzystą";
        System.out.println(evenOrOdd);
    }



}
