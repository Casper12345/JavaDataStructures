import arrayList.ArrayList;

/**
 * Created by Casper on 20/09/2017.
 */
public class Main {

  public static void main(String[] args) {

    ArrayList<Integer> a = new ArrayList<>();

    a.addElement(1);
    a.addElement(2);
    a.addElement(3);
    a.addElement(4);
    a.addElement(5);
    a.printArray();
    a.removeElementByIndex(0);
    a.printArray();
    System.out.println(a.size());
    System.out.println(a.getElementByIndex(0));

    ArrayList<Integer> b = new ArrayList<>();

    System.out.println(b.getElementByIndex(0));

  }

}
