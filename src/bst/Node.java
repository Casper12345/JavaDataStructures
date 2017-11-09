package bst;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Casper on 20/09/2017.
 */
public class Node {

  private int element;
  private Node left;
  private Node right;

  public Node(int element) {
    this.element = element;
  }

  public int getElement() {
    return element;
  }

  public Node getLeft() {
    return left;
  }

  public Node getRight() {
    return right;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public void setRight(Node right) {
    this.right = right;
  }

}
