package circularLinkedList;

/**
 * Created by Casper on 22/09/2017.
 */
public class Node<E> {

  private E element;
  private Node next;

  public Node(E element) {
    this.element = element;
  }

  public E getElement() {
    return element;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}
