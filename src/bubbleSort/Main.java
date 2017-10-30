package bubbleSort;

public class Main {

  public static void main(String[] args) {

    BubbleSort b = new BubbleSort();

    Integer[] arr = {6,4,1,3,9,5,7,6};

    b.sort(arr);

    for (int i : arr) {
      System.out.println(i);
    }


  }

}
