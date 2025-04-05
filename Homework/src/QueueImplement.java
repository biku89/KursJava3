import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class QueueImplement {
    private int size;
    private List<Integer> queue = new LinkedList<>();
    private int id;

    public QueueImplement(int size) {
        this.size = size;
    }

    public synchronized  void produce(int item) throws InterruptedException{
        while (queue.size() == size){
            wait();
        }
        queue.add(item);
        System.out.println("Producent wyprodukował: " + item);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException{
        while (queue.isEmpty()){
            wait();
        }
        int item = queue.remove(0);
        //System.out.println("Konsument skonsumował" + item);
        notifyAll();
        return item;
    }
}
