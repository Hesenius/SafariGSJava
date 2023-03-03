package overloads;

public class Example {
  // real name "show_int" kinda
  public static void show(int x) {
    System.out.println("x is " + x);
  }
  // real name "show_int_int" kinda
  public static void show(int x, int y) {
    System.out.println("x is " + x + " y is " + y);
  }

  public static void show(int ... many) {
    // /many is an array
    for (int v : many) {
      System.out.println("> " + v);
    }
  }

  public static void main(String[] args) {
    show(99);
    show(100, 101);
    show(100, 101, 102);
  }
}
