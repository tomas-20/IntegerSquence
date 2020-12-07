public class Test {
  public static void main(String[] arr) {
    IntegerSequence r = new Range(10, 20);
    while(r.hasNext()) {
      System.out.print(r.next());
      if(r.hasNext()) {
        System.out.print(", ");
      }
    }
    System.out.println();
  }
}
