package mergeSort;

import java.util.Arrays;

public class Main {


  public static void main(String[] args) {
    MergeSort m = new MergeSort();

    int[] arr = {8,9,3,5,7,1,2,6};

    m.sort(arr);

    Arrays.stream(arr).forEach(System.out::println);

    MergeSortGeneric<String> msg = new MergeSortGeneric<>();

    String[] sa = {"f", "e", "d", "c", "b", "a"};

    msg.mergeSort(sa);

    Arrays.stream(sa).forEach(System.out::println);


  }

}
