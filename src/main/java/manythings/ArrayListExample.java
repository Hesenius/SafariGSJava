package manythings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
  public static void showAll(List<String> als) {
    for (String s : als) {
      System.out.println(">> " + s);
    }
  }

  public static void main(String[] args) {
    // <String> is COMPILE TIME ONLY...
    // provides consistency of use checking
    List<String> stuff = new ArrayList<String>();
    // no subscript access
    stuff.add("Hello");
    stuff.add("Bonjour");

    // basic syntax does not validate what's added to the structure
//    stuff.add(99);
    System.out.println(stuff);
    System.out.println(stuff.get(0));

    // with "generics" <String>, cast is created for us by the compiler
    String s = stuff.get(0);

//    String s = (String)stuff.get(2);// not safe if this is int...
//    System.out.println(s);

    showAll(stuff);

    List<String> lls = new LinkedList<>(stuff);
    System.out.println(lls);
    showAll(lls);

    // List interface--check
    // exceptions
    // methods more generally
    // classes/objects
  }
}
