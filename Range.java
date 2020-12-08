import java.util.NoSuchElementException;
public class Range implements IntegerSequence {
  private int start, end, current;
  public Range(int a, int b) {
    start = a;
    end = b;
    current = a;
  }
  public void reset() {
    current = start;
  }
  public int length() {
    return end - start + 1;
  }
  public boolean hasNext() {
    return current <= end;
  }

  //@throws NoSuchElementException
  public int next() {
    if (!hasNext()) {
      throw new NoSuchElementException("You cannot travel further through this range");
    }
    int output = current;
    current ++;
    return output;
  }
}
