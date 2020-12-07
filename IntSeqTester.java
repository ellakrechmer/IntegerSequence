public class IntSeqTester{
  public static void main(String[] args) {
    System.out.println("Range Testing:");
    IntegerSequence r = new Range(10,15);
    while(r.hasNext()){
      System.out.print(r.next());
      if( r.hasNext() ){
         System.out.print( ", " );
      }
    }
    System.out.println();
    System.out.println("ArraySequence Testing:");
    int[]nums = {1,3,5,0,-1,3,9};
    IntegerSequence as = new ArraySequence(nums);
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
    System.out.println();
  }
}
