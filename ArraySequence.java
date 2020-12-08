import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence {
  int currentIndex;
  int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other){
    data = other;
    currentIndex = 0;
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
