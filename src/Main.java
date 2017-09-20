import SinglyLinkedList.SinglyLinkedList;

/**
 * Created by Casper on 20/09/2017.
 */
public class Main {

  public static void main(String[] args) {
    SinglyLinkedList<Integer> l = new SinglyLinkedList<Integer>();
    l.addNodeLeft(1);
    l.addNodeLeft(2);
    l.addNodeLeft(3);
    l.addNodeRight(4);
    l.addNodeRight(5);
    l.addNodeLeft(9);
    l.addNodeRight(89);
    l.printList();

    l.removeNodeLeft();

    l.printList();

    System.out.println(l.size());

    SinglyLinkedList<Integer> l2 = new SinglyLinkedList<Integer>();

    l2.addNodeRight(2);
    l2.printList();
    System.out.println(l2.size());

    l2.removeNodeLeft();

    l2.printList();
    System.out.println(l2.size());


    l.insertByIndex(10, 5);

    l.printList();

  }

}
