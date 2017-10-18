package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Casper on 21/09/2017.
 */
public class Node<E> {

  private List<Edge> edges = new ArrayList<>();

  private E info;

  public Node(E info) {
    this.info = info;
  }

  public List<Edge> getEdges() {
    return edges;
  }

  public E getInfo() {
    return info;
  }

  public void addEdge(int weight, Node b) {
    edges.add(new Edge(weight, this, b));
  }
}
