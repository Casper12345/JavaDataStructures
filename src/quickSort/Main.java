package quickSort;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {

    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(3);
    q.add(8);
    q.add(2);
    q.add(6);

    System.out.println(q);

    QuickSort.sort(q, (o1, o2) -> {
      if (o1.hashCode() > o2.hashCode()) {
        return 1;
      } else if (o1.hashCode() < o2.hashCode()) {
        return -1;
      } else {
        return 0;
      }
    });

    System.out.println(q);

  }

}
