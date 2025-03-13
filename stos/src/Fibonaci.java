import java.util.ArrayList;
import java.util.List;

public class Fibonaci {
    public static void main(String[] args) {
        List<Integer> zapisMemory = new ArrayList<>();
        zapisMemory.add(0);
        zapisMemory.add(1);
        System.out.println(fib(10, zapisMemory));

//        int n = 10;
//
//        for (int i = 0; i < n; i++) {
//            System.out.println(i + " - " + zapisMemory.get(i));
//        }
    }
    public static int fib(int n, List<Integer> zapisMemory){
        if (zapisMemory.size() > n) return zapisMemory.get(n);
        int result = fib(n - 1, zapisMemory) + fib(n - 2, zapisMemory);
        zapisMemory.add(result);
        return result;
    }


    }

