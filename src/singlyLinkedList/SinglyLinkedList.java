package singlyLinkedList;

import java.util.NoSuchElementException;

/**
 * Singly Linked List Java.
 */
public class SinglyLinkedList<T> implements SinglyLinkedListInterface<T> {

  private Node head;

  @Override
  public void addNodeLeft(T element) {

    if (head == null) {
      head = new Node<T>(element, null);
    } else {
      head = new Node<T>(element, head);
    }
  }

  @Override
  public T removeNodeLeft() {

    T toReturn;

    if (head == null) {
      throw new NoSuchElementException("Element does not exist");
    }

    toReturn = (T) head.getInfo();
    head = head.getNextNode();

    return toReturn;
  }

  @Override
  public void addNodeRight(T element) {

    if (head == null) {
      head = new Node<T>(element, null);
    } else {

      Node pointer = head;

      while (pointer.getNextNode() != null) {
        pointer = pointer.getNextNode();
      }

      pointer.setNextNode(new Node<T>(element, null));

    }

  }

  @Override
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

  @Override
  public int size() {
    int toReturn;

    if (head == null) {
      toReturn = 0;
    } else {

      Node pointer = head;

      toReturn = 1;
      while (pointer.getNextNode() != null) {
        pointer = pointer.getNextNode();
        toReturn += 1;
      }

    }

    return toReturn;
  }

  public void insertByIndex(T element, int index) {

    int count = 1;

    if (index > size() || index < 0) {
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }

    if (head == null) {
      head = new Node<T>(element, null);
    }

    if (index == 0) {
      addNodeLeft(element);
    } else {

      Node pointer = head;

      while (pointer.getNextNode() != null && index != count) {
        count++;
        pointer = pointer.getNextNode();
      }

      pointer.setNextNode(new Node<T>(element, pointer.getNextNode()));

    }
  }


  public boolean exists(T t) {

    if (head == null) {
      return false;
    } else {

      Node pointer = head;

      while (pointer.getNextNode() != null) {
        if (pointer.getInfo().equals(t)) {
          return true;
        }

        pointer = pointer.getNextNode();
      }
      return false;
    }
  }

}
