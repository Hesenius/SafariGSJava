package equality;

public class Example {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    int z = 10;
    System.out.println("x == y " + (x == y));
    System.out.println("x == z " + (x == z));
    System.out.println("x != z " + (x != z));

    String s1 = "Hello world!";
    String s2 = "Hello";
    s2 = s2 + " world!";
    System.out.println("s1 " + s1);
    System.out.println("s2 " + s2);
    // == is NOT suitable for "object comparison"
    System.out.println("s1 == s2 " + (s1 == s2));
    System.out.println("s1.equals(s2) " + (s1.equals(s2)));

    // BUT, Strings are immutable
    // makes a new String representing the result
    String s3 = s1.toUpperCase();
    System.out.println(s1);
    System.out.println(s3);

    // represent "changeable" text using StringBuilder
// NOPE, String is NOT StringBuilder
//    StringBuilder sb1 = "Hello world!";
    StringBuilder sb1 = new StringBuilder("Hello world!");
    StringBuilder sb2 = new StringBuilder("Hello world!");
    System.out.println("sb1 == sb2? " + (sb1 == sb2));
    System.out.println("sb1.equals(sb2)? " + sb1.equals(sb2));
    sb2.append(" It's a lovely day!");
    System.out.println(sb2);
  }
}
