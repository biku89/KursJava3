public enum TicketType {
    CHILD(0.1),
    ADULT(0.3),
    SENIOR(0.5);

    private final double discount;

    TicketType(double discount) {
        this.discount = discount;
    }

    public double priceAferDiscount(double price){
        return price * discount;
    }
}
