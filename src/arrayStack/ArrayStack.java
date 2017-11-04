package arrayStack;

import arrayList.ArrayList;

public class ArrayStack<T> {

  private ArrayList<T> stack = new ArrayList<>();


  public T pop() {
    if (stack.size() == 0) {
      System.out.println("Stack is empty");
      return null;
    } else {
      return stack.removeElementByIndex(stack.size() - 1);
    }
  }

  public void push(T t) {
    stack.addElement(t);
  }

}
