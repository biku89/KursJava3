import java.util.Optional;

public class Account extends Bill{
    private static double interestRate;

    public Account(Person person, double accountBalans) {
        super(person, accountBalans);
    }

    public static void changeInterestRate(Double newInterestRate){
        Optional.of(newInterestRate)
                .filter(rate -> rate >= 0)
                .ifPresentOrElse(rate ->{
                    interestRate = rate;
                    System.out.println("Ustawiono nowe oprocentowanie " + interestRate);
                } ,
                () -> {
                    throw new IllegalArgumentException("Błędna wartość");
                });
    }

    public void update(){
        System.out.println("Stan konto po doliczeniu odsetek: ");
        double currentAccountBalans = getAccountBalans() + (getAccountBalans() * (interestRate / 100));
        System.out.println(currentAccountBalans);
    }

    public String toString(){
        return super.toString() + " Z oprocentowaniem " + interestRate;
    }
}
