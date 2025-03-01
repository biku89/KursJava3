public class Stack {
    private int size;
    private Node top;

    public void push (Integer value){
        Node node = new Node(value, top);
        top = node;
        size++;
    }

    public Integer pop(){
        Integer value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public void printStack(){
        Node current = top;
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();

        }
    }

    public void addLast(Integer value){
        Node node = new Node(value, null);
        Node current = top;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(node); //remove ma usunąć wartość Integer > zrób pętle > znajdź ten element i przepnij nexta żeby go skipnął

    }

    public void clear(){
        top = null;
        size = 0;
    }

    public void remove(Integer value){
        Node current = top;
        while (current.getNext() != null){
            if (current.getNext().getValue().equals(value)){
                current.setNext(current.getNext().getNext());
                size--;
            }
            current = current.getNext();
        }
    }


}
