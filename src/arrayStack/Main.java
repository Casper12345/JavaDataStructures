package arrayStack;

public class Main {

  public static void main(String[] args) {

    ArrayStack<Integer> s = new ArrayStack<>();

    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);

    System.out.println(s.pop());
    s.push(6);

    System.out.println(s.pop());
  }

}
