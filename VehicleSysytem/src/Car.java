public class Car extends Vehicle implements Drivable{
    private int doors;

    public Car(String brand, String model, int year, FuelType fuelType, int doors) {
        super(brand, model, year, fuelType);
        this.doors = doors;
    }
    @Override
    public void drive(){
        System.out.println("Auto jedzie");
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Ilośc drzwi: " + doors);
    }

}
