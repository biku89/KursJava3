import java.util.Optional;

public class VipAccount extends Account {
    private double interestRateForVip;
    private double overdraft;

    public VipAccount(Person person, double accountBalans, double interestRateForVip, double overdraft) {
        super(person, accountBalans);
        this.interestRateForVip = interestRateForVip;
        this.overdraft = overdraft;
    }

    private double accountWithOverdraft() {
        return -overdraft;
    }

    @Override
    public boolean cashWithdraw(double amount) {
        return Optional.of(amount)
                .filter(a -> a > 0 && (getAccountBalans() - a) >= accountWithOverdraft())
                .map(a -> {
                    setAccountBalans(getAccountBalans() - a);
                    System.out.println("Wypłaco środki w wysokośi " + a);
                    System.out.println("Saldo po operacji " + getAccountBalans());
                    return true;
                })
                .orElseGet(() -> {
                    System.out.println("Nie udało się wykonac operacji. Brak środków");
                    return false;
                });
    }

    @Override
    public boolean transfer(int numberAcc, double amount) {
        return Optional.of(amount)
                .filter(a -> a > 0 && (getAccountBalans() - a) >= accountWithOverdraft())
                .map(a -> {
                    setAccountBalans(getAccountBalans() - a);
                    System.out.println("Udało się wykonać przelew w wysokosći " + a);
                    System.out.println("Saldo po " + getAccountBalans());
                    return true;
                })
                .orElseGet(() -> {
                    System.out.println("nie masz wystarczającej ilości środków");
                    return false;
                });
    }

    @Override
    public void update() {
        double currentAccountBalans = getAccountBalans() + (getAccountBalans() * (interestRateForVip / 100));
        System.out.println("Stan konta po uwzględnieniu odsetek " + currentAccountBalans);
    }

    @Override
    public String toString() {
        return super.toString() + " Vip konto z linią debetową " + overdraft + " i oprocentowaniem " + interestRateForVip;
    }


}

