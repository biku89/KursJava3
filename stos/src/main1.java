public class main1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<String> stackString = new Stack<>();
//        stack.push(30);
//        stack.push(40);
//        stack.push(59);
//        stack.push(60);
        stackString.push("Testowy");

        System.out.println("Przed: ");
        stackString.printStack();
        stack.printStack();

        stack.addLast(70);
        stackString.addLast("CzyDziała?");
        stack.addLast(40);
        stack.addLast(80);
        //todo: popraw jak jest za dużo pop'ow
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Po adlast");
        stack.printStack();
        stackString.printStack();

        stack.remove(40);
        stackString.remove("CzyDziała");
        System.out.println("Usuwamy 40 i Stringa: ");
        stack.printStack();


        stack.clear();
        System.out.println("Stack wyszyszczony:");
        stack.printStack();



    }
}