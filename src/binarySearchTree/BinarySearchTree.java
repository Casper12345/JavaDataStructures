package binarySearchTree;

/**
 * Created by Casper on 20/09/2017.
 */
public class BinarySearchTree<T> {

  private Node root;

  public void add(T element) {
    root = insert(root, element);
  }

  private Node insert(Node node, T element) {

    if (node == null) {
      return new Node<T>(element);
    }

    if (node.compareTo(element) < 0) {
      node.setLeft(insert(node.getLeft(), element));
    } else if (node.compareTo(element) > 0) {
      node.setRight(insert(node.getRight(), element));
    } else {
      node.setLeft(insert(node.getLeft(), element));
    }
    return node;
  }

  public boolean searchByElement(T element) {
    return search(element, root);
  }

  private boolean search(T element, Node node) {

    if (node.compareTo(element) == 0) {
      return true;
    }

    if (node.compareTo(element) < 0 && node.getLeft() != null && search(element,
        node.getLeft())) {
      return true;
    }

    if (node.compareTo(element) > 0 && node.getRight() != null && search(element,
        node.getRight())) {
      return true;
    }

    return false;

  }


  public void printTree(Order order) {

    switch (order) {
      case PREORDER:
        traversePreOrder(root);
        break;

      case INORDER:
        traverseInOrder(root);
        break;

      case POSTORDER:
        traversePostOrder(root);
        break;
    }

  }


  private void traversePreOrder(Node n) {

    System.out.println(n.getElement());

    if (n.getLeft() != null) {
      traversePreOrder(n.getLeft());
    }

    if (n.getRight() != null) {
      traversePreOrder(n.getRight());
    }
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


  private void traversePostOrder(Node n) {

    if (n.getLeft() != null) {
      traversePostOrder(n.getLeft());
    }

    if (n.getRight() != null) {
      traversePostOrder(n.getRight());
    }

    System.out.println(n.getElement());
  }
  

}
