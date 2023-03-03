package loops;

import org.w3c.dom.ls.LSOutput;

public class Example {
  public static void main(String[] args) {
    // every language has "while" loops...
    int x = 3;
    while (x > 0) {
      // + is arithmetic usually but is also overloaded
      // for string concatenation "Hello" + " world!"
      // BUT ALSO, any string concatenation with non-string
      // automatically converts the non-string to text
      System.out.println("Value of x is " + x);
//      x = x - 1; // x is evaluatd TWICE
//      x -= 1; // x is evaluated exactly ONCE
      x--; // --x, x--, x++, ++x as other C-derived languages
    }
    System.out.println("-------------------");
    for (int y = 3; y > 0; y--) {
      System.out.printf("Value of y is %3d\n", y);
    }
    // scope of "formal parameters"--variables declared in PARENS
    // that are immediately followed by curlies...
    // from point of declaration to end of FOLLOWING curlies :)
//    System.out.println(y); // OUT OF SCOPE

    // also do-while
    do {
      System.out.println("x in do while is " + x);
    } while (x != 0);

    // also have "do this with all of these"


  }
}
