import SinglyLinkedList.SinglyLinkedList;
import binarySearchTree.BinarySearchTree;

/**
 * Created by Casper on 20/09/2017.
 */
public class Main {

  public static void main(String[] args) {

    BinarySearchTree<Character> b = new BinarySearchTree<>();

    b.add('a');
    b.add('c');
    b.add('b');
    b.add('k');
    b.add('e');
    b.add('f');

    b.printTree("postOrder");
    System.out.println(b.searchByElement('e'));


  }

}
