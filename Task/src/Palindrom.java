import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo do sprawdzenia");
        String word = scanner.nextLine();
        isPalindrome(word);

    }

    public static boolean isPalindrome(String text) {
        int length = text.length();
        int forward = 0;
        int backward = length - 1;

        while (backward > forward) {
            char fowardChar = text.charAt(forward++);
            char backwardChar = text.charAt(backward--);
            if (fowardChar != backwardChar){
                System.out.println(text + " Nie jest palindromem");
                return false;
            }
        }System.out.println(text + " Jest palindromem");
        return true;
    }
}
