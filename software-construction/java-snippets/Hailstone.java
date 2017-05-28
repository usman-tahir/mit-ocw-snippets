
public class Hailstone {
  public void generateHailstoneSequence(int start) {
    while (start != 1) {
      System.out.println(n);

      if (start % 2 == 0) {
        start /= 2;
      } else {
        start = start * 3 + 1;
      }
    }
    System.out.println(start);
  }

  public static void main(String[] args) {
    generateHailstoneSequence(3); // Example
  }
}
