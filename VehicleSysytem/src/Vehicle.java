abstract class Vehicle {
    private String brand;
    private String model;
    private int year;
    private FuelType fuelType;

    public Vehicle(String brand, String model, int year, FuelType fuelType) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public void displayInfo(){
        System.out.println("Pojazd" + " " + brand + " " + model);
    }
    public void refuel(double liters) {
        System.out.println("Zatankowano :" + fuelType.getPrice() * liters);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

}

