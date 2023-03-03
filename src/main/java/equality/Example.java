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
  }
}
