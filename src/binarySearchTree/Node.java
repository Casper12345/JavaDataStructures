package binarySearchTree;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Casper on 20/09/2017.
 */
public class Node<E> implements Comparable<E> {

  private E element;
  private Node<E> left;
  private Node<E> right;

  public Node(E element) {
    this.element = element;
  }

  E getElement() {
    return element;
  }

  Node<E> getLeft() {
    return left;
  }

  Node<E> getRight() {
    return right;
  }

  void setLeft(Node<E> left) {
    this.left = left;
  }

  void setRight(Node<E> right) {
    this.right = right;
  }

  @Override
  public int compareTo(@NotNull E o) {
    return Integer.compare(o.hashCode(), this.element.hashCode());
  }

}
