public class Main {
    public static void main(String[] args) {
        QueueImplement queueImplement = new QueueImplement(5);
        int itemToProduce = 30;
        int consumerNumber = 3;

        Thread producerTheard = new Thread(new Producer(queueImplement, itemToProduce));
        producerTheard.start();

        for (int i = 0; i < consumerNumber ; i++) {
            Thread consumerThread = new Thread(new Consumer(queueImplement, itemToProduce / consumerNumber, i));
            consumerThread.start();

        }
    }
}