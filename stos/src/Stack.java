public class Stack<T> {
    private int size;
    private Node<T> top;

    public void push (T value){
        top = new Node<T>(value, top);
        size++;
    }

    public void pop(){
        if (top == null){
            return;
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
    }

    public void printStack(){
        Node<T> current = top;
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();

        }
    }

    public void addLast(T value) {
        Node<T> node = new Node<>(value, null);
        Node<T> current = top;
        if (top == null) {
            top = node;
            return;
        }
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(node); //remove ma usunąć wartość Integer > zrób pętle > znajdź ten element i przepnij nexta żeby go skipnął
    }


    public void clear(){
        top = null;
        size = 0;
    }

    public void remove(T value){
        if (top == null) return;
        Node<T> current = top;
        while (current.getNext() != null){
            if (current.getNext().getValue().equals(value)){
                current.setNext(current.getNext().getNext());
                size--;
            }
            current = current.getNext();
        }
    }


}
