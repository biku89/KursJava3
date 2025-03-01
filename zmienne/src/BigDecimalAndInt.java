import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalAndInt {
    public static void main(String[] args) {
        BigDecimal test1 = new BigDecimal(32);
        System.out.println(test1);
        BigDecimal test2 = new BigDecimal("4444");
        System.out.println(test2);



       // precision()	Liczba wszystkich cyfr (bez uwzględnienia znaku i przecinka).
       // scale()	Ilość cyfr po przecinku.
        // signum()	Zwraca -1 dla liczb ujemnych, 0 dla zera, 1 dla liczb dodatnich.
        // compareTo()	Porównuje wartość liczbową, ignorując różnice w skali.

        BigDecimal number1 = new BigDecimal("6.6");
        BigDecimal number2 = new BigDecimal("7.77");
        System.out.println("Po precison " + number1.precision() + " " + "Po scale " + number1.scale());
        int resultComapre = number1.compareTo(number2);
        System.out.println(resultComapre); // 0(równe wyniki), -1(mniejsza), 1(Większa)

        BigDecimal sum = number1.add(number2); // możesz w ten sposób dodawać mnożyć dzielić itd
        System.out.println("Wynik sumy" + sum);

        BigDecimal roundedUp = number1.setScale(2, RoundingMode.UP);
        System.out.println("Zaokrąglanie w górę " + roundedUp);

        double testNumber = 98.412412;
        String s = String.format("Nowa wartość: %.2f", testNumber);
        System.out.println(s);




    }
}
