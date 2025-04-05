public class Consumer implements Runnable {
    private QueueImplement queueImplement;
    private int itemToConsume;
    private int id;

    public Consumer(QueueImplement queueImplement, int itemToConsume, int id) {
        this.queueImplement = queueImplement;
        this.itemToConsume = itemToConsume;
        this.id = id;
    }


    @Override
    public void run() {
        for (int i = 0; i < itemToConsume; i++) {
            try {
                int item = queueImplement.consume();
                System.out.println("Konsument numer : " + id + " Skonsumował " + item);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }

        }
    }
}
