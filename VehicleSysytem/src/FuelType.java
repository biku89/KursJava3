public enum FuelType {
    PETROL(4.90),
    DISEL(5.20),
    ELECTRIC(6.90);

    private final double price;

    FuelType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
