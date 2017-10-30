package mergeSort;

import java.util.Arrays;

public class MergeSort {


  public void sort(int[] arr) {

    if (arr.length < 2) {
      return;
    }

    int middle = arr.length / 2;

    int[] arr1 = Arrays.copyOfRange(arr, 0, middle);
    int[] arr2 = Arrays.copyOfRange(arr, middle, arr.length);

    sort(arr1);
    sort(arr2);

    merge(arr1, arr2, arr);

  }

  private void merge(int[] arr1, int[] arr2, int[] arr) {

    int i = 0, j = 0;

    while (i + j < arr.length) {
      if (j == arr2.length || i < arr1.length && arr1[i] < arr2[j]) {
        arr[i + j] = arr1[i++];

      } else {

        arr[i + j] = arr2[j++];
      }

    }

  }

}
