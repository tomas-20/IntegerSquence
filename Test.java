public class Test {
  public static void print(IntegerSequence seq) {
    while (seq.hasNext()) {
      System.out.print(seq.next());
      if (seq.hasNext()) {
        System.out.print(", ");
      }
    }
    seq.reset();
    System.out.println();
  }
  public static void main(String[] arr) {
    IntegerSequence r = new Range(10, 20);
    print(r);
    int[] nums = {1, 3, 5, 0, -1, 3, 9};
    IntegerSequence as = new ArraySequence(nums);
    print(as);
    ArraySequence r2 = new ArraySequence(r);
    print(r2);
  }
}
