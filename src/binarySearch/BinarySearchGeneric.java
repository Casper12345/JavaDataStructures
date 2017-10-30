package binarySearch;

import java.util.Arrays;

public class BinarySearchGeneric<E extends Comparable> {


  public boolean search(E[] arr, E index) {

    int middle = arr.length / 2;

    if (arr[middle].compareTo(index) == 0) {
      return true;
    }

    if (middle == 0) {
      return false;
    } else {

      if (index.compareTo(arr[middle]) > 0) {
        return search(Arrays.copyOfRange(arr, middle, arr.length), index);
      } else {
        return search(Arrays.copyOfRange(arr, middle, arr.length), index);
      }

    }

  }

}
