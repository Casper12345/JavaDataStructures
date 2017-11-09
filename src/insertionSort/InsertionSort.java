package insertionSort;

import java.util.Comparator;

public class InsertionSort {

  public <E> void sort(E[] arr, Comparator<E> comparator) {

    int n = arr.length;
    for (int i = 1; i < n; ++i) {
      E key = arr[i];
      int j = i - 1;

      while (j >= 0 && comparator.compare(arr[j], key) > 0) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }

  }
}
