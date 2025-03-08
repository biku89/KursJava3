import java.util.Random;

public class TestMain {
    public static void main(String[] args) {

        ShipTest shipTest = new ShipTest();

        shipTest.createBoard();
        shipTest.addShip();
        shipTest.showBoard();
        shipTest.startGame();


    }
}
