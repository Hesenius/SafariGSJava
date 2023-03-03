package manythings;

import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    // arrays are not the easiest/most readable things
    // in Java, "all type" goes to the left of the
    // variable being declared

    // all objects when allocated are filled with zero
    int [] ia = new int[3];

    // arrays once created are FIXED size -- headache!!!
    System.out.println("There are " + ia.length + " elements");
    // array subscripts are int type, zero-based, monotonic/continuous
    // max is always length - 1
    System.out.println("element zero is " + ia[0]);
    ia[0] = 99;
    System.out.println("element zero is " + ia[0]);
    System.out.println("the array is " + ia);
    System.out.println("the array is " + Arrays.toString(ia));

    for (int idx = 0; idx < ia.length; idx++) {
      System.out.println("element at " + idx + " is " + ia[idx]);
    }

    System.out.println("enhanced for loop");
    // works on arrays and "Iterables"
    for (int x : ia) {
      System.out.println("> " + x);
    }
  }
}
