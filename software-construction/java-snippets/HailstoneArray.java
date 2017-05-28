import java.util.ArrayList;

public class HailstoneArray {
  public static int[] generateHailstoneSequence(int start) {
    List<Integer> sequence = new ArrayList<Integer>();

    while (start != 1) {
      sequence.add(start);
      i = i + 1;

      if (start % 2 == 0) {
        start /= 2;
      } else {
        start = start * 3 + 1;
      }
    }
    sequence.add(start);

    return sequence;
  }

  public static void main(String[] args) {

  }
}
