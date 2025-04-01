public class PingPong extends Thread {
    boolean pingturn = true;

    public synchronized void ping() {
        while (!pingturn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("ping");
        pingturn = false;
        notify();
    }

    public synchronized void pong() {
        while (pingturn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Pong");
        pingturn = true;
        notify(); //notify powiadamia 'ping' że teraz jest jego tura czyli go wybudza
    }
}
