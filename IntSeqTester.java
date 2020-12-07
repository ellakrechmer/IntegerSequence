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
    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
    System.out.println();

    IntegerSequence r1 = new Range(10,20);
    IntegerSequence scan = new ArraySequence(r1);

    System.out.println("ArraySequence(seq):");
    while(scan.hasNext()){
      System.out.print(scan.next()+", ");
    }
    System.out.println();
  }
}
