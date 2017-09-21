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

  public E getElement() {
    return element;
  }

  public Node<E> getLeft() {
    return left;
  }

  public Node<E> getRight() {
    return right;
  }

  public void setLeft(Node<E> left) {
    this.left = left;
  }

  public void setRight(Node<E> right) {
    this.right = right;
  }

  @Override
  public int compareTo(@NotNull E o) {
    if (o.hashCode() > this.element.hashCode()) {
      return 1;
    } else if (o.hashCode() < this.element.hashCode()) {
      return -1;
    } else {
      return 0;
    }
  }

}
