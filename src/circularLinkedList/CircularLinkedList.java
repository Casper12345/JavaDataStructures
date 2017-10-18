package circularLinkedList;

/**
 * Created by Casper on 22/09/2017.
 */
public class CircularLinkedList<T> {

  private Node head;

  public void addRight(T element) {
    if (head == null) {
      Node n = new Node<>(element);
      head = n;
      n.setNext(head);
    } else {
      Node n = new Node<>(element);
      n.setNext(head.getNext());
      head.setNext(n);

    }


  }

  public void addLeft(T element) {
    if (head == null) {
      Node n = new Node<>(element);
      head = n;
    } else {
      Node n = new Node<>(element);
      n.setNext(head.getNext());
      head.setNext(n);
      head = n;
    }


  }

  public void print() {
    if (head == null) {
      System.out.println("list is empty");
    } else {

      Node pointer = head;

      System.out.println(pointer.getElement());
      while (pointer.getNext() != head) {
        pointer = pointer.getNext();
        System.out.println(pointer.getElement());

      }


    }

  }

}
