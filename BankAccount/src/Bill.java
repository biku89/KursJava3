import java.util.List;
import java.util.Optional;

public class Bill {
    private Person person;
    private double accountBalans;


    public Bill(Person person, double accountBalans) {
        this.person = person;
        this.accountBalans = accountBalans;
    }

    public boolean payment(double amount) {
        return Optional.of(amount)
                .filter(a -> a > 0)
                .map(a -> {
                    accountBalans += a;
                    System.out.println("Operacja się powiodła. Wpłacono " + a);
                    System.out.println("Saldo po operacji " + accountBalans);
                    return true;
                })
                .orElseGet(() -> {
                    System.out.println("Operacja nie udała się");
                    return false;
                });
    }

    public boolean cashWithdraw(double amount) {
        return Optional.of(amount)
                .filter(a -> a > 0 && a <= accountBalans)
                .map(a -> {
                    accountBalans -= a;
                    System.out.println("Wypłacono " + a);
                    System.out.println("Saldo po operacji " + accountBalans);
                    return true;
                })
                .orElseGet(() -> {
                    System.out.println("Operacja się nie udała");
                    return false;
                });
    }

    public boolean transfer(int numberAcc, double amount) {
        return Optional.of(amount)
                .filter(a -> a > 0 && a <= accountBalans)
                .map(a -> {
                    accountBalans -= a;
                    System.out.println("Wykonano przelew " + a + " Na rachunek " + numberAcc);
                    System.out.println("Saldo po operacji " + accountBalans);
                    return true;
                }).orElseGet(() -> {
                    System.out.println("Nie udało się wykonać przelewu ");
                    return false;
                });
    }

    public void update() {
        System.out.println("Rachunek podstawowy");
    }

    @Override
    public String toString() {
        return "Rachunek właściciela " + person + " Saldo: " + accountBalans;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getAccountBalans() {
        return accountBalans;
    }

    public void setAccountBalans(double accountBalans) {
        this.accountBalans = accountBalans;
    }
}
