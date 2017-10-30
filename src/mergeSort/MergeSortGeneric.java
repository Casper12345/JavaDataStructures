package mergeSort;

import java.util.Arrays;

public class MergeSortGeneric<E extends Comparable> {

  public void mergeSort(E[] arr) {

    if (arr.length < 2) {
      return;
    }

    int middle = arr.length / 2;

    E[] arr1 = Arrays.copyOfRange(arr, 0, middle);

    E[] arr2 = Arrays.copyOfRange(arr, middle, arr.length);

    mergeSort(arr1);
    mergeSort(arr2);

    merge(arr1, arr2, arr);

  }

  private void merge(E[] arr1, E[] arr2, E[] arr) {
    int i = 0, j = 0;

    while (i + j < arr.length) {

      if (j == arr2.length || i < arr1.length && arr1[i].compareTo(arr2[j]) < 0) {
        arr[i + j] = arr1[i++];
      } else {
        arr[i + j] = arr2[j++];
      }

    }

  }


}
