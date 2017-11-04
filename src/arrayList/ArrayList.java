package arrayList;

/**
 * Created by Casper on 21/09/2017.
 */
public class ArrayList<T> {

  private T[] array = (T[]) new Object[0];

  public int size() {
    return array.length;
  }

  public void addElement(T element) {

    T[] helper = (T[]) new Object[array.length + 1];

    for (int i = 0; i < array.length; i++) {
      helper[i] = array[i];
    }

    helper[helper.length - 1] = element;

    array = helper;
  }

  public T removeElementByIndex(int index) {

    if (index < 0 || index > array.length - 1) {
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }

    T toReturn = array[index];

    T[] helper = (T[]) new Object[array.length - 1];

    int counter = 0;

    for (int i = 0; i < helper.length; i++) {
      if (i != index) {
        helper[i] = array[i + counter];
      } else {
        helper[i] = array[i + 1];
        counter++;
      }
    }

    array = helper;

    return toReturn;

  }

  public void printArray() {
    StringBuilder sb = new StringBuilder();

    sb.append("List(");

    for (int i = 0; i < array.length; i++) {

      if (i == array.length - 1) {
        sb.append(array[i]);
      } else {
        sb.append(array[i] + ", ");
      }

    }
    sb.append(")");

    System.out.println(sb.toString());
  }

  public T getElementByIndex(int index) {

    if (index < 0 || index > array.length - 1) {

      throw new IndexOutOfBoundsException("Index is out of bounds");
    }

    return array[index];

  }

}
