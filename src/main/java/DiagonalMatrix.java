import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalMatrix {

  public static void main(String[] args) {

    System.out.println(Arrays.deepToString(makeDiagonalMatrix(5)));

    System.out.println("######################################");

    int size = 10;
    List<List<Integer>> result = diagonal(size);
    for (int i = 0; i < size; i++) {
      System.out.println(result.get(i));
    }
  }

  private static int[][] makeDiagonalMatrix(int size) {
    int[][] theMatrix = new int[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        theMatrix[i][j] = (i != j) ? 0 : 1;
      }
    }
    return theMatrix;
  }

  private static List<List<Integer>> diagonal(int size) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    for (int i = 0; i < size; i++) {
      List<Integer> row = new ArrayList<Integer>(size);
      for (int j = 0; j < size; j++) {
        if (i == j) {
          row.add(1);
        } else {
          row.add(0);
        }
      }
      result.add(row);
    }
    return result;
  }
}
