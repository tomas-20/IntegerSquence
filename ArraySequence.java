import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence {
  private int currentIndex;
  private int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other) {
    currentIndex = 0;
    data = other;
  }
  public ArraySequence(IntegerSequence otherseq) {
    currentIndex = 0;
    data = new int[otherseq.length()];
    for (int i = 0; otherseq.hasNext(); i ++) {
      data[i] = otherseq.next();
    }
    otherseq.reset();
  }
  public void reset() {
    currentIndex = 0;
  }
  public int length() {
    return data.length;
  }
  public boolean hasNext() {
    return currentIndex < length();
  }
  public int next() {
    if (!hasNext()) {
      throw new NoSuchElementException("You cannot travel further through this array sequence");
    }
    int output = data[currentIndex];
    currentIndex ++;
    return output;
  }
}
