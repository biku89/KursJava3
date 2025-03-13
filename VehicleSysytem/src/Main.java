import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Opel","astra", 3, FuelType.PETROL, 4);
        car.drive();
        car.refuel(10);
        car.displayInfo();

        Motorcycle motorcycle = new Motorcycle("Hajabuza", "szybka", 19,FuelType.DISEL);
        motorcycle.displayInfo();

        List<Drivable> vehicles = new ArrayList<>();
        vehicles.add(car);
        //todo:Przypomnij sobie enuma
    }
}