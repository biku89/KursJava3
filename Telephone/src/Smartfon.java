import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Smartfon extends Komorka {
    private final List <Osoba> listaZnajmoych = new ArrayList<>();

    public Smartfon(String interfejsKomunikacyjny, Color color, List<Osoba> listaZnajmoych) {
        super(interfejsKomunikacyjny, color);
    }

    @Override
    public void wyswietlHistoriePolaczen() {
        System.out.println("Połączenia z listy znajomych");
        historiaTelefonów.stream()
                .map(this::formatNumber)
                .forEach(System.out::println);
    }

    public String formatNumber(String numer) {
        return listaZnajmoych.stream()
                .filter(osoba -> osoba.numer().equals(numer))
                .map(Objects::toString)
                .findFirst()
                .orElse(numer);
    }
}
