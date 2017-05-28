
public class HailstoneArray {
  public static int[] generateHailstoneSequence(int start) {
    int[] sequence = new int[100]; // Not advised due to memory constraint
    int i = 0;

    while (start != 1) {
      sequence[i] = start;
      i = i + 1;

      if (start % 2 == 0) {
        start /= 2;
      } else {
        start = start * 3 + 1;
      }
    }
    sequence[i] = start;
    i = i + 1;

    return sequence;
  }

  public static void main(String[] args) {

  }
}
