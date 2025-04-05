import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Komorka extends Telefon {
    protected final List<String> historiaTelefonów = new ArrayList<>();

    public Komorka(String interfejsKomunikacyjny, Color color) {
        super(interfejsKomunikacyjny, color);
    }

    public void zadzwon(String numer){
        historiaTelefonów.add(numer);
    }

    public void wyswietlHistoriePolaczen(){
        System.out.println("Lista obiektów wywołanych przez Komórkla");
        historiaTelefonów.stream()
                .forEach(System.out::println);
    }
}
