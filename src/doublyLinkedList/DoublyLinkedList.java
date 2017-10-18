package doublyLinkedList;

/**
 * Created by Casper on 22/09/2017.
 */
public class DoublyLinkedList<T> {

  private Node head;
  private Node tail;

  public void addLeft(T element) {
    if (head == null) {
      Node<T> n = new Node<T>(element);
      head = n;
      tail = n;
    } else {

      Node<T> n = new Node<T>(element);
      n.setNext(head);
      head.setPrivious(n);

      head = n;
    }


  }

  public void addRight(T element) {
    if (head == null) {
      Node<T> n = new Node<T>(element);
      head = n;
      tail = n;
    } else {

      Node<T> n = new Node<T>(element);
      n.setPrivious(tail);
      tail.setNext(n);
      tail = n;
    }


  }

  public void printFromRight() {

    if (head == null) {
      System.out.println("list is empty");
    } else {

      Node pointer = head;

      while (pointer.getNext() != null) {
        System.out.println(pointer.getInfo());
        pointer = pointer.getNext();

      }
      System.out.println(pointer.getInfo());


    }
  }


  public void printFromLeft() {

    if (tail == null) {

      System.out.println("list is empty");

    } else {

      Node pointer = tail;

      while (pointer.getPrivious() != null) {
        System.out.println(pointer.getInfo());
        pointer = pointer.getPrivious();

      }
      System.out.println(pointer.getInfo());


    }

  }

}
