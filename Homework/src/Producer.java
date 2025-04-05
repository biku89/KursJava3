import java.util.Random;

public class Producer implements Runnable{
    private QueueImplement queueImplement;
    private int itemToProduce;

    public Producer(QueueImplement queueImplement, int itemToProduce) {
        this.queueImplement = queueImplement;
        this.itemToProduce = itemToProduce;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < itemToProduce; i++) {
            try {
                queueImplement.produce(i);
                Thread.sleep(random.nextInt(1000));
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }

        }
    }
}
