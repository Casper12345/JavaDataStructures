package SinglyLinkedList;

import java.util.NoSuchElementException;

/**
 * Singly Linked List Java
 */
public class SinglyLinkedList<T> implements SinglyLinkedListInterface<T> {

  private Node head;

  public void addNodeLeft(T info) {

    if (head == null) {
      head = new Node<T>(info, null);
    } else {
      head = new Node<T>(info, head);
    }
  }

  public T removeNodeLeft() {

    T toReturn;

    if (head == null) {
      throw new NoSuchElementException("Element does not exist");
    }

    toReturn = (T) head.getInfo();
    head = head.getNextNode();

    return toReturn;
  }

  public void addNodeRight(T info) {

    if (head == null) {
      head = new Node<T>(info, null);
    } else {

      Node pointer = head;

      while (pointer.getNextNode() != null) {
        pointer = pointer.getNextNode();
      }

      pointer.setNextNode(new Node<T>(info, null));

    }

  }

  public T removeNodeRight() {

    T toReturn;

    if (head == null) {
      throw new NoSuchElementException("Element does not exist");
    }

    Node pointer = head;

    if (head.getNextNode() == null) {
      toReturn = (T) pointer.getInfo();
      head = null;
    } else {

      while (pointer.getNextNode().getNextNode() != null) {
        pointer = pointer.getNextNode();
      }

      toReturn = (T) pointer.getInfo();
      pointer.setNextNode(null);

    }

    return toReturn;

  }

  @Override
  public String toString() {

    Node pointer = head;

    StringBuilder sb = new StringBuilder();

    if (pointer == null) {
      sb.append("List is empty");
    } else {

      sb.append("List(");

      if (pointer.getNextNode() != null) {
        sb.append(pointer.getInfo());
        sb.append(", ");
      } else {
        sb.append(pointer.getInfo());
      }

      while (pointer.getNextNode() != null) {
        pointer = pointer.getNextNode();
        if (pointer.getNextNode() != null) {
          sb.append(pointer.getInfo());
          sb.append(", ");
        } else {
          sb.append(pointer.getInfo());
        }
      }
      sb.append(")");
    }
    return sb.toString();
  }

  public void printList() {
    System.out.println(toString());
  }

}
