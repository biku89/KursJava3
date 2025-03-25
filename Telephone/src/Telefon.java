import java.awt.*;

public class Telefon {
    private String interfejsKomunikacyjny;
    private Color color;

    public Telefon(String interfejsKomunikacyjny, Color color) {
        this.interfejsKomunikacyjny = interfejsKomunikacyjny;
        this.color = color;
    }

    public void zadzwon(String numer){
        System.out.println("Wykonuje połączenie");
        System.out.println(numer);
    }

    public void wyswietlHistoriePolaczen(){
        System.out.println("Brak historii");
    }
}
