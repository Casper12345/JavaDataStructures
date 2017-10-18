package graph;

/**
 * Created by Casper on 21/09/2017.
 */
public class Edge {

  private int weight;
  private Node a;
  private Node b;

  public Edge(int weight, Node a, Node b) {
    this.weight = weight;
    this.a = a;
    this.b = b;
  }

  public int getWeight() {
    return weight;
  }

  public Node getA() {
    return a;
  }

  public Node getB() {
    return b;
  }
}
