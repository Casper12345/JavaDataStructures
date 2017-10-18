package doublyLinkedList;

/**
 * Created by Casper on 22/09/2017.
 */
public class Main {

  public static void main(String[] args) {
    DoublyLinkedList<Integer> l = new DoublyLinkedList<>();
    l.addLeft(1);
    l.addLeft(2);
    l.addLeft(3);
    l.addLeft(4);
    l.addLeft(5);
    l.addRight(10);

    l.printFromRight();
    l.printFromLeft();
  }

}
