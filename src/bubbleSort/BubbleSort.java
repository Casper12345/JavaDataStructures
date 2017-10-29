package bubbleSort;

public class BubbleSort {


  public <E extends Comparable> void bubbleSort(E[] arr) {

    E temp;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr.length; j++) {

        if (arr[1 - j].compareTo(arr[j]) > 0) {
          temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        }

      }
    }
  }


}
