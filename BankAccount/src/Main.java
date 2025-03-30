import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Bill> listOfBankAccounts = List.of(
                new Bill(new Person("Jan", "Kowalski"), 5000),
                new Account(new Person("Anna", "Oooo"), 7000),
                new VipAccount(new Person("Maciuś", "Nowak"), 13000, 8, 1000)
        );

        listOfBankAccounts
                .stream()
                .findAny().ifPresent(account -> {
                    account.payment(1000);
                    account.transfer(1245, 4000);
                    account.cashWithdraw(50);
                    account.update();
                });


        Account.changeInterestRate(6.5);
        listOfBankAccounts.stream().skip(1).limit(1).forEach(Bill::update);
        listOfBankAccounts.stream().skip(2).forEach(Bill::update);

        Optional<Bill> maciekAcc = listOfBankAccounts
                .stream()
                .filter(acc -> acc.getPerson().getName().equals("Maciuś"))
                .findFirst();
        maciekAcc.ifPresent(acc -> acc.payment(400));
        maciekAcc.ifPresent(acc -> acc.cashWithdraw(1000));
        maciekAcc.filter(acc -> acc.cashWithdraw(1000))
                .ifPresent(System.out::println);
        maciekAcc.ifPresent(Bill::update);

    }

}