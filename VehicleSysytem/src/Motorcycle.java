public class Motorcycle extends Vehicle implements Drivable{

    public Motorcycle(String brand, String model, int year, FuelType fuelType) {
        super(brand, model, year, fuelType);
    }

    public void drive(){
        System.out.println("Motor jedzie");
    }
}
