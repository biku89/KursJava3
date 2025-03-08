public class BinaryTree {
    Node root;

    public void add(int value){
        if (root == null){
            root = new Node(value);
        }
        addRec(value, root);


    }
    public Node addRec(int value, Node current){
        if (current == null){
            return new Node(value);
        }
        if (value < current.getValue()) {
            current.setLeft(addRec(value, current.getLeft()));
        }else if (value > current.getValue())
            current.setRight(addRec(value, current.getRight()));
        return current;
    }


    public void printInfo(Node current) {
        if (current != null) {
            printInfo(current.getLeft());
            System.out.println(current.getValue());
            printInfo(current.getRight());

        }

    }
    public void search(Node current, int value) {
      while (current != null){
          if (current.getValue() == value){
              System.out.println("znaleziono " + + value);
              return;
          }

          if (value < current.getValue()){
              current = current.getLeft();
          }else {
              current = current.getRight();
          }
      }
        System.out.println("Nie znaleziono wartości: " + value);
    }
}




