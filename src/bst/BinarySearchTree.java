package bst;

/**
 * Created by Casper on 20/09/2017.
 */
public class BinarySearchTree {

  private Node root;

  public void add(int element) {
    root = insert(root, element);
  }

  private Node insert(Node n, int element) {

    if (n == null) {
      return new Node(element);
    }

    if (n.getElement() > element) {
      n.setLeft(insert(n.getLeft(), element));
    } else if (n.getElement() < element) {
      n.setRight(insert(n.getRight(), element));
    } else {
      n.setLeft(insert(n.getLeft(), element));
    }
    return n;
  }


  private Node traverseRight(Node n) {
    if (n.getRight() != null) {
      return traverseRight(n.getRight());
    } else {
      return n;
    }
  }

  private Node traverseLeft(Node n) {
    if (n.getLeft() != null) {
      return traverseLeft(n.getLeft());
    } else {
      return n;
    }
  }

  public void printInorder() {
    traverseInOrder(root);
  }

  private void traverseInOrder(Node n) {
    if (n.getLeft() != null) {
      traverseInOrder(n.getLeft());
    }
    System.out.println(n.getElement());

    if (n.getRight() != null) {
      traverseInOrder(n.getRight());
    }
  }

  public boolean search(int i) {
    return search(i, root);
  }

  private boolean search(int element, Node node) {

    if (node.getElement() == element) {
      return true;
    }

    if (node.getElement() > element && node.getLeft() != null && search(element,node.getLeft())) {
      return true;
    }

    if (node.getElement() < element && node.getRight() != null && search(element,node.getRight())) {
      return true;
    }

    return false;
  }

}
