import java.util.Random;

public class Fruit {
    private String nameFruit;
    private double weight;
    Random random = new Random();

    public Fruit(String nameFruit) {
        this.nameFruit = nameFruit;
        this.weight = random.nextDouble(0.5, 0.8);
    }

    public void printInfo(){
        System.out.println("Nazwa owocu " + nameFruit + " jego waga wynosi " + weight);
    }

}
