package graph;

import java.util.List;

/**
 * Created by Casper on 21/09/2017.
 */
public class TwoDimentionalGraph<T> {


  private Node[][] grid;

  private void createGrid(int x, int y, List<Node> nodesToAdd) {

    grid = new Node[x][y];
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < y; j++) {
        grid[i][j] = nodesToAdd.get(i + j);
      }
    }
  }


  public void create2DGraph(int x, int y) {

    for (int r = 0; r < x; r++) {
      for (int c = 0; c < y; c++) {

        Node n = grid[r][c];

        List<Node> neighbors;

        neighbors = n.getEdges();

        if (r > 0) {     // has north
          neighbors.add(grid[r - 1][c]);
        }

        if (r < x - 1) { // has south
          neighbors.add(grid[r + 1][c]);
        }

        if (c > 0) {     // has west
          neighbors.add(grid[r][c - 1]);
        }

        if (c < y - 1) { // has east
          neighbors.add(grid[r][c + 1]);
        }

      }
    }

  }

}
