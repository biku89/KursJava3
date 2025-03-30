public class Main extends Thread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); //uruchamia wątek


        Main thread = new Main();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run1(){
        amount++;
    }

    public static int amount = 0;
}

