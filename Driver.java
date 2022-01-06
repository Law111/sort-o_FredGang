import java.util.ArrayList;

public class Driver {
  public static void main(String[] args) {
    ArrayList bubbleglen = new ArrayList<Integer>();
    bubbleglen.add(7);
      bubbleglen.add(1);
      bubbleglen.add(5);
      bubbleglen.add(12);
      bubbleglen.add(3);
      System.out.println( "ArrayList bubbleglen before sorting:\n" + bubbleglen );
      Sorts.bubbleSortV(bubbleglen);
      System.out.println( "ArrayList bubbleglen after sorting:\n" + bubbleglen );
  }
}
