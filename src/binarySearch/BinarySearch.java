package binarySearch;

import org.bouncycastle.util.Arrays;

public class BinarySearch {


  public boolean search(int[] arr, int i) {

    int middle = arr.length / 2;

    if (arr[middle] == i) {
      return true;
    }

    if (middle == 0) {
      return false;
    } else {
      if (i > arr[middle]) {
        return search(Arrays.copyOfRange(arr, middle, arr.length), i);
      } else {
        return search(Arrays.copyOfRange(arr, 0, middle), i);

      }
    }
  }

}
