package singlyLinkedList;

public class Main {

  public static void main(String[] args) {

    SinglyLinkedList<Integer> s = new SinglyLinkedList();

    s.addNodeLeft(1);
    s.addNodeLeft(2);
    s.addNodeLeft(3);
    s.addNodeLeft(4);

    System.out.println(s.exists(3));
  }

}
