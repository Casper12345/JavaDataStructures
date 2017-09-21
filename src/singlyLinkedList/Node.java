package singlyLinkedList;

/**
 * Created by Casper on 20/09/2017.
 */

class Node<E> {

  private E info;
  private Node<E> nextNode;

  E getInfo() {
    return info;
  }

  Node<E> getNextNode() {
    return nextNode;
  }

  Node(E info, Node<E> nextNode) {
    this.info = info;
    this.nextNode = nextNode;
  }

  void setNextNode(Node<E> nextNode) {
    this.nextNode = nextNode;
  }
}
