package binarySearchTree;

public class Main {


  public static void main(String[] args) {

    BinarySearchTree<Integer> bst = new BinarySearchTree<>();

    bst.add(13);
    bst.add(12);
    bst.add(2);
    bst.add(3);
    System.out.println(bst.searchByElement(1));

    bst.printTree(Order.PREORDER);
  }



}
