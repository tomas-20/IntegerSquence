public class Test {
  public static void print(IntegerSequence list) {
    while (list.hasNext()) {
      System.out.print(list.next());
      if (list.hasNext()) {
        System.out.print(", ");
      }
    }
    System.out.println();
  }
  public static void main(String[] arr) {
    IntegerSequence r = new Range(10, 20);
    print(r);
    int[] nums = {1, 3, 5, 0, -1, 3, 9};
    IntegerSequence as = new ArraySequence(nums);
    print(as);
  }
}
