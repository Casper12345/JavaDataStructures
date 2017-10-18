package graph;

/**
 * Created by Casper on 21/09/2017.
 */
public class TwoDimentionalGraph<T> {

  Node<T> start;

  public void create2DGraph(int x, int y) {

    for (int i = 1; i <= x; i++) {
      Node a = new Node<Integer>(i);
      a.addEdge(1, new Node<Integer>(i + 1));
      for (int j = 1; j <= y; j++) {

      }


    }

  }

}
