public class Main {
    public static void main(String[] args) {
        double price = 400;

        for (TicketType type : TicketType.values()){
            System.out.println(type + " cena biletu po zniżce " + type.priceAferDiscount(price));
        }

    }
}
