package binarySearch;

public class Main {

  public static void main(String[] args) {

    BinarySearch b = new BinarySearch();

    int[] arr = {1,2,3,4,5,6,7};

    System.out.println(b.search(arr, 5));

    BinarySearchGeneric bsg = new BinarySearchGeneric();
    Character[] arr1 = {'f','g','e','b','a'};

    System.out.println(bsg.search(arr1, 'w'));


  }

}
