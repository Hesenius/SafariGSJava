package usingswitch;

public class Example {
  public static void main(String[] args) {
    int x = 10;
    switch (x) { // int or smaller numeric type, enum, or String
      case 0: // NO DUPLICATES ALLOWED, MUST BE CONSTANTS
        System.out.println("It's zero");
        break;
      case 10:
      case 11:
      case 12:
        System.out.println("ten, eleven, or twelve");
        break;
      default:// default does not have to be last...
        System.out.println("something else");
        break;
    }

    System.out.println("and again using arrows...");
    // newer switch uses arrows, much better NOT in Java 11
    switch (x) { // int or smaller numeric type, enum, or String
      case 0 ->
        System.out.println("It's zero");
      case 10, 11, 12 -> {// requires ONE "statement/expression"
        System.out.println("ten, eleven, or twelve");
        System.out.println("the value is " + x);
      }
      default ->
        System.out.println("something else");
    }
    // more modern switch can also be an EXPRESSION resulting in a value
  }
}
