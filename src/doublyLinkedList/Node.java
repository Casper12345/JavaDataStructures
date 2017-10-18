package doublyLinkedList;

/**
 * Created by Casper on 22/09/2017.
 */
public class Node<E> {

  private E info;
  private Node next;
  private Node privious;


  public Node(E info) {
    this.info = info;
  }

  public E getInfo() {
    return info;
  }

  public Node getNext() {
    return next;
  }

  public Node getPrivious() {
    return privious;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public void setPrivious(Node privious) {
    this.privious = privious;
  }
}
