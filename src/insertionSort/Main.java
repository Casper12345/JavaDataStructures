package insertionSort;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) {

    InsertionSort i = new InsertionSort();

    Integer[] arr = {1,3,2,5,4,8,7};

    i.sort(arr, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1.hashCode(), o2.hashCode());
      }
    });

    Arrays.stream(arr).forEach(System.out::println);

  }

}
