package bst;

/**
 * Created by Casper on 20/09/2017.
 */
public class Main {


  public static void main(String[] args) {
    BinarySearchTree b = new BinarySearchTree();

    b.add(12);
    b.add(1);
    b.add(13);
    b.add(15);
    b.add(2);
    b.add(4);

    b.printInorder();

    System.out.println(b.search(15));

  }



}
