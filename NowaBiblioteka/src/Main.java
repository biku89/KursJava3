public class Main {
    public static void main(String[] args) {
        PingPong pingPong = new PingPong();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                pingPong.ping();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                pingPong.pong();
            }
        });

        t1.start();
        t2.start();
    }
}