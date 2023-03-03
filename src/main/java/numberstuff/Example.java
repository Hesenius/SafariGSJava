package numberstuff;

public class Example {
  public static void main(String[] args) {
//    int x = 100;
    // underscores for grouping, like 2,000
//    long x = 3_000_000_000L;
    int x = 2_000_000_000;
    long y = x; // widening conversion OK

    // narrowing conversion from CONSTANT OK if it fits
//    short s = 20;
    short s = (short)2_000_000_000;  // a cast, force it
    System.out.println(s); // junk, it did NOT fit!!!

    // arithmetic: + - * / % -- remainder is not MOD
    // comparisons > < >= <= != ==
    // assignment operators, assigment has value
    // += -=

//    System.out.println(b); // not in scope, not declared yet
    int a = 100;
    int b = a + s;
    // arithmetic promotes the smaller value to the larger
    // but nothing is ever less than int!!!

    // Java does NOT have "truthy/falsy" i.e. if you want
    // a test (eg, in loops or if stuff) it MUST be boolean

    b = 99;
    if (a != 0) { // must be explicitly boolean type result here!
      System.out.println("a is not zero");
    } else {
      System.out.println("a must be zero");
    }

    // don't do this!!! Always use the curlies!!!
//    if (a > 1_000)
//      System.out.println("it's big... really big");
    if (a > 1_000) {
      System.out.println("it's big... really big");
    } else if (a > 50) {
      System.out.println("it's greater than 60, but not greater than 1,000");
    } else {
      System.out.println("less or equal to 50");
    }
    // java is a block-scoped language
    // variables come into scope at point of declaration
    // which does not have to be 'the top'
    // remain in scope to the end of the immediately enclosing
    // curly brace pair (generally)
    {
//      int b; // duplicate, already in scope
      int t = 99;
      System.out.println(t);
    }
//    System.out.println(t); // out of scope now!!!

  }
}
