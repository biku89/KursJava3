public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(30);
        stack.push(40);
        stack.push(59);
        stack.push(60);

        System.out.println("Przed: ");
        stack.printStack();

        stack.addLast(70);

        System.out.println("Po adlast");
        stack.printStack();

        stack.remove(40);
        System.out.println("Usuwamy 40: ");
        stack.printStack();

        stack.clear();
        System.out.println("Stack wyszyszczony:");
        stack.printStack();



    }
}