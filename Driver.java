import java.util.ArrayList;

public class Driver {
  public static void main(String[] args) {

    /* BUBBLE SORT TESTS */
    /******************************************************/
    System.out.println("TESTING BUBBLE SORT...\n\n");
    ArrayList bubbleglen = new ArrayList<Integer>();
    /* Not best nor worst case of length 5 */
      System.out.println("Testing the 5 magic numbers...");
      bubbleglen.add(7);
      bubbleglen.add(1);
      bubbleglen.add(5);
      bubbleglen.add(12);
      bubbleglen.add(3);
      System.out.println( "ArrayList bubbleglen before sorting:\n" + bubbleglen );
      System.out.println( "Sorted version of bubbleglen:\n" + Sorts.bubble(bubbleglen));
      bubbleglen.clear();
    /* Worst case for length 20 */
      for(int i = 0; i < 20; i++) {
        bubbleglen.add(i);
      }
      System.out.println( "Testing best case scenario of bubble sort for length = 20...");
      System.out.println( "ArrayList bubbleglen before sorting:\n" + bubbleglen );
      System.out.println( "Commencing bubblesort...");
      System.out.println( "Sorted version of bubbleglen:\n" + Sorts.bubble(bubbleglen));
      bubbleglen.clear();
    /* Best case for length 20 */
      for(int i = 0; i < 20; i++) {
        bubbleglen.add(20-i);
      }
      System.out.println( "Testing worst case scenario of bubble sort for length = 20...");
      System.out.println( "ArrayList bubbleglen before sorting:\n" + bubbleglen );
      System.out.println( "Commencing bubblesort...");
      System.out.println( "Sorted version of bubbleglen:\n" + Sorts.bubble(bubbleglen));
      bubbleglen.clear();
    /* Random cases for length 20 */
    for(int i = 0; i < 3; i++) {
      bubbleglen = Sorts.populate(20, 1, 100);
      System.out.println( "Testing random case scenario of bubble sort for length = 20...");
      System.out.println( "ArrayList bubbleglen before sorting:\n" + bubbleglen );
      System.out.println( "Commencing bubblesort...");
      System.out.println( "Sorted version of bubbleglen:\n" + Sorts.bubble(bubbleglen));
      bubbleglen.clear();
    }
    /******************************************************/

    /* INSERTION SORT TESTS */
    /******************************************************/
    ArrayList insertionglen = new ArrayList<Integer>();
    System.out.println("\n\nTESTING INSERTION SORT...\n\n");
    /* Not best nor worst case of length 5 */
      System.out.println("Testing the 5 magic numbers...");
      insertionglen.add(7);
      insertionglen.add(1);
      insertionglen.add(5);
      insertionglen.add(12);
      insertionglen.add(3);
      System.out.println( "ArrayList insertionglen before sorting:\n" + insertionglen );
      System.out.println( "Sorted version of insertionglen:\n" + Sorts.insertion(insertionglen));
      insertionglen.clear();
    /* Worst case for length 20 */
      for(int i = 0; i < 20; i++) {
        insertionglen.add(i);
      }
      System.out.println( "Testing best case scenario of insertion sort for length = 20...");
      System.out.println( "ArrayList insertionglen before sorting:\n" + insertionglen );
      System.out.println( "Commencing insertionsort...");
      System.out.println( "Sorted version of insertionglen:\n" + Sorts.insertion(insertionglen));
      insertionglen.clear();
    /* Best case for length 20 */
      for(int i = 0; i < 20; i++) {
        insertionglen.add(20-i);
      }
      System.out.println( "Testing worst case scenario of insertion sort for length = 20...");
      System.out.println( "ArrayList insertionglen before sorting:\n" + insertionglen );
      System.out.println( "Commencing insertionsort...");
      System.out.println( "Sorted version of insertionglen:\n" + Sorts.insertion(insertionglen));
      insertionglen.clear();
      /* Random cases for length 20 */
      for(int i = 0; i < 3; i++) {
        insertionglen = Sorts.populate(20, 1, 100);
        System.out.println( "Testing random case scenario of insertion sort for length = 20...");
        System.out.println( "ArrayList insertionglen before sorting:\n" + insertionglen );
        System.out.println( "Commencing insertionsort...");
        System.out.println( "Sorted version of insertionglen:\n" + Sorts.insertion(insertionglen));
        insertionglen.clear();
      }

    /******************************************************/

    /* INSERTION SORT TESTS */
    /******************************************************/
    ArrayList selectionglen = new ArrayList<Integer>();
    System.out.println("\n\nTESTING SELECTION SORT...");
    System.out.println("Testing the 5 magic numbers...");
    selectionglen.add(7);
    selectionglen.add(1);
    selectionglen.add(5);
    selectionglen.add(12);
    selectionglen.add(3);
    System.out.println( "ArrayList selectionglen before sorting:\n" + selectionglen );
    System.out.println( "Sorted version of selectionglen:\n" + Sorts.selection(selectionglen));
    selectionglen.clear();
    /* Random cases for length 20 */
    for(int i = 0; i < 5; i++) {
      selectionglen = Sorts.populate(20, 1, 100);
      System.out.println( "Testing random case scenario of selection sort for length = 20...");
      System.out.println( "ArrayList selectionglen before sorting:\n" + selectionglen );
      System.out.println( "Commencing selectionsort...");
      System.out.println( "Sorted version of selectionglen:\n" + Sorts.selection(selectionglen));
      selectionglen.clear();
    }
  }
}
