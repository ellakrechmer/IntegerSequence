import java.util.NoSuchElementException;
public class Range implements IntegerSequence {
  private int start,end,current;

  //@param start : the starting value (inclusive) which must be <= end.
  //@param end : the ending value which is also inclusive.
  public Range(int start,  int end){
    this.start=start;
    this.end=end;
    current=start-1;
  }

  public void reset(){
    current=start-1;
  }
  public int length(){
    return (end-start)+1;
  }
  public boolean hasNext(){
    if (current!=end) return true;
    else return false;
  }

  //@throws NoSuchElementException when hasNext() is false.
  public int next(){
    if (hasNext()==false) throw new NoSuchElementException();
    else {
      current++;
      return (current);
    }
  }

}
