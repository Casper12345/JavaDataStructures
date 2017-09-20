package SinglyLinkedList;

/**
 * Created by Casper on 20/09/2017.
 */
public interface SinglyLinkedListInterface<T> {

  void addNodeLeft(T info);

  T removeNodeLeft();

  void addNodeRight(T info);

  T removeNodeRight();

  void printList();

  int size();



}
