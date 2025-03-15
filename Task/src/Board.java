import java.util.Random;

public class Board {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[20];

        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(100);

        }
        for (int num : number) {
            System.out.println(num);
        }
        int min = number[0];
        int max = number[0];

        for (int num : number){
            if (num < min){
                min = num;
            }
            if (num > max){
                max = num;
            }
        }
        System.out.println("Największa liczba : " + max);
        System.out.println("Najmniejsza liczba : " + min);
    }
}
