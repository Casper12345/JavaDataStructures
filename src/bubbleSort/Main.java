package bubbleSort;

public class Main {

  public static void main(String[] args) {

    BubbleSort b = new BubbleSort();

    int[] arr = {1,2,3,3,4,5,6,6};

    b.sort(arr);

    for (int i : arr) {
      System.out.println(i);
    }


  }

}
