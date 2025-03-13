public class Main {
    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.addIter(30, binaryTree.root);
        binaryTree.addIter(10, binaryTree.root);
        binaryTree.addIter(40, binaryTree.root);
        binaryTree.addIter(15, binaryTree.root);



        binaryTree.printInfo(binaryTree.root);
        binaryTree.search(binaryTree.root, 110);
        binaryTree.printFromLeft(binaryTree.root);

    }
}